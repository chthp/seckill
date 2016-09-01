/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.entity;

import java.util.Date;

/**
 * 
 * @author wb-dumao
 * @version $Id: Seckill.java, v 0.1 2016年7月18日 下午4:19:33 wb-dumao Exp $
 */
public class Seckill {

    private long   seckillId;
    private String name;
    private int    number;
    private Date   startTime;
    private Date   endTime;
    private Date   createTime;

    public Seckill() {

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
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>number</tt>.
     * 
     * @return property value of number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter method for property <tt>number</tt>.
     * 
     * @param number value to be assigned to property number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter method for property <tt>startTime</tt>.
     * 
     * @return property value of startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Setter method for property <tt>startTime</tt>.
     * 
     * @param startTime value to be assigned to property startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter method for property <tt>endTime</tt>.
     * 
     * @return property value of endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Setter method for property <tt>endTime</tt>.
     * 
     * @param endTime value to be assigned to property endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

}
