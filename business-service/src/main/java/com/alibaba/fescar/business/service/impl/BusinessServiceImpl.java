package com.alibaba.fescar.business.service.impl;

import com.alibaba.fescar.business.dto.BusinessDTO;
import com.alibaba.fescar.business.dto.OrderDTO;
import com.alibaba.fescar.business.dto.StorageDTO;
import com.alibaba.fescar.business.service.BusinessService;
import com.alibaba.fescar.business.service.OrderService;
import com.alibaba.fescar.business.service.StorageService;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@Service
public class BusinessServiceImpl implements BusinessService{

    @Autowired
    private OrderService orderService;

    @Autowired
    private StorageService storageService;

    /**
     * 下单
     *
     * @param businessDTO
     */
    @GlobalTransactional(name = "purchase")
    @Override
    public void purchase(BusinessDTO businessDTO) {
        String userId = businessDTO.getUserId();
        String commodityCode = businessDTO.getCommodityCode();
        Integer orderCount = businessDTO.getOrderCount();
        Assert.notNull(businessDTO, "businessDTO");
        Assert.notNull(userId, "userId");
        Assert.notNull(commodityCode, "commodityCode");
        Assert.notNull(orderCount, "orderCount");
        storageService.updateStorage(new StorageDTO().setCommodityCode(commodityCode).setCount(orderCount));
        orderService.createOrder(new OrderDTO().setUserId(userId).setCommodityCode(commodityCode).setCount(orderCount));
    }
}
