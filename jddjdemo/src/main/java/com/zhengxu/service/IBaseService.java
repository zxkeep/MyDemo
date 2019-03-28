package com.zhengxu.service;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {
    void add(T t);

    void update(T t);

    void delete(Serializable id);

    T getOne(Serializable id);

    List<T> getAll();
}
