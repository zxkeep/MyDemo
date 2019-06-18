/*
*
* WinningCodeMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.mapper;

import com.zhengxu.domain.WinningCode;
import java.util.List;

public interface WinningCodeMapper {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(WinningCode record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    WinningCode selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<WinningCode> selectAll();

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByPrimaryKey(WinningCode record);
}