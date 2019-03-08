package com.alibaba.fescar.storage.po;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public class Storage {

    private Integer id;

    private String commodityCode;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
