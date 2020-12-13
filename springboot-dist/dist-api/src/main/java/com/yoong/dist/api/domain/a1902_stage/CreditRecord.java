package com.yoong.dist.api.domain.a1902_stage;

import java.util.Date;

public class CreditRecord {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long version;

    private Long apiServiceId;

    private Long apiSendId;

    private String appId;

    private String orderNo;

    private String bankId;

    private String customerName;

    private String certNo;

    private String phoneNum;

    private Integer orderStatus;

    private Date applyCreditDate;

    private String estageOrderNo;

    private Integer callbackStatus;

    private Date callbackDate;

    private String callbackOpinion;

    private Integer delFlag;

    private String callbackMsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getApiServiceId() {
        return apiServiceId;
    }

    public void setApiServiceId(Long apiServiceId) {
        this.apiServiceId = apiServiceId;
    }

    public Long getApiSendId() {
        return apiSendId;
    }

    public void setApiSendId(Long apiSendId) {
        this.apiSendId = apiSendId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getApplyCreditDate() {
        return applyCreditDate;
    }

    public void setApplyCreditDate(Date applyCreditDate) {
        this.applyCreditDate = applyCreditDate;
    }

    public String getEstageOrderNo() {
        return estageOrderNo;
    }

    public void setEstageOrderNo(String estageOrderNo) {
        this.estageOrderNo = estageOrderNo == null ? null : estageOrderNo.trim();
    }

    public Integer getCallbackStatus() {
        return callbackStatus;
    }

    public void setCallbackStatus(Integer callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    public Date getCallbackDate() {
        return callbackDate;
    }

    public void setCallbackDate(Date callbackDate) {
        this.callbackDate = callbackDate;
    }

    public String getCallbackOpinion() {
        return callbackOpinion;
    }

    public void setCallbackOpinion(String callbackOpinion) {
        this.callbackOpinion = callbackOpinion == null ? null : callbackOpinion.trim();
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getCallbackMsg() {
        return callbackMsg;
    }

    public void setCallbackMsg(String callbackMsg) {
        this.callbackMsg = callbackMsg == null ? null : callbackMsg.trim();
    }
}