package com.alibaba.fescar.storage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@Mapper
public interface StorageMapper {

    /**
     * 更新库存
     * @param   commodityCode
     * @param   count
     * @return  effect row count
     */
    @Update("update storage_tbl set count = count - #{count} where commodity_code = #{commodityCode} and count > #{count}")
    int updateStorage(@Param("commodityCode") String commodityCode,@Param("count") Integer count);
}
