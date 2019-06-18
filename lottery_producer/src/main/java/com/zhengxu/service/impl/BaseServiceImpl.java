package com.zhengxu.service.impl;

import com.zhengxu.mapper.BaseMapper;
import com.zhengxu.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void add(T t) {
        baseMapper.insert(t);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(T t) {
        baseMapper.updateByPrimaryKey(t);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Serializable id) {
        baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public T getOne(Serializable id) {
        return (T) baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> getAll() {
        return baseMapper.selectAll();
    }
}
