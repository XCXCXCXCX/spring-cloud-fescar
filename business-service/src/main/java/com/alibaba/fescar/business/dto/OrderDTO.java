package com.alibaba.fescar.business.dto;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public class OrderDTO{
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

    public Integer getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getMoney() {
        return money;
    }

    public OrderDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public OrderDTO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    public OrderDTO setCount(Integer count) {
        this.count = count;
        return this;
    }

    public OrderDTO setMoney(Integer money) {
        this.money = money;
        return this;
    }
}
