package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.common.BaseServiceImpl;
import com.bnuz.filemanagement.mapper.ReformedHouseMapper;
import com.bnuz.filemanagement.model.ReformedHouse;
import com.bnuz.filemanagement.service.ReformedHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReformedHouseServiceImpl extends BaseServiceImpl<ReformedHouse,ReformedHouseMapper> implements ReformedHouseService {

    @Autowired
    private ReformedHouseMapper reformedHouseMapper;

//    @Override
//    public int addReformedHouse(ReformedHouse reformedHouse){
//        return reformedHouseMapper.add(reformedHouse);
//    }
//
//    @Override
//    public int updateReformedHouseByUid(String uid,ReformedHouse reformedHouse){
//        reformedHouse.setUid(uid);
//
//        return reformedHouseMapper.updateByUid(reformedHouse);
//    }
//
//    @Override
//    public ReformedHouse getReformedHouseByUid(String uid){
//        return reformedHouseMapper.getByUid(uid);
//    }


}
