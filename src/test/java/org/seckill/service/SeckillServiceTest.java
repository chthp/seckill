/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author wb-dumao
 * @version $Id: SeckillServiceTest.java, v 0.1 2016年9月7日 下午4:10:18 wb-dumao Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class SeckillServiceTest {

    /** logger */
    private Logger         logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void test_getSeckillList() {
        List<Seckill> result = seckillService.getSeckillList();
        logger.info("list={}", result);
    }

    @Test
    public void test_getById() {
        Seckill result = seckillService.getById(1000L);
        logger.info("seckill={}", result);
    }

    @Test
    public void test_exportSeckillUrl() {
        Exposer result = seckillService.exportSeckillUrl(1000L);
        logger.info("Exposer={}", result);
    }

    @Test
    public void test_executeSeckill() {
        SeckillExecution result;
        try {
            result = seckillService.executeSeckill(1000L, 15868885684L,
                "8bd3b7ea992c2b53bcea78eba8373227");
            logger.info("SeckillExecution={}", result);
        } catch (SeckillCloseException e1) {
            logger.info(e1.getMessage());
        } catch (RepeatKillException e2) {
            logger.info(e2.getMessage());
        } catch (SeckillException e) {
            logger.info(e.getMessage());
        }
    }

}
