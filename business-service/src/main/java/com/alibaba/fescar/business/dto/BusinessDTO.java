package com.alibaba.fescar.business.dto;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public class BusinessDTO {

    private String userId;

    private String commodityCode;

    private Integer orderCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }
}
