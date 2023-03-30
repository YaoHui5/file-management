package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.model.PurchaseFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseFileMapper {

    public int insert(PurchaseFile purchaseFile);
}
