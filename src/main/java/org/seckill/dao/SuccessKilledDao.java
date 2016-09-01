/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * 
 * @author wb-dumao
 * @version $Id: SuccessKilledDao.java, v 0.1 2016年7月18日 下午5:21:01 wb-dumao Exp $
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
