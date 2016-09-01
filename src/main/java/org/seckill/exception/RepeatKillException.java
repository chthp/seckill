/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.exception;

/**
 * 重复秒杀异常
 * 
 * @author wb-dumao
 * @version $Id: RepeatKillException.java, v 0.1 2016年9月1日 下午5:00:42 wb-dumao Exp $
 */
public class RepeatKillException extends SeckillException {

    /** serialVersionUID */
    private static final long serialVersionUID = -7588706798824576584L;

    /**
     * @param message
     * @param cause
     */
    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public RepeatKillException(String message) {
        super(message);
    }

}
