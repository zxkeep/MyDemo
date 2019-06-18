/*
*
* Lottery.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.domain;

public class Lottery {
    /**
     * 奖品id
     */
    private Integer id;

    /**
     * 奖品名
     */
    private String lotteryName;

    /**
     * 奖品价值
     */
    private Integer lotteryPrice;

    /**
     * 数据是否逻辑删除（1== 是 2==否 默认2）
     */
    private Integer dataDelete;

    /**
     * 奖品id
     * @return LOTTERY_ID 奖品id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 奖品id
     * @param id 奖品id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 奖品名
     * @return LOTTERY_NAME 奖品名
     */
    public String getLotteryName() {
        return lotteryName;
    }

    /**
     * 奖品名
     * @param lotteryName 奖品名
     */
    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    /**
     * 奖品价值
     * @return LOTTERY_PRICE 奖品价值
     */
    public Integer getLotteryPrice() {
        return lotteryPrice;
    }

    /**
     * 奖品价值
     * @param lotteryPrice 奖品价值
     */
    public void setLotteryPrice(Integer lotteryPrice) {
        this.lotteryPrice = lotteryPrice;
    }

    /**
     * 数据是否逻辑删除（1== 是 2==否 默认2）
     * @return DATA_DELETE 数据是否逻辑删除（1== 是 2==否 默认2）
     */
    public Integer getDataDelete() {
        return dataDelete;
    }

    /**
     * 数据是否逻辑删除（1== 是 2==否 默认2）
     * @param dataDelete 数据是否逻辑删除（1== 是 2==否 默认2）
     */
    public void setDataDelete(Integer dataDelete) {
        this.dataDelete = dataDelete;
    }
}