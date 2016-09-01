/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dto;

/**
 * 暴露秒杀地址
 * 
 * @author wb-dumao
 * @version $Id: Exposer.java, v 0.1 2016年9月1日 下午4:42:56 wb-dumao Exp $
 */
public class Exposer {

    /** 是否开启 */
    private boolean exposed;

    /** 加密措施 */
    private String  md5;

    /** id */
    private long    seckillId;

    /** 系统当前时间 */
    private long    now;

    /** 开启时间 */
    private long    start;

    /** 结束时间 */
    private long    end;

    public Exposer() {

    }

    /**
     * @param exposed
     * @param md5
     * @param seckillId
     */
    public Exposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    /**
     * @param exposed
     * @param now
     * @param start
     * @param end
     */
    public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    /**
     * @param exposed
     * @param seckillId
     */
    public Exposer(boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    /**
     * Getter method for property <tt>exposed</tt>.
     * 
     * @return property value of exposed
     */
    public boolean isExposed() {
        return exposed;
    }

    /**
     * Setter method for property <tt>exposed</tt>.
     * 
     * @param exposed value to be assigned to property exposed
     */
    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    /**
     * Getter method for property <tt>md5</tt>.
     * 
     * @return property value of md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * Setter method for property <tt>md5</tt>.
     * 
     * @param md5 value to be assigned to property md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
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
     * Getter method for property <tt>now</tt>.
     * 
     * @return property value of now
     */
    public long getNow() {
        return now;
    }

    /**
     * Setter method for property <tt>now</tt>.
     * 
     * @param now value to be assigned to property now
     */
    public void setNow(long now) {
        this.now = now;
    }

    /**
     * Getter method for property <tt>start</tt>.
     * 
     * @return property value of start
     */
    public long getStart() {
        return start;
    }

    /**
     * Setter method for property <tt>start</tt>.
     * 
     * @param start value to be assigned to property start
     */
    public void setStart(long start) {
        this.start = start;
    }

    /**
     * Getter method for property <tt>end</tt>.
     * 
     * @return property value of end
     */
    public long getEnd() {
        return end;
    }

    /**
     * Setter method for property <tt>end</tt>.
     * 
     * @param end value to be assigned to property end
     */
    public void setEnd(long end) {
        this.end = end;
    }

}
