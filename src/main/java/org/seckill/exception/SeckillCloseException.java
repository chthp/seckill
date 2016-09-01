/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.exception;

/**
 * 秒杀关闭异常
 * 
 * @author wb-dumao
 * @version $Id: SeckillCloseException.java, v 0.1 2016年9月1日 下午5:05:28 wb-dumao Exp $
 */
public class SeckillCloseException extends SeckillException {

    /** serialVersionUID */
    private static final long serialVersionUID = 1620390582941636829L;

    /**
     * @param message
     * @param cause
     */
    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public SeckillCloseException(String message) {
        super(message);
    }

}
