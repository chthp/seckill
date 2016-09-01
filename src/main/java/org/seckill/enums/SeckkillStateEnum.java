/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.seckill.enums;

/**
 * 
 * @author wb-dumao
 * @version $Id: SeckkillStateEnum.java, v 0.1 2016年9月1日 下午6:38:30 wb-dumao Exp $
 */
public enum SeckkillStateEnum {

                               /**  */
                               SUCCESS(1, "秒杀成功"),

                               /**  */
                               END(0, "秒杀结束"),

                               /**  */
                               REPEAT(-1, "重复秒杀"),

                               /**  */
                               INNER_ERROR(-2, "系统异常"),

                               /**  */
                               DATA_REWITE(-3, "数据窜改");

    /**  */
    private int    state;

    /**  */
    private String stateInfo;

    /**
     * @param state
     * @param stateInfo
     */
    private SeckkillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 
     * @param index
     * @return
     */
    public static SeckkillStateEnum stateOff(int index) {
        for (SeckkillStateEnum state : values()) {
            if (index == state.getState()) {
                return state;
            }
        }
        return null;
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
     * Getter method for property <tt>stateInfo</tt>.
     * 
     * @return property value of stateInfo
     */
    public String getStateInfo() {
        return stateInfo;
    }

}
