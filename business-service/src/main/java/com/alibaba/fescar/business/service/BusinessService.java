package com.alibaba.fescar.business.service;

import com.alibaba.fescar.business.dto.BusinessDTO;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public interface BusinessService {

    /**
     * 下单
     * @param businessDTO
     */
    void purchase(BusinessDTO businessDTO);
}
