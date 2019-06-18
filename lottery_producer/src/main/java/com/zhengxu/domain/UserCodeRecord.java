/*
*
* UserCodeRecord.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.domain;

public class UserCodeRecord {
    /**
     * 用户抽奖码id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer useId;

    /**
     * 用户抽奖码
     */
    private String useWinCode;

    /**
     * 用户抽奖码id
     * @return UL_ID 用户抽奖码id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 用户抽奖码id
     * @param id 用户抽奖码id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return USE_ID 用户id
     */
    public Integer getUseId() {
        return useId;
    }

    /**
     * 用户id
     * @param useId 用户id
     */
    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    /**
     * 用户抽奖码
     * @return USE_WIN_CODE 用户抽奖码
     */
    public String getUseWinCode() {
        return useWinCode;
    }

    /**
     * 用户抽奖码
     * @param useWinCode 用户抽奖码
     */
    public void setUseWinCode(String useWinCode) {
        this.useWinCode = useWinCode == null ? null : useWinCode.trim();
    }
}