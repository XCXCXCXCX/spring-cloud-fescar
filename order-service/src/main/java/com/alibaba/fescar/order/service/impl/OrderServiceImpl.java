package com.alibaba.fescar.order.service.impl;

import com.alibaba.fescar.order.dto.AccountDTO;
import com.alibaba.fescar.order.dto.OrderDTO;
import com.alibaba.fescar.order.mapper.OrderMapper;
import com.alibaba.fescar.order.service.AccountService;
import com.alibaba.fescar.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.Random;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AccountService accountService;

    /**
     * 创建订单
     *
     * @param orderDTO
     */
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void createOrder(OrderDTO orderDTO) {
        String userId = orderDTO.getUserId();
        String commodityCode = orderDTO.getCommodityCode();
        Integer count = orderDTO.getCount();
        Assert.notNull(orderDTO, "orderDTO");
        Assert.notNull(userId, "userId");
        Assert.notNull(commodityCode, "commodityCode");
        Assert.notNull(count, "count");
        Integer money = count * 200;

        orderMapper.createOrder(userId, commodityCode, count, money);
        if(new Random().nextInt(10) == 1){
            throw new RuntimeException("unknown error");
        }

        accountService.updateAccount(new AccountDTO().setMoney(money).setUserId(userId));
    }
}
