package com.zhengxu.service.impl;

import com.zhengxu.domain.Product;
import com.zhengxu.domain.User;
import com.zhengxu.mapper.ProductMapper;
import com.zhengxu.service.UserService;
import com.zhengxu.utils.RedisCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {


}
