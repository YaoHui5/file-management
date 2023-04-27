package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.model.Applicant;
import com.bnuz.filemanagement.model.HousingFile;

public interface HousingFileService extends BaseService<HousingFile> {

    HousingFile findOneByIdCard(String idCard);

//    int addHousingFile(HousingFile housingFile);
//
//    int deleteHousingFile(Serializable housingFile);
//
//    HousingFile findOne(HousingFile housingFile);
//
//    List<HousingFile> findAll(HousingFile housingFile);
//
//    int updateByExample(HousingFile housingFile);
}
