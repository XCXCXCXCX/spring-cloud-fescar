package com.alibaba.fescar.order.service;

import com.alibaba.fescar.order.dto.OrderDTO;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     */
    void createOrder(OrderDTO orderDTO);

}
