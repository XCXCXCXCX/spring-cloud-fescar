package com.alibaba.fescar.business.service;


import com.alibaba.fescar.business.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@FeignClient(name = "order", url = "http://localhost:11113/order")
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     */
    @RequestMapping(method = RequestMethod.PUT)
    void createOrder(OrderDTO orderDTO);

}
