/*
*
* LotteryMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.mapper;

import com.zhengxu.domain.Lottery;
import java.util.List;

public interface LotteryMapper {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(Lottery record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    Lottery selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<Lottery> selectAll();

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByPrimaryKey(Lottery record);
}