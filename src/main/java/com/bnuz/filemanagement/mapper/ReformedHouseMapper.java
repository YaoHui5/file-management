package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.model.ReformedHouse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReformedHouseMapper {

    public int add(ReformedHouse reformedHouse);

    public int updateByUid(ReformedHouse reformedHouse);

    public ReformedHouse getByUid(String uid);
}
