/*
*
* UserCodeRecordMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.mapper;

import com.zhengxu.domain.UserCodeRecord;
import java.util.List;

public interface UserCodeRecordMapper {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(UserCodeRecord record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    UserCodeRecord selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<UserCodeRecord> selectAll();

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByPrimaryKey(UserCodeRecord record);
}