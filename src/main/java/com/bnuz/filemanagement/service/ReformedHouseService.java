package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.model.ReformedHouse;

import java.util.Date;
import java.util.List;

public interface ReformedHouseService extends BaseService<ReformedHouse> {

//    int addReformedHouse(ReformedHouse reformedHouse);
//
//    int updateReformedHouseByUid(String uid,ReformedHouse reformedHouse);
//
//    ReformedHouse getReformedHouseByUid(String uid);\

    List<ReformedHouse> countByDate(String reformedDate);

//    List<ReformedHouse> countByStandard(int outStandard);
}
