package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.mapper.HousingFileMapper;
import com.bnuz.filemanagement.model.HousingFile;
import com.bnuz.filemanagement.service.HousingFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingFileServiceImpl implements HousingFileService {

    @Autowired
    private HousingFileMapper housingFileMapper;


    @Override
    public int addHousingFile(HousingFile housingFile){
        return housingFileMapper.add(housingFile);
    }

    @Override
    public HousingFile findId(HousingFile housingFile){
        return housingFileMapper.findOne(housingFile);
    }

    @Override
    public HousingFile updateByExample(HousingFile housingFile){
        return housingFileMapper.update(housingFile);
    }
}
