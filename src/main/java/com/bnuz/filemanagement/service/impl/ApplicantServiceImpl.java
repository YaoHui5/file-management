package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.mapper.ApplicantMapper;
import com.bnuz.filemanagement.model.Applicant;
import com.bnuz.filemanagement.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantMapper applicantMapper;

    @Override
    public List<Applicant> getAll(){
        return applicantMapper.getAll();
    }

    @Override
    public Applicant getApplicantById(int id){
        return applicantMapper.getById(id);
    }

    @Override
    public int deleteApplicantById(int id){
        return applicantMapper.deleteById(id);
    }

    @Override
    public int addApplicant(Applicant applicant){
        return applicantMapper.add(applicant);
    }

    @Override
    public int updateApplicantById(int id,Applicant applicant){
        applicant.setId(id);
        return applicantMapper.updateById(applicant);
    }


    @Override
    public List<Applicant> selectApplicantByExample(Applicant applicant){
        return applicantMapper.selectByExample(applicant);
    }

//    @Override
//    public Applicant getApplicantByName(String name){
//        return applicantMapper.getByName(name);
//    }
//
//    @Override
//    public Applicant getApplicantByIdCard(String idCard){
//        return applicantMapper.getByIdCard(idCard);
//    }
//
//    @Override
//    public Applicant getApplicantByMateName(String mateName){
//        return applicantMapper.getByMateName(mateName);
//    }
//
//    @Override
//    public Applicant getApplicantByMateIdCard(String mateIdCard){
//        return applicantMapper.getByMateIdCard(mateIdCard);
//    }


}
