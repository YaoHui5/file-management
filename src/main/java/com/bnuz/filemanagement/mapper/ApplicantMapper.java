package com.bnuz.filemanagement.mapper;

import com.bnuz.filemanagement.model.Applicant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.xml.ws.ResponseWrapper;
import java.util.List;


@Mapper
public interface ApplicantMapper {
    public int add(Applicant applicant);

    public int deleteById(int id);

    public int updateById(Applicant applicant);

    public List<Applicant> getAll();

    public Applicant getById(int id);

//    public Applicant getByName(String name);
//
//    public Applicant getByIdCard(String idCard);
//
//    public Applicant getByMateName(String mateName);
//
//    public Applicant getByMateIdCard(String mateIdCard);

    public List<Applicant> selectByExample(Applicant applicant);
}