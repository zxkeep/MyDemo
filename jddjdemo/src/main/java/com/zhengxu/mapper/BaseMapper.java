package com.zhengxu.mapper;


import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {
    void insert(T t);

    void update(T t);

    void delete(Serializable id);

    T selectOne(Serializable id);

    List<T> selectAll();
}
