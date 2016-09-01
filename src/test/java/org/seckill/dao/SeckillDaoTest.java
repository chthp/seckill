/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * 
 * @author wb-dumao
 * @version $Id: SeckillDaoTest.java, v 0.1 2016年7月19日 下午4:51:39 wb-dumao Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SeckillDaoTest {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    /**
     * @throws Exception
     */
    @Test
    public void testReduceNumber() throws Exception {
        int updateCount = seckillDao.reduceNumber(1000L, new Date());
        System.out.println(updateCount);
    }

    @Test
    public void testQueryById() throws Exception {
        Seckill seckill = seckillDao.queryById(1000L);
        System.out.println(seckill.getName());
        Assert.assertEquals(seckill.getName(), "1000元秒杀iphone6");
    }

    @Test
    public void testQueryAll() throws Exception {
        /**
        15:16:50.494 [main] DEBUG o.m.s.t.SpringManagedTransaction - JDBC Connection [com.mchange.v2.c3p0.impl.NewProxyConnection@7ce026d3] will not be managed by Spring
        15:16:50.497 [main] DEBUG o.s.dao.SeckillDao.reduceNumber - ==>  Preparing: update seckill set number = number - 1 where seckill_id = ? and start_time <= ? and end_time >= ? and number > 0 
        15:16:50.518 [main] DEBUG o.s.dao.SeckillDao.reduceNumber - ==> Parameters: 1000(Long), 2016-09-01 15:16:50.263(Timestamp), 2016-09-01 15:16:50.263(Timestamp)
         */
        List<Seckill> list = seckillDao.queryAll(0, 100);
        for (Seckill seckill : list) {
            System.out.println(seckill.getName());
        }
    }

}
