/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dto;

import org.seckill.entity.SuccessKilled;

/**
 * 用户秒杀执行后的结果
 * 
 * @author wb-dumao
 * @version $Id: SeckillExecution.java, v 0.1 2016年9月1日 下午4:53:55 wb-dumao Exp $
 */
public class SeckillExecution {

    /**  */
    private long          seckillId;

    /** 秒杀状态 */
    private int           state;

    private String        stateInfo;

    /** 秒杀成功对象 */
    private SuccessKilled successKilled;

    /**
     * @param seckillId
     * @param state
     * @param stateInfo
     * @param successKilled
     */
    public SeckillExecution(long seckillId, int state, String stateInfo,
                            SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = state;
        this.stateInfo = stateInfo;
        this.successKilled = successKilled;
    }

    /**
     * @param seckillId
     * @param state
     * @param stateInfo
     */
    public SeckillExecution(long seckillId, int state, String stateInfo) {
        this.seckillId = seckillId;
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * Getter method for property <tt>seckillId</tt>.
     * 
     * @return property value of seckillId
     */
    public long getSeckillId() {
        return seckillId;
    }

    /**
     * Setter method for property <tt>seckillId</tt>.
     * 
     * @param seckillId value to be assigned to property seckillId
     */
    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * Getter method for property <tt>state</tt>.
     * 
     * @return property value of state
     */
    public int getState() {
        return state;
    }

    /**
     * Setter method for property <tt>state</tt>.
     * 
     * @param state value to be assigned to property state
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * Getter method for property <tt>stateInfo</tt>.
     * 
     * @return property value of stateInfo
     */
    public String getStateInfo() {
        return stateInfo;
    }

    /**
     * Setter method for property <tt>stateInfo</tt>.
     * 
     * @param stateInfo value to be assigned to property stateInfo
     */
    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    /**
     * Getter method for property <tt>successKilled</tt>.
     * 
     * @return property value of successKilled
     */
    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    /**
     * Setter method for property <tt>successKilled</tt>.
     * 
     * @param successKilled value to be assigned to property successKilled
     */
    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

}
