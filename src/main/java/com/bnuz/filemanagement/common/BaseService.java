package com.bnuz.filemanagement.common;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    /**
     * 新增一个
     * @param t
     */
    void add(T t);

    /**
     *根据条件删除
     * @param t
     */
    void delete(T t);

    /**
     *根据id删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 修改
     * @param t
     */
    void update(T t);

    /**
     * 查找一个
     * @param t
     * @return
     */
    T findOne(T t);

    /**
     * 根据id查找一个
     * @param id
     * @return
     */
    T findById(Integer id);

    /**
     * 查找所有
     * @param t
     * @return
     */
    List<T> findAll(T t);

}
