/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.exception;

/**
 * 
 * @author wb-dumao
 * @version $Id: SeckillException.java, v 0.1 2016年9月1日 下午5:08:09 wb-dumao Exp $
 */
public class SeckillException extends RuntimeException {

    /** serialVersionUID */
    private static final long serialVersionUID = -3848327706412041512L;

    /**
     * @param message
     * @param cause
     */
    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public SeckillException(String message) {
        super(message);
    }

}
