/*
*
* WinningCode.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.domain;

public class WinningCode {
    /**
     * 中奖编号id
     */
    private Integer id;

    /**
     * 中奖编码
     */
    private String winningNumber;

    /**
     * 数据是否删除（1==是 2==否 默认2）
     */
    private Integer dataDelete;

    /**
     * 中奖编号id
     * @return WINNING_ID 中奖编号id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 中奖编号id
     * @param id 中奖编号id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 中奖编码
     * @return WINNING_NUMBER 中奖编码
     */
    public String getWinningNumber() {
        return winningNumber;
    }

    /**
     * 中奖编码
     * @param winningNumber 中奖编码
     */
    public void setWinningNumber(String winningNumber) {
        this.winningNumber = winningNumber == null ? null : winningNumber.trim();
    }

    /**
     * 数据是否删除（1==是 2==否 默认2）
     * @return DATA_DELETE 数据是否删除（1==是 2==否 默认2）
     */
    public Integer getDataDelete() {
        return dataDelete;
    }

    /**
     * 数据是否删除（1==是 2==否 默认2）
     * @param dataDelete 数据是否删除（1==是 2==否 默认2）
     */
    public void setDataDelete(Integer dataDelete) {
        this.dataDelete = dataDelete;
    }
}