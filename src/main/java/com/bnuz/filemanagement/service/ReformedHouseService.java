package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.model.ReformedHouse;

public interface ReformedHouseService {

    int addReformedHouse(ReformedHouse reformedHouse);

    int updateReformedHouseByUid(String uid,ReformedHouse reformedHouse);

    ReformedHouse getReformedHouseByUid(String uid);
}
