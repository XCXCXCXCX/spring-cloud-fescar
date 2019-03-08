package com.alibaba.fescar.storage.service.impl;

import com.alibaba.fescar.storage.dto.StorageDTO;
import com.alibaba.fescar.storage.mapper.StorageMapper;
import com.alibaba.fescar.storage.service.StorageService;
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
public class StorageServiceImpl implements StorageService{

    @Autowired
    private StorageMapper storageMapper;

    /**
     * 更新库存
     *
     * @param storageDTO
     */
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void updateStorage(StorageDTO storageDTO) {
        String commodityCode = null;
        Integer count = null;
        Assert.notNull(storageDTO, "storageDTO");
        Assert.notNull(commodityCode = storageDTO.getCommodityCode(), "commodityCode");
        Assert.notNull(count = storageDTO.getCount(), "count");
        int row = storageMapper.updateStorage(commodityCode, count);
        if(row < 1){
            throw new RuntimeException("库存不足");
        }
        if(new Random().nextInt(10) == 1){
            throw new RuntimeException("unknown error");
        }
    }
}
