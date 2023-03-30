package com.bnuz.filemanagement.service.impl;

import com.bnuz.filemanagement.mapper.PurchaseFileMapper;
import com.bnuz.filemanagement.model.PurchaseFile;
import com.bnuz.filemanagement.service.PurchaseFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseFileServiceImpl implements PurchaseFileService {


    @Autowired
    private PurchaseFileMapper purchaseFileMapper;

    @Override
    public int insertPurchaseFile(PurchaseFile purchaseFile){
        return purchaseFileMapper.insert(purchaseFile);
    }



}
