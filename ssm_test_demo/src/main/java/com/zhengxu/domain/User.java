/*
*
* User.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-06-18
*/
package com.zhengxu.domain;

public class User {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名字
     */
    private String useName;

    /**
     * 用户手机号
     */
    private String usePhone;

    /**
     * 用户性别
     */
    private Boolean useSex;

    /**
     * 用户年龄
     */
    private Integer useAge;

    /**
     * 用户抽奖号码
     */
    private String useLotteryNumber;

    /**
     * 数据是否逻辑删除（1==是  2==否）
     */
    private Integer dataDelete;

    /**
     * 用户id
     * @return USE_ID 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 用户id
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户名字
     * @return USE_NAME 用户名字
     */
    public String getUseName() {
        return useName;
    }

    /**
     * 用户名字
     * @param useName 用户名字
     */
    public void setUseName(String useName) {
        this.useName = useName == null ? null : useName.trim();
    }

    /**
     * 用户手机号
     * @return USE_PHONE 用户手机号
     */
    public String getUsePhone() {
        return usePhone;
    }

    /**
     * 用户手机号
     * @param usePhone 用户手机号
     */
    public void setUsePhone(String usePhone) {
        this.usePhone = usePhone == null ? null : usePhone.trim();
    }

    /**
     * 用户性别
     * @return USE_SEX 用户性别
     */
    public Boolean getUseSex() {
        return useSex;
    }

    /**
     * 用户性别
     * @param useSex 用户性别
     */
    public void setUseSex(Boolean useSex) {
        this.useSex = useSex;
    }

    /**
     * 用户年龄
     * @return USE_AGE 用户年龄
     */
    public Integer getUseAge() {
        return useAge;
    }

    /**
     * 用户年龄
     * @param useAge 用户年龄
     */
    public void setUseAge(Integer useAge) {
        this.useAge = useAge;
    }

    /**
     * 用户抽奖号码
     * @return USE_LOTTERY_NUMBER 用户抽奖号码
     */
    public String getUseLotteryNumber() {
        return useLotteryNumber;
    }

    /**
     * 用户抽奖号码
     * @param useLotteryNumber 用户抽奖号码
     */
    public void setUseLotteryNumber(String useLotteryNumber) {
        this.useLotteryNumber = useLotteryNumber == null ? null : useLotteryNumber.trim();
    }

    /**
     * 数据是否逻辑删除（1==是  2==否）
     * @return DATA_DELETE 数据是否逻辑删除（1==是  2==否）
     */
    public Integer getDataDelete() {
        return dataDelete;
    }

    /**
     * 数据是否逻辑删除（1==是  2==否）
     * @param dataDelete 数据是否逻辑删除（1==是  2==否）
     */
    public void setDataDelete(Integer dataDelete) {
        this.dataDelete = dataDelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", useName='" + useName + '\'' +
                ", usePhone='" + usePhone + '\'' +
                ", useSex=" + useSex +
                ", useAge=" + useAge +
                ", useLotteryNumber='" + useLotteryNumber + '\'' +
                ", dataDelete=" + dataDelete +
                '}';
    }
}