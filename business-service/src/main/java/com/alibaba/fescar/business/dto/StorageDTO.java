package com.alibaba.fescar.business.dto;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public class StorageDTO{

    private Integer id;

    private String commodityCode;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public Integer getCount() {
        return count;
    }

    public StorageDTO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    public StorageDTO setCount(Integer count) {
        this.count = count;
        return this;
    }
}
