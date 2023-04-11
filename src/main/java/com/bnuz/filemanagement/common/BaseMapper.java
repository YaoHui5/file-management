package com.bnuz.filemanagement.common;


import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface BaseMapper<E> {

     void insert(E e);

     void delete(E e);

    void deleteById(Integer id);

     void update(E e);

    E findOne(E e);

    E findById(Integer id);

     List<E> findAll(E e);

}
