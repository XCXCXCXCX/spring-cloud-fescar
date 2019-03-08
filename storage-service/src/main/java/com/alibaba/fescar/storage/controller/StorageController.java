package com.alibaba.fescar.storage.controller;

import com.alibaba.fescar.storage.dto.StorageDTO;
import com.alibaba.fescar.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@RestController("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping
    public ResponseEntity<?> update(@RequestBody StorageDTO storageDTO){
        storageService.updateStorage(storageDTO);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }

}
