package com.alibaba.fescar.order.dto;


/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public class AccountDTO{

    private Integer id;

    private String userId;

    private Integer money;

    public Integer getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getMoney() {
        return money;
    }

    public AccountDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public AccountDTO setMoney(Integer money) {
        this.money = money;
        return this;
    }

}
