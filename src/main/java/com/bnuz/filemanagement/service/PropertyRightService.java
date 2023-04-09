package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.model.PropertyRight;

public interface PropertyRightService {

    int addPropertyRight(PropertyRight propertyRight);

    int updatePropertyRightByUid(String uid,PropertyRight propertyRight);

}
