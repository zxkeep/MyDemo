/*
*
* UserMapper.java
* Copyright(C) 2017-2020公司
* @date 2019-06-18
*/
package com.zhengxu.mapper;

import com.zhengxu.domain.User;
import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<User> selectAll();

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByPrimaryKey(User record);
}