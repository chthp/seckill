/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author wb-dumao
 * @version $Id: SuccessKilledDaoTest.java, v 0.1 2016年9月1日 下午3:18:25 wb-dumao Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void test_insertSuccessKilled() throws Exception {
        int insertCount = successKilledDao.insertSuccessKilled(1001L, 15868885684L);
        System.out.println(insertCount);
    }

    @Test
    public void test_queryByIdWithSeckill() throws Exception {
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(1001L, 15868885684L);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());

    }

}
