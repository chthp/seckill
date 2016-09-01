/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.service.impl;

import java.util.Date;
import java.util.List;

import org.seckill.dao.SeckillDao;
import org.seckill.dao.SuccessKilledDao;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessKilled;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

/**
 * 
 * @author wb-dumao
 * @version $Id: SeckillServiceImpl.java, v 0.1 2016年9月1日 下午5:46:31 wb-dumao Exp $
 */
public class SeckillServiceImpl implements SeckillService {

    /** logger */
    private Logger           logger = LoggerFactory.getLogger(this.getClass());

    /**  */
    private SeckillDao       seckillDao;

    /**  */
    private SuccessKilledDao successKilledDao;

    /** 盐 */
    private final String     slat   = "qewrqwerqw";

    /** 
     * @see org.seckill.service.SeckillService#getSeckillList()
     */
    public List<Seckill> getSeckillList() {
        return seckillDao.queryAll(0, 4);
    }

    /** 
     * @see org.seckill.service.SeckillService#getById(long)
     */
    public Seckill getById(long seckillId) {
        return seckillDao.queryById(seckillId);
    }

    /** 
     * @see org.seckill.service.SeckillService#exportSeckillUrl(long)
     */
    public Exposer exportSeckillUrl(long seckillId) {

        Seckill seckill = seckillDao.queryById(seckillId);

        if (seckill == null) {
            return new Exposer(false, seckillId);
        }

        Date startTime = seckill.getStartTime();
        Date endTime = seckill.getEndTime();
        Date nowTime = new Date();
        if (nowTime.getTime() < startTime.getTime() || nowTime.getTime() > endTime.getTime()) {
            return new Exposer(false, seckillId, nowTime.getTime(), startTime.getTime(),
                endTime.getTime());
        }

        String md5 = getMd5(seckillId);
        return new Exposer(true, md5, seckillId);
    }

    /**
     * 
     * @param seckillId
     * @return
     */
    private String getMd5(long seckillId) {
        String base = seckillId + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    /** 
     * @see org.seckill.service.SeckillService#executeSeckill(long, long, java.lang.String)
     */
    /** 
     * @see org.seckill.service.SeckillService#executeSeckill(long, long, java.lang.String)
     */
    public SeckillExecution executeSeckill(long seckillId, long userPhone,
                                           String md5) throws SeckillException, RepeatKillException,
                                                       SeckillCloseException {
        if (md5 == null || !md5.equals(getMd5(seckillId))) {
            throw new SeckillException("seckill data rewrite");
        }

        try {

            // 减库存
            Date nowTime = new Date();
            int updateCount = seckillDao.reduceNumber(seckillId, nowTime);
            // 没有更新到记录，秒杀结束
            if (updateCount <= 0) {
                throw new SeckillCloseException("seckill close");
            }

            // 记录购买行为
            int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
            // 重复秒杀
            if (insertCount <= 0) {
                throw new RepeatKillException("Repeat kill");
            }

            // 
            SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId,
                userPhone);

            return new SeckillExecution(seckillId, 1, "秒杀成功", successKilled);

        } catch (SeckillCloseException e1) {
            throw e1;
        } catch (RepeatKillException e2) {
            throw e2;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SeckillException("seckill error" + e.getMessage());
        }
    }

}
