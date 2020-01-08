package com.zhengxu.mapper;


import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByPrimaryKey(Serializable id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(T record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    T selectByPrimaryKey(Serializable id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<T> selectAll();

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByPrimaryKey(T record);
}
