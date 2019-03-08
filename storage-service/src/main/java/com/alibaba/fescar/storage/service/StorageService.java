package com.alibaba.fescar.storage.service;

import com.alibaba.fescar.storage.dto.StorageDTO;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public interface StorageService {

    /**
     * 更新库存
     * @param storageDTO
     */
    void updateStorage(StorageDTO storageDTO);

}
