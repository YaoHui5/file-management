package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.common.BaseServiceImpl;
import com.bnuz.filemanagement.mapper.HousingFileMapper;
import com.bnuz.filemanagement.model.HousingFile;
import com.bnuz.filemanagement.service.HousingFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HousingFileServiceImpl extends BaseServiceImpl<HousingFile,HousingFileMapper> implements HousingFileService
{

    @Autowired
    private HousingFileMapper housingFileMapper;

    @Override
    public HousingFile findOneByIdCard(String idCard) {
        return housingFileMapper.findOneByIdCard(idCard);
    }

//
//    @Override
//    public int addHousingFile(HousingFile housingFile){
//        return housingFileMapper.add(housingFile);
//    }
//
//    @Override
//    public int deleteHousingFile(Serializable housingFile){
//        return housingFileMapper.delete(housingFile);
//    }
//
//    @Override
//    public HousingFile findOne(Serializable housingFile){
//        return housingFileMapper.findOne(housingFile);
//    }
//
//    @Override
//    public List<HousingFile> addHousingFile(HousingFile housingFile){
//        return housingFileMapper.findAll(housingFile);
//    }
//
//    @Override
//    public int updateByExample(HousingFile housingFile){
//        return housingFileMapper.update(housingFile);
//    }
}
