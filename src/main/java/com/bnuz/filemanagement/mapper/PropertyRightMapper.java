package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.model.PropertyRight;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PropertyRightMapper {

    public int add(PropertyRight propertyRight);

    public int updateByUid(PropertyRight propertyRight);

}
