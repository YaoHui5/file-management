package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.model.HousingFile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HousingFileMapper {

    public int add(HousingFile housingFile);

}
