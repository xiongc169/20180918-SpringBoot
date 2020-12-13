package com.yoong.dist.api.domain.a1902_biz;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerCreditRelavant {
    private Long id;

    private Long creditId;

    private String name;

    private String enName;

    private String certType;

    private String certNo;

    private String certValidStartDate;

    private String certValidEndDate;

    private String licenceIssuingAuthority;

    private String certAddressPid;

    private String certAddressPname;

    private String certAddressCid;

    private String certAddressCname;

    private String certAddressRid;

    private String certAddressRname;

    private String certAddress;

    private String mobilePhone;

    private String birthday;

    private Integer gender;

    private String homeAddressFullDetail;

    private String domicileAddress;

    private String workUnit;

    private String postCode;

    private Integer maritalStatus;

    private Integer borrowerRelationship;

    private Integer businessRelationship;

    private Integer certSimilarityDegree;

    private Integer certStatus;

    private String certResult;

    private Date certTime;

    private String bankCardNo;

    private String bankCardReserveMobilePhone;

    private String bankCardOpenningBankName;

    private String bankCardCnapsCode;

    private Integer authResult;

    private String authRemark;

    private String riskSerialNumber;

    private String ocrFlowNo;

    private Integer bankCreditResult;

    private String bankCreditRemark;

    private Integer bigDataCreditResult;

    private String bigDataCreditRemark;

    private Long bankCreditStaffId;

    private String bankCreditStaffName;

    private Integer creditResult;

    private Integer loanRecordStatus;

    private String creditRemark;

    private String signingAuthorizeLink;

    private Integer signResult;

    private Integer sendSmsResult;

    private Boolean isInuse;

    private BigDecimal due12monthsDebt;

    private BigDecimal due24monthsDebt;

    private BigDecimal due36monthsDebt;

    private BigDecimal due48monthsDebt;

    private BigDecimal due60monthsDebt;

    private BigDecimal loanBalance;

    private Integer creditCardNum;

    private Integer creditLimitSum;

    private Integer avgUsedLimitLastSixMonth;

    private Integer overdueNumLastYear;

    private Integer overdueAmount;

    private Integer guaranteedAmount;

    private String authFlowNo;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
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

    public String getCertValidStartDate() {
        return certValidStartDate;
    }

    public void setCertValidStartDate(String certValidStartDate) {
        this.certValidStartDate = certValidStartDate == null ? null : certValidStartDate.trim();
    }

    public String getCertValidEndDate() {
        return certValidEndDate;
    }

    public void setCertValidEndDate(String certValidEndDate) {
        this.certValidEndDate = certValidEndDate == null ? null : certValidEndDate.trim();
    }

    public String getLicenceIssuingAuthority() {
        return licenceIssuingAuthority;
    }

    public void setLicenceIssuingAuthority(String licenceIssuingAuthority) {
        this.licenceIssuingAuthority = licenceIssuingAuthority == null ? null : licenceIssuingAuthority.trim();
    }

    public String getCertAddressPid() {
        return certAddressPid;
    }

    public void setCertAddressPid(String certAddressPid) {
        this.certAddressPid = certAddressPid == null ? null : certAddressPid.trim();
    }

    public String getCertAddressPname() {
        return certAddressPname;
    }

    public void setCertAddressPname(String certAddressPname) {
        this.certAddressPname = certAddressPname == null ? null : certAddressPname.trim();
    }

    public String getCertAddressCid() {
        return certAddressCid;
    }

    public void setCertAddressCid(String certAddressCid) {
        this.certAddressCid = certAddressCid == null ? null : certAddressCid.trim();
    }

    public String getCertAddressCname() {
        return certAddressCname;
    }

    public void setCertAddressCname(String certAddressCname) {
        this.certAddressCname = certAddressCname == null ? null : certAddressCname.trim();
    }

    public String getCertAddressRid() {
        return certAddressRid;
    }

    public void setCertAddressRid(String certAddressRid) {
        this.certAddressRid = certAddressRid == null ? null : certAddressRid.trim();
    }

    public String getCertAddressRname() {
        return certAddressRname;
    }

    public void setCertAddressRname(String certAddressRname) {
        this.certAddressRname = certAddressRname == null ? null : certAddressRname.trim();
    }

    public String getCertAddress() {
        return certAddress;
    }

    public void setCertAddress(String certAddress) {
        this.certAddress = certAddress == null ? null : certAddress.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getHomeAddressFullDetail() {
        return homeAddressFullDetail;
    }

    public void setHomeAddressFullDetail(String homeAddressFullDetail) {
        this.homeAddressFullDetail = homeAddressFullDetail == null ? null : homeAddressFullDetail.trim();
    }

    public String getDomicileAddress() {
        return domicileAddress;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress == null ? null : domicileAddress.trim();
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getBorrowerRelationship() {
        return borrowerRelationship;
    }

    public void setBorrowerRelationship(Integer borrowerRelationship) {
        this.borrowerRelationship = borrowerRelationship;
    }

    public Integer getBusinessRelationship() {
        return businessRelationship;
    }

    public void setBusinessRelationship(Integer businessRelationship) {
        this.businessRelationship = businessRelationship;
    }

    public Integer getCertSimilarityDegree() {
        return certSimilarityDegree;
    }

    public void setCertSimilarityDegree(Integer certSimilarityDegree) {
        this.certSimilarityDegree = certSimilarityDegree;
    }

    public Integer getCertStatus() {
        return certStatus;
    }

    public void setCertStatus(Integer certStatus) {
        this.certStatus = certStatus;
    }

    public String getCertResult() {
        return certResult;
    }

    public void setCertResult(String certResult) {
        this.certResult = certResult == null ? null : certResult.trim();
    }

    public Date getCertTime() {
        return certTime;
    }

    public void setCertTime(Date certTime) {
        this.certTime = certTime;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public String getBankCardReserveMobilePhone() {
        return bankCardReserveMobilePhone;
    }

    public void setBankCardReserveMobilePhone(String bankCardReserveMobilePhone) {
        this.bankCardReserveMobilePhone = bankCardReserveMobilePhone == null ? null : bankCardReserveMobilePhone.trim();
    }

    public String getBankCardOpenningBankName() {
        return bankCardOpenningBankName;
    }

    public void setBankCardOpenningBankName(String bankCardOpenningBankName) {
        this.bankCardOpenningBankName = bankCardOpenningBankName == null ? null : bankCardOpenningBankName.trim();
    }

    public String getBankCardCnapsCode() {
        return bankCardCnapsCode;
    }

    public void setBankCardCnapsCode(String bankCardCnapsCode) {
        this.bankCardCnapsCode = bankCardCnapsCode == null ? null : bankCardCnapsCode.trim();
    }

    public Integer getAuthResult() {
        return authResult;
    }

    public void setAuthResult(Integer authResult) {
        this.authResult = authResult;
    }

    public String getAuthRemark() {
        return authRemark;
    }

    public void setAuthRemark(String authRemark) {
        this.authRemark = authRemark == null ? null : authRemark.trim();
    }

    public String getRiskSerialNumber() {
        return riskSerialNumber;
    }

    public void setRiskSerialNumber(String riskSerialNumber) {
        this.riskSerialNumber = riskSerialNumber == null ? null : riskSerialNumber.trim();
    }

    public String getOcrFlowNo() {
        return ocrFlowNo;
    }

    public void setOcrFlowNo(String ocrFlowNo) {
        this.ocrFlowNo = ocrFlowNo == null ? null : ocrFlowNo.trim();
    }

    public Integer getBankCreditResult() {
        return bankCreditResult;
    }

    public void setBankCreditResult(Integer bankCreditResult) {
        this.bankCreditResult = bankCreditResult;
    }

    public String getBankCreditRemark() {
        return bankCreditRemark;
    }

    public void setBankCreditRemark(String bankCreditRemark) {
        this.bankCreditRemark = bankCreditRemark == null ? null : bankCreditRemark.trim();
    }

    public Integer getBigDataCreditResult() {
        return bigDataCreditResult;
    }

    public void setBigDataCreditResult(Integer bigDataCreditResult) {
        this.bigDataCreditResult = bigDataCreditResult;
    }

    public String getBigDataCreditRemark() {
        return bigDataCreditRemark;
    }

    public void setBigDataCreditRemark(String bigDataCreditRemark) {
        this.bigDataCreditRemark = bigDataCreditRemark == null ? null : bigDataCreditRemark.trim();
    }

    public Long getBankCreditStaffId() {
        return bankCreditStaffId;
    }

    public void setBankCreditStaffId(Long bankCreditStaffId) {
        this.bankCreditStaffId = bankCreditStaffId;
    }

    public String getBankCreditStaffName() {
        return bankCreditStaffName;
    }

    public void setBankCreditStaffName(String bankCreditStaffName) {
        this.bankCreditStaffName = bankCreditStaffName == null ? null : bankCreditStaffName.trim();
    }

    public Integer getCreditResult() {
        return creditResult;
    }

    public void setCreditResult(Integer creditResult) {
        this.creditResult = creditResult;
    }

    public Integer getLoanRecordStatus() {
        return loanRecordStatus;
    }

    public void setLoanRecordStatus(Integer loanRecordStatus) {
        this.loanRecordStatus = loanRecordStatus;
    }

    public String getCreditRemark() {
        return creditRemark;
    }

    public void setCreditRemark(String creditRemark) {
        this.creditRemark = creditRemark == null ? null : creditRemark.trim();
    }

    public String getSigningAuthorizeLink() {
        return signingAuthorizeLink;
    }

    public void setSigningAuthorizeLink(String signingAuthorizeLink) {
        this.signingAuthorizeLink = signingAuthorizeLink == null ? null : signingAuthorizeLink.trim();
    }

    public Integer getSignResult() {
        return signResult;
    }

    public void setSignResult(Integer signResult) {
        this.signResult = signResult;
    }

    public Integer getSendSmsResult() {
        return sendSmsResult;
    }

    public void setSendSmsResult(Integer sendSmsResult) {
        this.sendSmsResult = sendSmsResult;
    }

    public Boolean getIsInuse() {
        return isInuse;
    }

    public void setIsInuse(Boolean isInuse) {
        this.isInuse = isInuse;
    }

    public BigDecimal getDue12monthsDebt() {
        return due12monthsDebt;
    }

    public void setDue12monthsDebt(BigDecimal due12monthsDebt) {
        this.due12monthsDebt = due12monthsDebt;
    }

    public BigDecimal getDue24monthsDebt() {
        return due24monthsDebt;
    }

    public void setDue24monthsDebt(BigDecimal due24monthsDebt) {
        this.due24monthsDebt = due24monthsDebt;
    }

    public BigDecimal getDue36monthsDebt() {
        return due36monthsDebt;
    }

    public void setDue36monthsDebt(BigDecimal due36monthsDebt) {
        this.due36monthsDebt = due36monthsDebt;
    }

    public BigDecimal getDue48monthsDebt() {
        return due48monthsDebt;
    }

    public void setDue48monthsDebt(BigDecimal due48monthsDebt) {
        this.due48monthsDebt = due48monthsDebt;
    }

    public BigDecimal getDue60monthsDebt() {
        return due60monthsDebt;
    }

    public void setDue60monthsDebt(BigDecimal due60monthsDebt) {
        this.due60monthsDebt = due60monthsDebt;
    }

    public BigDecimal getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(BigDecimal loanBalance) {
        this.loanBalance = loanBalance;
    }

    public Integer getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(Integer creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public Integer getCreditLimitSum() {
        return creditLimitSum;
    }

    public void setCreditLimitSum(Integer creditLimitSum) {
        this.creditLimitSum = creditLimitSum;
    }

    public Integer getAvgUsedLimitLastSixMonth() {
        return avgUsedLimitLastSixMonth;
    }

    public void setAvgUsedLimitLastSixMonth(Integer avgUsedLimitLastSixMonth) {
        this.avgUsedLimitLastSixMonth = avgUsedLimitLastSixMonth;
    }

    public Integer getOverdueNumLastYear() {
        return overdueNumLastYear;
    }

    public void setOverdueNumLastYear(Integer overdueNumLastYear) {
        this.overdueNumLastYear = overdueNumLastYear;
    }

    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Integer getGuaranteedAmount() {
        return guaranteedAmount;
    }

    public void setGuaranteedAmount(Integer guaranteedAmount) {
        this.guaranteedAmount = guaranteedAmount;
    }

    public String getAuthFlowNo() {
        return authFlowNo;
    }

    public void setAuthFlowNo(String authFlowNo) {
        this.authFlowNo = authFlowNo == null ? null : authFlowNo.trim();
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