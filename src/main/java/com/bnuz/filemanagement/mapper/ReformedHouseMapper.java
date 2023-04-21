package com.bnuz.filemanagement.mapper;


import com.bnuz.filemanagement.common.BaseMapper;
import com.bnuz.filemanagement.model.ReformedHouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface ReformedHouseMapper extends BaseMapper<ReformedHouse> {

//    public int add(ReformedHouse reformedHouse);
//
//    public int updateByUid(ReformedHouse reformedHouse);
//
//    public ReformedHouse getByUid(String uid);

    public List<ReformedHouse> countByDate(String reformedDate);

//    public int countByStandard(Boolean outStandard);

}
