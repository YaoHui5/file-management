package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.model.HousingFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HousingFileMapper {

    public int add(HousingFile housingFile);

    public HousingFile findOne(HousingFile housingFile);

    public HousingFile update(HousingFile housingFile);

}
