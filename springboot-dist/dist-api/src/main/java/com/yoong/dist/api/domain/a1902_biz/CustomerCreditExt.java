package com.yoong.dist.api.domain.a1902_biz;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerCreditExt {
    private Long id;

    private Long creditId;

    private Long lastCreditId;

    private String externalSerialNo;

    private BigDecimal expectLoanAmount;

    private BigDecimal expectExtraLoanAmount;

    private BigDecimal expectCarTransAmount;

    private String expectLoanTerm;

    private String loanPurpose;

    private Integer preCheckBankCard;

    private Integer authResult;

    private Integer signResult;

    private Integer outerSignResult;

    private Date signFinishTime;

    private Integer fundOrgBusinessStatus;

    private Integer ocrStatus;

    private Integer realAuthStatus;

    private Integer creditResult;

    private String creditRemark;

    private Integer creditStatus;

    private String flowType;

    private String flowNodeKey;

    private Integer flowNodeIndex;

    private String flowNodeName;

    private Date flowCreateTime;

    private Date creditLaunchTime;

    private Date creditInterTime;

    private Date creditCustomerSignLaunchTime;

    private Date creditCustomerSignFinishTime;

    private Date flowFinishTime;

    private Date effectiveExpireTime;

    private String signingAuthorizeLinkTotal;

    private String outerSigningAuthorizeLinkTotal;

    private String customerManagerId;

    private String yuntuOrderNo;

    private Boolean isInuse;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public Long getLastCreditId() {
        return lastCreditId;
    }

    public void setLastCreditId(Long lastCreditId) {
        this.lastCreditId = lastCreditId;
    }

    public String getExternalSerialNo() {
        return externalSerialNo;
    }

    public void setExternalSerialNo(String externalSerialNo) {
        this.externalSerialNo = externalSerialNo == null ? null : externalSerialNo.trim();
    }

    public BigDecimal getExpectLoanAmount() {
        return expectLoanAmount;
    }

    public void setExpectLoanAmount(BigDecimal expectLoanAmount) {
        this.expectLoanAmount = expectLoanAmount;
    }

    public BigDecimal getExpectExtraLoanAmount() {
        return expectExtraLoanAmount;
    }

    public void setExpectExtraLoanAmount(BigDecimal expectExtraLoanAmount) {
        this.expectExtraLoanAmount = expectExtraLoanAmount;
    }

    public BigDecimal getExpectCarTransAmount() {
        return expectCarTransAmount;
    }

    public void setExpectCarTransAmount(BigDecimal expectCarTransAmount) {
        this.expectCarTransAmount = expectCarTransAmount;
    }

    public String getExpectLoanTerm() {
        return expectLoanTerm;
    }

    public void setExpectLoanTerm(String expectLoanTerm) {
        this.expectLoanTerm = expectLoanTerm == null ? null : expectLoanTerm.trim();
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose == null ? null : loanPurpose.trim();
    }

    public Integer getPreCheckBankCard() {
        return preCheckBankCard;
    }

    public void setPreCheckBankCard(Integer preCheckBankCard) {
        this.preCheckBankCard = preCheckBankCard;
    }

    public Integer getAuthResult() {
        return authResult;
    }

    public void setAuthResult(Integer authResult) {
        this.authResult = authResult;
    }

    public Integer getSignResult() {
        return signResult;
    }

    public void setSignResult(Integer signResult) {
        this.signResult = signResult;
    }

    public Integer getOuterSignResult() {
        return outerSignResult;
    }

    public void setOuterSignResult(Integer outerSignResult) {
        this.outerSignResult = outerSignResult;
    }

    public Date getSignFinishTime() {
        return signFinishTime;
    }

    public void setSignFinishTime(Date signFinishTime) {
        this.signFinishTime = signFinishTime;
    }

    public Integer getFundOrgBusinessStatus() {
        return fundOrgBusinessStatus;
    }

    public void setFundOrgBusinessStatus(Integer fundOrgBusinessStatus) {
        this.fundOrgBusinessStatus = fundOrgBusinessStatus;
    }

    public Integer getOcrStatus() {
        return ocrStatus;
    }

    public void setOcrStatus(Integer ocrStatus) {
        this.ocrStatus = ocrStatus;
    }

    public Integer getRealAuthStatus() {
        return realAuthStatus;
    }

    public void setRealAuthStatus(Integer realAuthStatus) {
        this.realAuthStatus = realAuthStatus;
    }

    public Integer getCreditResult() {
        return creditResult;
    }

    public void setCreditResult(Integer creditResult) {
        this.creditResult = creditResult;
    }

    public String getCreditRemark() {
        return creditRemark;
    }

    public void setCreditRemark(String creditRemark) {
        this.creditRemark = creditRemark == null ? null : creditRemark.trim();
    }

    public Integer getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(Integer creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public String getFlowNodeKey() {
        return flowNodeKey;
    }

    public void setFlowNodeKey(String flowNodeKey) {
        this.flowNodeKey = flowNodeKey == null ? null : flowNodeKey.trim();
    }

    public Integer getFlowNodeIndex() {
        return flowNodeIndex;
    }

    public void setFlowNodeIndex(Integer flowNodeIndex) {
        this.flowNodeIndex = flowNodeIndex;
    }

    public String getFlowNodeName() {
        return flowNodeName;
    }

    public void setFlowNodeName(String flowNodeName) {
        this.flowNodeName = flowNodeName == null ? null : flowNodeName.trim();
    }

    public Date getFlowCreateTime() {
        return flowCreateTime;
    }

    public void setFlowCreateTime(Date flowCreateTime) {
        this.flowCreateTime = flowCreateTime;
    }

    public Date getCreditLaunchTime() {
        return creditLaunchTime;
    }

    public void setCreditLaunchTime(Date creditLaunchTime) {
        this.creditLaunchTime = creditLaunchTime;
    }

    public Date getCreditInterTime() {
        return creditInterTime;
    }

    public void setCreditInterTime(Date creditInterTime) {
        this.creditInterTime = creditInterTime;
    }

    public Date getCreditCustomerSignLaunchTime() {
        return creditCustomerSignLaunchTime;
    }

    public void setCreditCustomerSignLaunchTime(Date creditCustomerSignLaunchTime) {
        this.creditCustomerSignLaunchTime = creditCustomerSignLaunchTime;
    }

    public Date getCreditCustomerSignFinishTime() {
        return creditCustomerSignFinishTime;
    }

    public void setCreditCustomerSignFinishTime(Date creditCustomerSignFinishTime) {
        this.creditCustomerSignFinishTime = creditCustomerSignFinishTime;
    }

    public Date getFlowFinishTime() {
        return flowFinishTime;
    }

    public void setFlowFinishTime(Date flowFinishTime) {
        this.flowFinishTime = flowFinishTime;
    }

    public Date getEffectiveExpireTime() {
        return effectiveExpireTime;
    }

    public void setEffectiveExpireTime(Date effectiveExpireTime) {
        this.effectiveExpireTime = effectiveExpireTime;
    }

    public String getSigningAuthorizeLinkTotal() {
        return signingAuthorizeLinkTotal;
    }

    public void setSigningAuthorizeLinkTotal(String signingAuthorizeLinkTotal) {
        this.signingAuthorizeLinkTotal = signingAuthorizeLinkTotal == null ? null : signingAuthorizeLinkTotal.trim();
    }

    public String getOuterSigningAuthorizeLinkTotal() {
        return outerSigningAuthorizeLinkTotal;
    }

    public void setOuterSigningAuthorizeLinkTotal(String outerSigningAuthorizeLinkTotal) {
        this.outerSigningAuthorizeLinkTotal = outerSigningAuthorizeLinkTotal == null ? null : outerSigningAuthorizeLinkTotal.trim();
    }

    public String getCustomerManagerId() {
        return customerManagerId;
    }

    public void setCustomerManagerId(String customerManagerId) {
        this.customerManagerId = customerManagerId == null ? null : customerManagerId.trim();
    }

    public String getYuntuOrderNo() {
        return yuntuOrderNo;
    }

    public void setYuntuOrderNo(String yuntuOrderNo) {
        this.yuntuOrderNo = yuntuOrderNo == null ? null : yuntuOrderNo.trim();
    }

    public Boolean getIsInuse() {
        return isInuse;
    }

    public void setIsInuse(Boolean isInuse) {
        this.isInuse = isInuse;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}