package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.model.HousingFile;
import com.bnuz.filemanagement.service.impl.HousingFileServiceImpl;

import java.util.List;

public interface HousingFileService {

    int addHousingFile(HousingFile housingFile);

    HousingFile findId(HousingFile housingFile);

    HousingFile updateByExample(HousingFile housingFile);
}
