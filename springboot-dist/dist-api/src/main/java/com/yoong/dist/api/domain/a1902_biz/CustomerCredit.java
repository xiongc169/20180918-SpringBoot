package com.yoong.dist.api.domain.a1902_biz;

import java.util.Date;

public class CustomerCredit {
    private Long id;

    private Integer source;

    private String creditNo;

    private Long customerId;

    private String customerName;

    private String certType;

    private String certNo;

    private String bizType;

    private String bizProductType;

    private Long businessBreedId;

    private String authType;

    private Integer signType;

    private Integer outerSignType;

    private Long agencyOrgId;

    private String agencyOrgName;

    private Long branchOrgId;

    private String branchOrgName;

    private Long subOrgId;

    private String subOrgName;

    private Date applyTime;

    private Long fundOrgId;

    private String fundOrgName;

    private Integer outerFundSystemType;

    private Long customerManagerId;

    private String customerManagerName;

    private Integer saveStatus;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getBizProductType() {
        return bizProductType;
    }

    public void setBizProductType(String bizProductType) {
        this.bizProductType = bizProductType == null ? null : bizProductType.trim();
    }

    public Long getBusinessBreedId() {
        return businessBreedId;
    }

    public void setBusinessBreedId(Long businessBreedId) {
        this.businessBreedId = businessBreedId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public Integer getOuterSignType() {
        return outerSignType;
    }

    public void setOuterSignType(Integer outerSignType) {
        this.outerSignType = outerSignType;
    }

    public Long getAgencyOrgId() {
        return agencyOrgId;
    }

    public void setAgencyOrgId(Long agencyOrgId) {
        this.agencyOrgId = agencyOrgId;
    }

    public String getAgencyOrgName() {
        return agencyOrgName;
    }

    public void setAgencyOrgName(String agencyOrgName) {
        this.agencyOrgName = agencyOrgName == null ? null : agencyOrgName.trim();
    }

    public Long getBranchOrgId() {
        return branchOrgId;
    }

    public void setBranchOrgId(Long branchOrgId) {
        this.branchOrgId = branchOrgId;
    }

    public String getBranchOrgName() {
        return branchOrgName;
    }

    public void setBranchOrgName(String branchOrgName) {
        this.branchOrgName = branchOrgName == null ? null : branchOrgName.trim();
    }

    public Long getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(Long subOrgId) {
        this.subOrgId = subOrgId;
    }

    public String getSubOrgName() {
        return subOrgName;
    }

    public void setSubOrgName(String subOrgName) {
        this.subOrgName = subOrgName == null ? null : subOrgName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Long getFundOrgId() {
        return fundOrgId;
    }

    public void setFundOrgId(Long fundOrgId) {
        this.fundOrgId = fundOrgId;
    }

    public String getFundOrgName() {
        return fundOrgName;
    }

    public void setFundOrgName(String fundOrgName) {
        this.fundOrgName = fundOrgName == null ? null : fundOrgName.trim();
    }

    public Integer getOuterFundSystemType() {
        return outerFundSystemType;
    }

    public void setOuterFundSystemType(Integer outerFundSystemType) {
        this.outerFundSystemType = outerFundSystemType;
    }

    public Long getCustomerManagerId() {
        return customerManagerId;
    }

    public void setCustomerManagerId(Long customerManagerId) {
        this.customerManagerId = customerManagerId;
    }

    public String getCustomerManagerName() {
        return customerManagerName;
    }

    public void setCustomerManagerName(String customerManagerName) {
        this.customerManagerName = customerManagerName == null ? null : customerManagerName.trim();
    }

    public Integer getSaveStatus() {
        return saveStatus;
    }

    public void setSaveStatus(Integer saveStatus) {
        this.saveStatus = saveStatus;
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