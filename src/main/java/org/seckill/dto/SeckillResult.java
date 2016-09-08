/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.dto;

/**
 * 
 * @author wb-dumao
 * @version $Id: SeckillResult.java, v 0.1 2016年9月8日 上午10:44:18 wb-dumao Exp $
 */
public class SeckillResult<T> {

    private boolean success;

    private T       data;

    private String  error;

    /**
     * @param success
     * @param data
     */
    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /**
     * @param success
     * @param error
     */
    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    /**
     * Getter method for property <tt>success</tt>.
     * 
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     * 
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>data</tt>.
     * 
     * @return property value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     * 
     * @param data value to be assigned to property data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter method for property <tt>error</tt>.
     * 
     * @return property value of error
     */
    public String getError() {
        return error;
    }

    /**
     * Setter method for property <tt>error</tt>.
     * 
     * @param error value to be assigned to property error
     */
    public void setError(String error) {
        this.error = error;
    }

}
