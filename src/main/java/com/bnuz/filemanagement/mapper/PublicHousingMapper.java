package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.model.PublicHousing;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublicHousingMapper {

    public int insert(PublicHousing publicHousing);
}
