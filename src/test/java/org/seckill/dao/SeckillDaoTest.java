/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private SeckillDao seckillDao;

    /**
     * @throws Exception
     */
    @Test
    public void testReduceNumber() throws Exception {

    }

    @Test
    public void testQueryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        Assert.assertEquals(seckill.getName(), "1000元秒杀iphone6");
    }

    @Test
    public void testQueryAll() throws Exception {

    }

}
