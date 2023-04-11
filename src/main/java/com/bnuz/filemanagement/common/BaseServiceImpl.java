package com.bnuz.filemanagement.common;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T extends BaseBean,E extends BaseMapper<T>> implements BaseService<T> {


    @Autowired
    private E e;

    @Override
    public void add(T t){
        e.insert(t);
    }

    @Override
    public void delete(T t){
        e.delete(t);
    }

    @Override
    public void deleteById(Integer id){
        e.deleteById(id);
    }

    @Override
    public void update(T t){
        e.update(t);
    }

    @Override
    public List<T> findAll(T t){
       return e.findAll(t);
    }

    @Override
    public T findOne(T t){
        return e.findOne(t);
    }


    public T findById(Integer id){
        return e.findById(id);
    }


    public E getMapper(){
        return e;
    }

}
