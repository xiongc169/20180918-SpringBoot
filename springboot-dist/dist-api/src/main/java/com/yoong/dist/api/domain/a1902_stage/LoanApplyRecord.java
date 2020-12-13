package com.yoong.dist.api.domain.a1902_stage;

import java.math.BigDecimal;
import java.util.Date;

public class LoanApplyRecord {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long version;

    private Long apiServiceId;

    private Long apiSendId;

    private String appId;

    private String orderNo;

    private String projectId;

    private String bankId;

    private String customerName;

    private String certNo;

    private String phoneNum;

    private Integer orderStatus;

    private Date applyCardDate;

    private Date applyStageDate;

    private BigDecimal loanMoney;

    private Integer delFlag;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
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

    public Date getApplyCardDate() {
        return applyCardDate;
    }

    public void setApplyCardDate(Date applyCardDate) {
        this.applyCardDate = applyCardDate;
    }

    public Date getApplyStageDate() {
        return applyStageDate;
    }

    public void setApplyStageDate(Date applyStageDate) {
        this.applyStageDate = applyStageDate;
    }

    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}