/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.entity;

import java.util.Date;

/**
 * 
 * @author wb-dumao
 * @version $Id: SuccessKilled.java, v 0.1 2016年7月18日 下午5:14:36 wb-dumao Exp $
 */
public class SuccessKilled {

    /**  */
    private long    seckillId;

    /**  */
    private long    userPhone;

    /**  */
    private short   state;

    /**  */
    private Date    createTime;

    /**  */
    private Seckill seckill;

    public SuccessKilled() {

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
     * Getter method for property <tt>userPhone</tt>.
     * 
     * @return property value of userPhone
     */
    public long getUserPhone() {
        return userPhone;
    }

    /**
     * Setter method for property <tt>userPhone</tt>.
     * 
     * @param userPhone value to be assigned to property userPhone
     */
    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * Getter method for property <tt>state</tt>.
     * 
     * @return property value of state
     */
    public short getState() {
        return state;
    }

    /**
     * Setter method for property <tt>state</tt>.
     * 
     * @param state value to be assigned to property state
     */
    public void setState(short state) {
        this.state = state;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     * 
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     * 
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>seckill</tt>.
     * 
     * @return property value of seckill
     */
    public Seckill getSeckill() {
        return seckill;
    }

    /**
     * Setter method for property <tt>seckill</tt>.
     * 
     * @param seckill value to be assigned to property seckill
     */
    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        s.append("\"seckillId\":\"" + seckillId);
        s.append("\",\"userPhone\":\"" + userPhone);
        s.append("\",\"state\":\"" + state);
        s.append("\",\"createTime\":\"" + createTime);
        s.append("\",\"seckill\":" + seckill);
        s.append("}");
        return s.toString();
    }

}
