package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.common.BaseServiceImpl;
import com.bnuz.filemanagement.mapper.PropertyRightMapper;
import com.bnuz.filemanagement.model.PropertyRight;
import com.bnuz.filemanagement.service.PropertyRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyRightServiceImpl extends BaseServiceImpl<PropertyRight,PropertyRightMapper> implements PropertyRightService {

    @Autowired
    private PropertyRightMapper propertyRightMapper;

//    @Override
//    public int addPropertyRight(PropertyRight propertyRight){
//        return propertyRightMapper.add(propertyRight);
//    }
//
//    @Override
//    public int updatePropertyRightByUid(String uid,PropertyRight propertyRight){
//        propertyRight.setUid(uid);
//
//        return propertyRightMapper.updateByUid(propertyRight);
//
//    }
}
