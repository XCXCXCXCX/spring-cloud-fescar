package com.alibaba.fescar.account.service;

import com.alibaba.fescar.account.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public interface AccountService {

    /**
     * 账户余额更新
     * @param accountDTO
     */
    void updateAccount(AccountDTO accountDTO);

}
