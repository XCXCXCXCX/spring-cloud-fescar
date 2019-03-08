package com.alibaba.fescar.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@Mapper
public interface AccountMapper {

    /**
     * 账户余额更新
     * @param   userId
     * @param   money
     * @return  money
     */
    @Update("update account_tbl set money = money - #{money} where user_id = #{userId} and money > #{money}")
    int updateAccount(@Param("userId")String userId, @Param("money") Integer money);

}
