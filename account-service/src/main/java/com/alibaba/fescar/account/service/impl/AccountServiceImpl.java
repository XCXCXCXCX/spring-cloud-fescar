package com.alibaba.fescar.account.service.impl;

import com.alibaba.fescar.account.dto.AccountDTO;
import com.alibaba.fescar.account.mapper.AccountMapper;
import com.alibaba.fescar.account.service.AccountService;
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
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 账户余额更新
     *
     * @param accountDTO
     */
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void updateAccount(AccountDTO accountDTO) {
        String userId = accountDTO.getUserId();
        Integer money = accountDTO.getMoney();
        Assert.notNull(accountDTO, "accountDTO");
        Assert.notNull(userId, "userId");
        Assert.notNull(money, "money");
        int row = accountMapper.updateAccount(userId, money);
        if(row < 1){
            throw new RuntimeException("账户余额不足");
        }
        if(new Random().nextInt(10) < 1){
            throw new RuntimeException("unknown error");
        }
    }
}
