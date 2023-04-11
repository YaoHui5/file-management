package com.bnuz.filemanagement.service.impl;

import com.bnuz.filemanagement.common.BaseServiceImpl;
import com.bnuz.filemanagement.mapper.PublicHousingMapper;
import com.bnuz.filemanagement.model.PublicHousing;
import com.bnuz.filemanagement.service.PublicHousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicHousingServiceImpl extends BaseServiceImpl<PublicHousing,PublicHousingMapper> implements PublicHousingService {


    @Autowired
    private PublicHousingMapper publicHousingMapper;

//    @Override
//    public int insertPublicHousing(PublicHousing publicHousing){
//        return publicHousingMapper.insert(publicHousing);
//    }



}
