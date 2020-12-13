package com.yoong.dist.api.domain.a1902_biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerCreditRelavantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerCreditRelavantExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNull() {
            addCriterion("credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNotNull() {
            addCriterion("credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIdEqualTo(Long value) {
            addCriterion("credit_id =", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotEqualTo(Long value) {
            addCriterion("credit_id <>", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThan(Long value) {
            addCriterion("credit_id >", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_id >=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThan(Long value) {
            addCriterion("credit_id <", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThanOrEqualTo(Long value) {
            addCriterion("credit_id <=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIn(List<Long> values) {
            addCriterion("credit_id in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotIn(List<Long> values) {
            addCriterion("credit_id not in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdBetween(Long value1, Long value2) {
            addCriterion("credit_id between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotBetween(Long value1, Long value2) {
            addCriterion("credit_id not between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateIsNull() {
            addCriterion("cert_valid_start_date is null");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateIsNotNull() {
            addCriterion("cert_valid_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateEqualTo(String value) {
            addCriterion("cert_valid_start_date =", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateNotEqualTo(String value) {
            addCriterion("cert_valid_start_date <>", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateGreaterThan(String value) {
            addCriterion("cert_valid_start_date >", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("cert_valid_start_date >=", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateLessThan(String value) {
            addCriterion("cert_valid_start_date <", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateLessThanOrEqualTo(String value) {
            addCriterion("cert_valid_start_date <=", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateLike(String value) {
            addCriterion("cert_valid_start_date like", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateNotLike(String value) {
            addCriterion("cert_valid_start_date not like", value, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateIn(List<String> values) {
            addCriterion("cert_valid_start_date in", values, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateNotIn(List<String> values) {
            addCriterion("cert_valid_start_date not in", values, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateBetween(String value1, String value2) {
            addCriterion("cert_valid_start_date between", value1, value2, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidStartDateNotBetween(String value1, String value2) {
            addCriterion("cert_valid_start_date not between", value1, value2, "certValidStartDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateIsNull() {
            addCriterion("cert_valid_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateIsNotNull() {
            addCriterion("cert_valid_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateEqualTo(String value) {
            addCriterion("cert_valid_end_date =", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateNotEqualTo(String value) {
            addCriterion("cert_valid_end_date <>", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateGreaterThan(String value) {
            addCriterion("cert_valid_end_date >", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("cert_valid_end_date >=", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateLessThan(String value) {
            addCriterion("cert_valid_end_date <", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateLessThanOrEqualTo(String value) {
            addCriterion("cert_valid_end_date <=", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateLike(String value) {
            addCriterion("cert_valid_end_date like", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateNotLike(String value) {
            addCriterion("cert_valid_end_date not like", value, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateIn(List<String> values) {
            addCriterion("cert_valid_end_date in", values, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateNotIn(List<String> values) {
            addCriterion("cert_valid_end_date not in", values, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateBetween(String value1, String value2) {
            addCriterion("cert_valid_end_date between", value1, value2, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andCertValidEndDateNotBetween(String value1, String value2) {
            addCriterion("cert_valid_end_date not between", value1, value2, "certValidEndDate");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityIsNull() {
            addCriterion("licence_issuing_authority is null");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityIsNotNull() {
            addCriterion("licence_issuing_authority is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityEqualTo(String value) {
            addCriterion("licence_issuing_authority =", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityNotEqualTo(String value) {
            addCriterion("licence_issuing_authority <>", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityGreaterThan(String value) {
            addCriterion("licence_issuing_authority >", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("licence_issuing_authority >=", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityLessThan(String value) {
            addCriterion("licence_issuing_authority <", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityLessThanOrEqualTo(String value) {
            addCriterion("licence_issuing_authority <=", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityLike(String value) {
            addCriterion("licence_issuing_authority like", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityNotLike(String value) {
            addCriterion("licence_issuing_authority not like", value, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityIn(List<String> values) {
            addCriterion("licence_issuing_authority in", values, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityNotIn(List<String> values) {
            addCriterion("licence_issuing_authority not in", values, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityBetween(String value1, String value2) {
            addCriterion("licence_issuing_authority between", value1, value2, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andLicenceIssuingAuthorityNotBetween(String value1, String value2) {
            addCriterion("licence_issuing_authority not between", value1, value2, "licenceIssuingAuthority");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidIsNull() {
            addCriterion("cert_address_pid is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidIsNotNull() {
            addCriterion("cert_address_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidEqualTo(String value) {
            addCriterion("cert_address_pid =", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidNotEqualTo(String value) {
            addCriterion("cert_address_pid <>", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidGreaterThan(String value) {
            addCriterion("cert_address_pid >", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address_pid >=", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidLessThan(String value) {
            addCriterion("cert_address_pid <", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidLessThanOrEqualTo(String value) {
            addCriterion("cert_address_pid <=", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidLike(String value) {
            addCriterion("cert_address_pid like", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidNotLike(String value) {
            addCriterion("cert_address_pid not like", value, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidIn(List<String> values) {
            addCriterion("cert_address_pid in", values, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidNotIn(List<String> values) {
            addCriterion("cert_address_pid not in", values, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidBetween(String value1, String value2) {
            addCriterion("cert_address_pid between", value1, value2, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPidNotBetween(String value1, String value2) {
            addCriterion("cert_address_pid not between", value1, value2, "certAddressPid");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameIsNull() {
            addCriterion("cert_address_pname is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameIsNotNull() {
            addCriterion("cert_address_pname is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameEqualTo(String value) {
            addCriterion("cert_address_pname =", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameNotEqualTo(String value) {
            addCriterion("cert_address_pname <>", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameGreaterThan(String value) {
            addCriterion("cert_address_pname >", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address_pname >=", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameLessThan(String value) {
            addCriterion("cert_address_pname <", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameLessThanOrEqualTo(String value) {
            addCriterion("cert_address_pname <=", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameLike(String value) {
            addCriterion("cert_address_pname like", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameNotLike(String value) {
            addCriterion("cert_address_pname not like", value, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameIn(List<String> values) {
            addCriterion("cert_address_pname in", values, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameNotIn(List<String> values) {
            addCriterion("cert_address_pname not in", values, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameBetween(String value1, String value2) {
            addCriterion("cert_address_pname between", value1, value2, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressPnameNotBetween(String value1, String value2) {
            addCriterion("cert_address_pname not between", value1, value2, "certAddressPname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidIsNull() {
            addCriterion("cert_address_cid is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidIsNotNull() {
            addCriterion("cert_address_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidEqualTo(String value) {
            addCriterion("cert_address_cid =", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidNotEqualTo(String value) {
            addCriterion("cert_address_cid <>", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidGreaterThan(String value) {
            addCriterion("cert_address_cid >", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address_cid >=", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidLessThan(String value) {
            addCriterion("cert_address_cid <", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidLessThanOrEqualTo(String value) {
            addCriterion("cert_address_cid <=", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidLike(String value) {
            addCriterion("cert_address_cid like", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidNotLike(String value) {
            addCriterion("cert_address_cid not like", value, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidIn(List<String> values) {
            addCriterion("cert_address_cid in", values, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidNotIn(List<String> values) {
            addCriterion("cert_address_cid not in", values, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidBetween(String value1, String value2) {
            addCriterion("cert_address_cid between", value1, value2, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCidNotBetween(String value1, String value2) {
            addCriterion("cert_address_cid not between", value1, value2, "certAddressCid");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameIsNull() {
            addCriterion("cert_address_cname is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameIsNotNull() {
            addCriterion("cert_address_cname is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameEqualTo(String value) {
            addCriterion("cert_address_cname =", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameNotEqualTo(String value) {
            addCriterion("cert_address_cname <>", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameGreaterThan(String value) {
            addCriterion("cert_address_cname >", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address_cname >=", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameLessThan(String value) {
            addCriterion("cert_address_cname <", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameLessThanOrEqualTo(String value) {
            addCriterion("cert_address_cname <=", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameLike(String value) {
            addCriterion("cert_address_cname like", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameNotLike(String value) {
            addCriterion("cert_address_cname not like", value, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameIn(List<String> values) {
            addCriterion("cert_address_cname in", values, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameNotIn(List<String> values) {
            addCriterion("cert_address_cname not in", values, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameBetween(String value1, String value2) {
            addCriterion("cert_address_cname between", value1, value2, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressCnameNotBetween(String value1, String value2) {
            addCriterion("cert_address_cname not between", value1, value2, "certAddressCname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidIsNull() {
            addCriterion("cert_address_rid is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidIsNotNull() {
            addCriterion("cert_address_rid is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidEqualTo(String value) {
            addCriterion("cert_address_rid =", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidNotEqualTo(String value) {
            addCriterion("cert_address_rid <>", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidGreaterThan(String value) {
            addCriterion("cert_address_rid >", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address_rid >=", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidLessThan(String value) {
            addCriterion("cert_address_rid <", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidLessThanOrEqualTo(String value) {
            addCriterion("cert_address_rid <=", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidLike(String value) {
            addCriterion("cert_address_rid like", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidNotLike(String value) {
            addCriterion("cert_address_rid not like", value, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidIn(List<String> values) {
            addCriterion("cert_address_rid in", values, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidNotIn(List<String> values) {
            addCriterion("cert_address_rid not in", values, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidBetween(String value1, String value2) {
            addCriterion("cert_address_rid between", value1, value2, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRidNotBetween(String value1, String value2) {
            addCriterion("cert_address_rid not between", value1, value2, "certAddressRid");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameIsNull() {
            addCriterion("cert_address_rname is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameIsNotNull() {
            addCriterion("cert_address_rname is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameEqualTo(String value) {
            addCriterion("cert_address_rname =", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameNotEqualTo(String value) {
            addCriterion("cert_address_rname <>", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameGreaterThan(String value) {
            addCriterion("cert_address_rname >", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address_rname >=", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameLessThan(String value) {
            addCriterion("cert_address_rname <", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameLessThanOrEqualTo(String value) {
            addCriterion("cert_address_rname <=", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameLike(String value) {
            addCriterion("cert_address_rname like", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameNotLike(String value) {
            addCriterion("cert_address_rname not like", value, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameIn(List<String> values) {
            addCriterion("cert_address_rname in", values, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameNotIn(List<String> values) {
            addCriterion("cert_address_rname not in", values, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameBetween(String value1, String value2) {
            addCriterion("cert_address_rname between", value1, value2, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressRnameNotBetween(String value1, String value2) {
            addCriterion("cert_address_rname not between", value1, value2, "certAddressRname");
            return (Criteria) this;
        }

        public Criteria andCertAddressIsNull() {
            addCriterion("cert_address is null");
            return (Criteria) this;
        }

        public Criteria andCertAddressIsNotNull() {
            addCriterion("cert_address is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddressEqualTo(String value) {
            addCriterion("cert_address =", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressNotEqualTo(String value) {
            addCriterion("cert_address <>", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressGreaterThan(String value) {
            addCriterion("cert_address >", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cert_address >=", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressLessThan(String value) {
            addCriterion("cert_address <", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressLessThanOrEqualTo(String value) {
            addCriterion("cert_address <=", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressLike(String value) {
            addCriterion("cert_address like", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressNotLike(String value) {
            addCriterion("cert_address not like", value, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressIn(List<String> values) {
            addCriterion("cert_address in", values, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressNotIn(List<String> values) {
            addCriterion("cert_address not in", values, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressBetween(String value1, String value2) {
            addCriterion("cert_address between", value1, value2, "certAddress");
            return (Criteria) this;
        }

        public Criteria andCertAddressNotBetween(String value1, String value2) {
            addCriterion("cert_address not between", value1, value2, "certAddress");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailIsNull() {
            addCriterion("home_address_full_detail is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailIsNotNull() {
            addCriterion("home_address_full_detail is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailEqualTo(String value) {
            addCriterion("home_address_full_detail =", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailNotEqualTo(String value) {
            addCriterion("home_address_full_detail <>", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailGreaterThan(String value) {
            addCriterion("home_address_full_detail >", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailGreaterThanOrEqualTo(String value) {
            addCriterion("home_address_full_detail >=", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailLessThan(String value) {
            addCriterion("home_address_full_detail <", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailLessThanOrEqualTo(String value) {
            addCriterion("home_address_full_detail <=", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailLike(String value) {
            addCriterion("home_address_full_detail like", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailNotLike(String value) {
            addCriterion("home_address_full_detail not like", value, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailIn(List<String> values) {
            addCriterion("home_address_full_detail in", values, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailNotIn(List<String> values) {
            addCriterion("home_address_full_detail not in", values, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailBetween(String value1, String value2) {
            addCriterion("home_address_full_detail between", value1, value2, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressFullDetailNotBetween(String value1, String value2) {
            addCriterion("home_address_full_detail not between", value1, value2, "homeAddressFullDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressIsNull() {
            addCriterion("domicile_address is null");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressIsNotNull() {
            addCriterion("domicile_address is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressEqualTo(String value) {
            addCriterion("domicile_address =", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressNotEqualTo(String value) {
            addCriterion("domicile_address <>", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressGreaterThan(String value) {
            addCriterion("domicile_address >", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressGreaterThanOrEqualTo(String value) {
            addCriterion("domicile_address >=", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressLessThan(String value) {
            addCriterion("domicile_address <", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressLessThanOrEqualTo(String value) {
            addCriterion("domicile_address <=", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressLike(String value) {
            addCriterion("domicile_address like", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressNotLike(String value) {
            addCriterion("domicile_address not like", value, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressIn(List<String> values) {
            addCriterion("domicile_address in", values, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressNotIn(List<String> values) {
            addCriterion("domicile_address not in", values, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressBetween(String value1, String value2) {
            addCriterion("domicile_address between", value1, value2, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andDomicileAddressNotBetween(String value1, String value2) {
            addCriterion("domicile_address not between", value1, value2, "domicileAddress");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNull() {
            addCriterion("work_unit is null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNotNull() {
            addCriterion("work_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitEqualTo(String value) {
            addCriterion("work_unit =", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotEqualTo(String value) {
            addCriterion("work_unit <>", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThan(String value) {
            addCriterion("work_unit >", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("work_unit >=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThan(String value) {
            addCriterion("work_unit <", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("work_unit <=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLike(String value) {
            addCriterion("work_unit like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotLike(String value) {
            addCriterion("work_unit not like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIn(List<String> values) {
            addCriterion("work_unit in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotIn(List<String> values) {
            addCriterion("work_unit not in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitBetween(String value1, String value2) {
            addCriterion("work_unit between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotBetween(String value1, String value2) {
            addCriterion("work_unit not between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipIsNull() {
            addCriterion("borrower_relationship is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipIsNotNull() {
            addCriterion("borrower_relationship is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipEqualTo(Integer value) {
            addCriterion("borrower_relationship =", value, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipNotEqualTo(Integer value) {
            addCriterion("borrower_relationship <>", value, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipGreaterThan(Integer value) {
            addCriterion("borrower_relationship >", value, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrower_relationship >=", value, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipLessThan(Integer value) {
            addCriterion("borrower_relationship <", value, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipLessThanOrEqualTo(Integer value) {
            addCriterion("borrower_relationship <=", value, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipIn(List<Integer> values) {
            addCriterion("borrower_relationship in", values, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipNotIn(List<Integer> values) {
            addCriterion("borrower_relationship not in", values, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipBetween(Integer value1, Integer value2) {
            addCriterion("borrower_relationship between", value1, value2, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBorrowerRelationshipNotBetween(Integer value1, Integer value2) {
            addCriterion("borrower_relationship not between", value1, value2, "borrowerRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipIsNull() {
            addCriterion("business_relationship is null");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipIsNotNull() {
            addCriterion("business_relationship is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipEqualTo(Integer value) {
            addCriterion("business_relationship =", value, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipNotEqualTo(Integer value) {
            addCriterion("business_relationship <>", value, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipGreaterThan(Integer value) {
            addCriterion("business_relationship >", value, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_relationship >=", value, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipLessThan(Integer value) {
            addCriterion("business_relationship <", value, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipLessThanOrEqualTo(Integer value) {
            addCriterion("business_relationship <=", value, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipIn(List<Integer> values) {
            addCriterion("business_relationship in", values, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipNotIn(List<Integer> values) {
            addCriterion("business_relationship not in", values, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipBetween(Integer value1, Integer value2) {
            addCriterion("business_relationship between", value1, value2, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andBusinessRelationshipNotBetween(Integer value1, Integer value2) {
            addCriterion("business_relationship not between", value1, value2, "businessRelationship");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeIsNull() {
            addCriterion("cert_similarity_degree is null");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeIsNotNull() {
            addCriterion("cert_similarity_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeEqualTo(Integer value) {
            addCriterion("cert_similarity_degree =", value, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeNotEqualTo(Integer value) {
            addCriterion("cert_similarity_degree <>", value, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeGreaterThan(Integer value) {
            addCriterion("cert_similarity_degree >", value, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cert_similarity_degree >=", value, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeLessThan(Integer value) {
            addCriterion("cert_similarity_degree <", value, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("cert_similarity_degree <=", value, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeIn(List<Integer> values) {
            addCriterion("cert_similarity_degree in", values, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeNotIn(List<Integer> values) {
            addCriterion("cert_similarity_degree not in", values, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeBetween(Integer value1, Integer value2) {
            addCriterion("cert_similarity_degree between", value1, value2, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertSimilarityDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("cert_similarity_degree not between", value1, value2, "certSimilarityDegree");
            return (Criteria) this;
        }

        public Criteria andCertStatusIsNull() {
            addCriterion("cert_status is null");
            return (Criteria) this;
        }

        public Criteria andCertStatusIsNotNull() {
            addCriterion("cert_status is not null");
            return (Criteria) this;
        }

        public Criteria andCertStatusEqualTo(Integer value) {
            addCriterion("cert_status =", value, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusNotEqualTo(Integer value) {
            addCriterion("cert_status <>", value, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusGreaterThan(Integer value) {
            addCriterion("cert_status >", value, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cert_status >=", value, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusLessThan(Integer value) {
            addCriterion("cert_status <", value, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cert_status <=", value, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusIn(List<Integer> values) {
            addCriterion("cert_status in", values, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusNotIn(List<Integer> values) {
            addCriterion("cert_status not in", values, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusBetween(Integer value1, Integer value2) {
            addCriterion("cert_status between", value1, value2, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cert_status not between", value1, value2, "certStatus");
            return (Criteria) this;
        }

        public Criteria andCertResultIsNull() {
            addCriterion("cert_result is null");
            return (Criteria) this;
        }

        public Criteria andCertResultIsNotNull() {
            addCriterion("cert_result is not null");
            return (Criteria) this;
        }

        public Criteria andCertResultEqualTo(String value) {
            addCriterion("cert_result =", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultNotEqualTo(String value) {
            addCriterion("cert_result <>", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultGreaterThan(String value) {
            addCriterion("cert_result >", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultGreaterThanOrEqualTo(String value) {
            addCriterion("cert_result >=", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultLessThan(String value) {
            addCriterion("cert_result <", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultLessThanOrEqualTo(String value) {
            addCriterion("cert_result <=", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultLike(String value) {
            addCriterion("cert_result like", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultNotLike(String value) {
            addCriterion("cert_result not like", value, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultIn(List<String> values) {
            addCriterion("cert_result in", values, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultNotIn(List<String> values) {
            addCriterion("cert_result not in", values, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultBetween(String value1, String value2) {
            addCriterion("cert_result between", value1, value2, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertResultNotBetween(String value1, String value2) {
            addCriterion("cert_result not between", value1, value2, "certResult");
            return (Criteria) this;
        }

        public Criteria andCertTimeIsNull() {
            addCriterion("cert_time is null");
            return (Criteria) this;
        }

        public Criteria andCertTimeIsNotNull() {
            addCriterion("cert_time is not null");
            return (Criteria) this;
        }

        public Criteria andCertTimeEqualTo(Date value) {
            addCriterion("cert_time =", value, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeNotEqualTo(Date value) {
            addCriterion("cert_time <>", value, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeGreaterThan(Date value) {
            addCriterion("cert_time >", value, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cert_time >=", value, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeLessThan(Date value) {
            addCriterion("cert_time <", value, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeLessThanOrEqualTo(Date value) {
            addCriterion("cert_time <=", value, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeIn(List<Date> values) {
            addCriterion("cert_time in", values, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeNotIn(List<Date> values) {
            addCriterion("cert_time not in", values, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeBetween(Date value1, Date value2) {
            addCriterion("cert_time between", value1, value2, "certTime");
            return (Criteria) this;
        }

        public Criteria andCertTimeNotBetween(Date value1, Date value2) {
            addCriterion("cert_time not between", value1, value2, "certTime");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("bank_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("bank_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("bank_card_no =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("bank_card_no <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("bank_card_no >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_no >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("bank_card_no <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_no <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("bank_card_no like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("bank_card_no not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("bank_card_no in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("bank_card_no not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("bank_card_no between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_no not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneIsNull() {
            addCriterion("bank_card_reserve_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneIsNotNull() {
            addCriterion("bank_card_reserve_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneEqualTo(String value) {
            addCriterion("bank_card_reserve_mobile_phone =", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneNotEqualTo(String value) {
            addCriterion("bank_card_reserve_mobile_phone <>", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneGreaterThan(String value) {
            addCriterion("bank_card_reserve_mobile_phone >", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_reserve_mobile_phone >=", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneLessThan(String value) {
            addCriterion("bank_card_reserve_mobile_phone <", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("bank_card_reserve_mobile_phone <=", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneLike(String value) {
            addCriterion("bank_card_reserve_mobile_phone like", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneNotLike(String value) {
            addCriterion("bank_card_reserve_mobile_phone not like", value, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneIn(List<String> values) {
            addCriterion("bank_card_reserve_mobile_phone in", values, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneNotIn(List<String> values) {
            addCriterion("bank_card_reserve_mobile_phone not in", values, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneBetween(String value1, String value2) {
            addCriterion("bank_card_reserve_mobile_phone between", value1, value2, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardReserveMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("bank_card_reserve_mobile_phone not between", value1, value2, "bankCardReserveMobilePhone");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameIsNull() {
            addCriterion("bank_card_openning_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameIsNotNull() {
            addCriterion("bank_card_openning_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameEqualTo(String value) {
            addCriterion("bank_card_openning_bank_name =", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameNotEqualTo(String value) {
            addCriterion("bank_card_openning_bank_name <>", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameGreaterThan(String value) {
            addCriterion("bank_card_openning_bank_name >", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_openning_bank_name >=", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameLessThan(String value) {
            addCriterion("bank_card_openning_bank_name <", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_card_openning_bank_name <=", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameLike(String value) {
            addCriterion("bank_card_openning_bank_name like", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameNotLike(String value) {
            addCriterion("bank_card_openning_bank_name not like", value, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameIn(List<String> values) {
            addCriterion("bank_card_openning_bank_name in", values, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameNotIn(List<String> values) {
            addCriterion("bank_card_openning_bank_name not in", values, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameBetween(String value1, String value2) {
            addCriterion("bank_card_openning_bank_name between", value1, value2, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenningBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_card_openning_bank_name not between", value1, value2, "bankCardOpenningBankName");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeIsNull() {
            addCriterion("bank_card_cnaps_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeIsNotNull() {
            addCriterion("bank_card_cnaps_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeEqualTo(String value) {
            addCriterion("bank_card_cnaps_code =", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeNotEqualTo(String value) {
            addCriterion("bank_card_cnaps_code <>", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeGreaterThan(String value) {
            addCriterion("bank_card_cnaps_code >", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_cnaps_code >=", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeLessThan(String value) {
            addCriterion("bank_card_cnaps_code <", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_card_cnaps_code <=", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeLike(String value) {
            addCriterion("bank_card_cnaps_code like", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeNotLike(String value) {
            addCriterion("bank_card_cnaps_code not like", value, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeIn(List<String> values) {
            addCriterion("bank_card_cnaps_code in", values, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeNotIn(List<String> values) {
            addCriterion("bank_card_cnaps_code not in", values, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeBetween(String value1, String value2) {
            addCriterion("bank_card_cnaps_code between", value1, value2, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andBankCardCnapsCodeNotBetween(String value1, String value2) {
            addCriterion("bank_card_cnaps_code not between", value1, value2, "bankCardCnapsCode");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNull() {
            addCriterion("auth_result is null");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNotNull() {
            addCriterion("auth_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuthResultEqualTo(Integer value) {
            addCriterion("auth_result =", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotEqualTo(Integer value) {
            addCriterion("auth_result <>", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThan(Integer value) {
            addCriterion("auth_result >", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_result >=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThan(Integer value) {
            addCriterion("auth_result <", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThanOrEqualTo(Integer value) {
            addCriterion("auth_result <=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultIn(List<Integer> values) {
            addCriterion("auth_result in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotIn(List<Integer> values) {
            addCriterion("auth_result not in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultBetween(Integer value1, Integer value2) {
            addCriterion("auth_result between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_result not between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkIsNull() {
            addCriterion("auth_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkIsNotNull() {
            addCriterion("auth_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkEqualTo(String value) {
            addCriterion("auth_remark =", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotEqualTo(String value) {
            addCriterion("auth_remark <>", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkGreaterThan(String value) {
            addCriterion("auth_remark >", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("auth_remark >=", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkLessThan(String value) {
            addCriterion("auth_remark <", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkLessThanOrEqualTo(String value) {
            addCriterion("auth_remark <=", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkLike(String value) {
            addCriterion("auth_remark like", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotLike(String value) {
            addCriterion("auth_remark not like", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkIn(List<String> values) {
            addCriterion("auth_remark in", values, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotIn(List<String> values) {
            addCriterion("auth_remark not in", values, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkBetween(String value1, String value2) {
            addCriterion("auth_remark between", value1, value2, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotBetween(String value1, String value2) {
            addCriterion("auth_remark not between", value1, value2, "authRemark");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberIsNull() {
            addCriterion("risk_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberIsNotNull() {
            addCriterion("risk_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberEqualTo(String value) {
            addCriterion("risk_serial_number =", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberNotEqualTo(String value) {
            addCriterion("risk_serial_number <>", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberGreaterThan(String value) {
            addCriterion("risk_serial_number >", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("risk_serial_number >=", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberLessThan(String value) {
            addCriterion("risk_serial_number <", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("risk_serial_number <=", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberLike(String value) {
            addCriterion("risk_serial_number like", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberNotLike(String value) {
            addCriterion("risk_serial_number not like", value, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberIn(List<String> values) {
            addCriterion("risk_serial_number in", values, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberNotIn(List<String> values) {
            addCriterion("risk_serial_number not in", values, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberBetween(String value1, String value2) {
            addCriterion("risk_serial_number between", value1, value2, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andRiskSerialNumberNotBetween(String value1, String value2) {
            addCriterion("risk_serial_number not between", value1, value2, "riskSerialNumber");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoIsNull() {
            addCriterion("ocr_flow_no is null");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoIsNotNull() {
            addCriterion("ocr_flow_no is not null");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoEqualTo(String value) {
            addCriterion("ocr_flow_no =", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoNotEqualTo(String value) {
            addCriterion("ocr_flow_no <>", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoGreaterThan(String value) {
            addCriterion("ocr_flow_no >", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("ocr_flow_no >=", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoLessThan(String value) {
            addCriterion("ocr_flow_no <", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoLessThanOrEqualTo(String value) {
            addCriterion("ocr_flow_no <=", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoLike(String value) {
            addCriterion("ocr_flow_no like", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoNotLike(String value) {
            addCriterion("ocr_flow_no not like", value, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoIn(List<String> values) {
            addCriterion("ocr_flow_no in", values, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoNotIn(List<String> values) {
            addCriterion("ocr_flow_no not in", values, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoBetween(String value1, String value2) {
            addCriterion("ocr_flow_no between", value1, value2, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andOcrFlowNoNotBetween(String value1, String value2) {
            addCriterion("ocr_flow_no not between", value1, value2, "ocrFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultIsNull() {
            addCriterion("bank_credit_result is null");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultIsNotNull() {
            addCriterion("bank_credit_result is not null");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultEqualTo(Integer value) {
            addCriterion("bank_credit_result =", value, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultNotEqualTo(Integer value) {
            addCriterion("bank_credit_result <>", value, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultGreaterThan(Integer value) {
            addCriterion("bank_credit_result >", value, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_credit_result >=", value, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultLessThan(Integer value) {
            addCriterion("bank_credit_result <", value, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultLessThanOrEqualTo(Integer value) {
            addCriterion("bank_credit_result <=", value, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultIn(List<Integer> values) {
            addCriterion("bank_credit_result in", values, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultNotIn(List<Integer> values) {
            addCriterion("bank_credit_result not in", values, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultBetween(Integer value1, Integer value2) {
            addCriterion("bank_credit_result between", value1, value2, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_credit_result not between", value1, value2, "bankCreditResult");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkIsNull() {
            addCriterion("bank_credit_remark is null");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkIsNotNull() {
            addCriterion("bank_credit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkEqualTo(String value) {
            addCriterion("bank_credit_remark =", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkNotEqualTo(String value) {
            addCriterion("bank_credit_remark <>", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkGreaterThan(String value) {
            addCriterion("bank_credit_remark >", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bank_credit_remark >=", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkLessThan(String value) {
            addCriterion("bank_credit_remark <", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkLessThanOrEqualTo(String value) {
            addCriterion("bank_credit_remark <=", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkLike(String value) {
            addCriterion("bank_credit_remark like", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkNotLike(String value) {
            addCriterion("bank_credit_remark not like", value, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkIn(List<String> values) {
            addCriterion("bank_credit_remark in", values, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkNotIn(List<String> values) {
            addCriterion("bank_credit_remark not in", values, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkBetween(String value1, String value2) {
            addCriterion("bank_credit_remark between", value1, value2, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditRemarkNotBetween(String value1, String value2) {
            addCriterion("bank_credit_remark not between", value1, value2, "bankCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultIsNull() {
            addCriterion("big_data_credit_result is null");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultIsNotNull() {
            addCriterion("big_data_credit_result is not null");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultEqualTo(Integer value) {
            addCriterion("big_data_credit_result =", value, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultNotEqualTo(Integer value) {
            addCriterion("big_data_credit_result <>", value, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultGreaterThan(Integer value) {
            addCriterion("big_data_credit_result >", value, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_data_credit_result >=", value, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultLessThan(Integer value) {
            addCriterion("big_data_credit_result <", value, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultLessThanOrEqualTo(Integer value) {
            addCriterion("big_data_credit_result <=", value, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultIn(List<Integer> values) {
            addCriterion("big_data_credit_result in", values, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultNotIn(List<Integer> values) {
            addCriterion("big_data_credit_result not in", values, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultBetween(Integer value1, Integer value2) {
            addCriterion("big_data_credit_result between", value1, value2, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("big_data_credit_result not between", value1, value2, "bigDataCreditResult");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkIsNull() {
            addCriterion("big_data_credit_remark is null");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkIsNotNull() {
            addCriterion("big_data_credit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkEqualTo(String value) {
            addCriterion("big_data_credit_remark =", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkNotEqualTo(String value) {
            addCriterion("big_data_credit_remark <>", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkGreaterThan(String value) {
            addCriterion("big_data_credit_remark >", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("big_data_credit_remark >=", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkLessThan(String value) {
            addCriterion("big_data_credit_remark <", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkLessThanOrEqualTo(String value) {
            addCriterion("big_data_credit_remark <=", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkLike(String value) {
            addCriterion("big_data_credit_remark like", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkNotLike(String value) {
            addCriterion("big_data_credit_remark not like", value, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkIn(List<String> values) {
            addCriterion("big_data_credit_remark in", values, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkNotIn(List<String> values) {
            addCriterion("big_data_credit_remark not in", values, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkBetween(String value1, String value2) {
            addCriterion("big_data_credit_remark between", value1, value2, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBigDataCreditRemarkNotBetween(String value1, String value2) {
            addCriterion("big_data_credit_remark not between", value1, value2, "bigDataCreditRemark");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdIsNull() {
            addCriterion("bank_credit_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdIsNotNull() {
            addCriterion("bank_credit_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdEqualTo(Long value) {
            addCriterion("bank_credit_staff_id =", value, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdNotEqualTo(Long value) {
            addCriterion("bank_credit_staff_id <>", value, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdGreaterThan(Long value) {
            addCriterion("bank_credit_staff_id >", value, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bank_credit_staff_id >=", value, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdLessThan(Long value) {
            addCriterion("bank_credit_staff_id <", value, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("bank_credit_staff_id <=", value, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdIn(List<Long> values) {
            addCriterion("bank_credit_staff_id in", values, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdNotIn(List<Long> values) {
            addCriterion("bank_credit_staff_id not in", values, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdBetween(Long value1, Long value2) {
            addCriterion("bank_credit_staff_id between", value1, value2, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("bank_credit_staff_id not between", value1, value2, "bankCreditStaffId");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameIsNull() {
            addCriterion("bank_credit_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameIsNotNull() {
            addCriterion("bank_credit_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameEqualTo(String value) {
            addCriterion("bank_credit_staff_name =", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameNotEqualTo(String value) {
            addCriterion("bank_credit_staff_name <>", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameGreaterThan(String value) {
            addCriterion("bank_credit_staff_name >", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_credit_staff_name >=", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameLessThan(String value) {
            addCriterion("bank_credit_staff_name <", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameLessThanOrEqualTo(String value) {
            addCriterion("bank_credit_staff_name <=", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameLike(String value) {
            addCriterion("bank_credit_staff_name like", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameNotLike(String value) {
            addCriterion("bank_credit_staff_name not like", value, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameIn(List<String> values) {
            addCriterion("bank_credit_staff_name in", values, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameNotIn(List<String> values) {
            addCriterion("bank_credit_staff_name not in", values, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameBetween(String value1, String value2) {
            addCriterion("bank_credit_staff_name between", value1, value2, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andBankCreditStaffNameNotBetween(String value1, String value2) {
            addCriterion("bank_credit_staff_name not between", value1, value2, "bankCreditStaffName");
            return (Criteria) this;
        }

        public Criteria andCreditResultIsNull() {
            addCriterion("credit_result is null");
            return (Criteria) this;
        }

        public Criteria andCreditResultIsNotNull() {
            addCriterion("credit_result is not null");
            return (Criteria) this;
        }

        public Criteria andCreditResultEqualTo(Integer value) {
            addCriterion("credit_result =", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultNotEqualTo(Integer value) {
            addCriterion("credit_result <>", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultGreaterThan(Integer value) {
            addCriterion("credit_result >", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_result >=", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultLessThan(Integer value) {
            addCriterion("credit_result <", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultLessThanOrEqualTo(Integer value) {
            addCriterion("credit_result <=", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultIn(List<Integer> values) {
            addCriterion("credit_result in", values, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultNotIn(List<Integer> values) {
            addCriterion("credit_result not in", values, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultBetween(Integer value1, Integer value2) {
            addCriterion("credit_result between", value1, value2, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_result not between", value1, value2, "creditResult");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusIsNull() {
            addCriterion("loan_record_status is null");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusIsNotNull() {
            addCriterion("loan_record_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusEqualTo(Integer value) {
            addCriterion("loan_record_status =", value, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusNotEqualTo(Integer value) {
            addCriterion("loan_record_status <>", value, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusGreaterThan(Integer value) {
            addCriterion("loan_record_status >", value, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_record_status >=", value, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusLessThan(Integer value) {
            addCriterion("loan_record_status <", value, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("loan_record_status <=", value, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusIn(List<Integer> values) {
            addCriterion("loan_record_status in", values, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusNotIn(List<Integer> values) {
            addCriterion("loan_record_status not in", values, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("loan_record_status between", value1, value2, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andLoanRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_record_status not between", value1, value2, "loanRecordStatus");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIsNull() {
            addCriterion("credit_remark is null");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIsNotNull() {
            addCriterion("credit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkEqualTo(String value) {
            addCriterion("credit_remark =", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotEqualTo(String value) {
            addCriterion("credit_remark <>", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkGreaterThan(String value) {
            addCriterion("credit_remark >", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("credit_remark >=", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLessThan(String value) {
            addCriterion("credit_remark <", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLessThanOrEqualTo(String value) {
            addCriterion("credit_remark <=", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLike(String value) {
            addCriterion("credit_remark like", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotLike(String value) {
            addCriterion("credit_remark not like", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIn(List<String> values) {
            addCriterion("credit_remark in", values, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotIn(List<String> values) {
            addCriterion("credit_remark not in", values, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkBetween(String value1, String value2) {
            addCriterion("credit_remark between", value1, value2, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotBetween(String value1, String value2) {
            addCriterion("credit_remark not between", value1, value2, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkIsNull() {
            addCriterion("signing_authorize_link is null");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkIsNotNull() {
            addCriterion("signing_authorize_link is not null");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkEqualTo(String value) {
            addCriterion("signing_authorize_link =", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkNotEqualTo(String value) {
            addCriterion("signing_authorize_link <>", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkGreaterThan(String value) {
            addCriterion("signing_authorize_link >", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkGreaterThanOrEqualTo(String value) {
            addCriterion("signing_authorize_link >=", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkLessThan(String value) {
            addCriterion("signing_authorize_link <", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkLessThanOrEqualTo(String value) {
            addCriterion("signing_authorize_link <=", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkLike(String value) {
            addCriterion("signing_authorize_link like", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkNotLike(String value) {
            addCriterion("signing_authorize_link not like", value, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkIn(List<String> values) {
            addCriterion("signing_authorize_link in", values, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkNotIn(List<String> values) {
            addCriterion("signing_authorize_link not in", values, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkBetween(String value1, String value2) {
            addCriterion("signing_authorize_link between", value1, value2, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkNotBetween(String value1, String value2) {
            addCriterion("signing_authorize_link not between", value1, value2, "signingAuthorizeLink");
            return (Criteria) this;
        }

        public Criteria andSignResultIsNull() {
            addCriterion("sign_result is null");
            return (Criteria) this;
        }

        public Criteria andSignResultIsNotNull() {
            addCriterion("sign_result is not null");
            return (Criteria) this;
        }

        public Criteria andSignResultEqualTo(Integer value) {
            addCriterion("sign_result =", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultNotEqualTo(Integer value) {
            addCriterion("sign_result <>", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultGreaterThan(Integer value) {
            addCriterion("sign_result >", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_result >=", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultLessThan(Integer value) {
            addCriterion("sign_result <", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultLessThanOrEqualTo(Integer value) {
            addCriterion("sign_result <=", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultIn(List<Integer> values) {
            addCriterion("sign_result in", values, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultNotIn(List<Integer> values) {
            addCriterion("sign_result not in", values, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultBetween(Integer value1, Integer value2) {
            addCriterion("sign_result between", value1, value2, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_result not between", value1, value2, "signResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultIsNull() {
            addCriterion("send_sms_result is null");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultIsNotNull() {
            addCriterion("send_sms_result is not null");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultEqualTo(Integer value) {
            addCriterion("send_sms_result =", value, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultNotEqualTo(Integer value) {
            addCriterion("send_sms_result <>", value, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultGreaterThan(Integer value) {
            addCriterion("send_sms_result >", value, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_sms_result >=", value, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultLessThan(Integer value) {
            addCriterion("send_sms_result <", value, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultLessThanOrEqualTo(Integer value) {
            addCriterion("send_sms_result <=", value, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultIn(List<Integer> values) {
            addCriterion("send_sms_result in", values, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultNotIn(List<Integer> values) {
            addCriterion("send_sms_result not in", values, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultBetween(Integer value1, Integer value2) {
            addCriterion("send_sms_result between", value1, value2, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andSendSmsResultNotBetween(Integer value1, Integer value2) {
            addCriterion("send_sms_result not between", value1, value2, "sendSmsResult");
            return (Criteria) this;
        }

        public Criteria andIsInuseIsNull() {
            addCriterion("is_inuse is null");
            return (Criteria) this;
        }

        public Criteria andIsInuseIsNotNull() {
            addCriterion("is_inuse is not null");
            return (Criteria) this;
        }

        public Criteria andIsInuseEqualTo(Boolean value) {
            addCriterion("is_inuse =", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseNotEqualTo(Boolean value) {
            addCriterion("is_inuse <>", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseGreaterThan(Boolean value) {
            addCriterion("is_inuse >", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_inuse >=", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseLessThan(Boolean value) {
            addCriterion("is_inuse <", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_inuse <=", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseIn(List<Boolean> values) {
            addCriterion("is_inuse in", values, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseNotIn(List<Boolean> values) {
            addCriterion("is_inuse not in", values, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_inuse between", value1, value2, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_inuse not between", value1, value2, "isInuse");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtIsNull() {
            addCriterion("due_12months_debt is null");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtIsNotNull() {
            addCriterion("due_12months_debt is not null");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtEqualTo(BigDecimal value) {
            addCriterion("due_12months_debt =", value, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtNotEqualTo(BigDecimal value) {
            addCriterion("due_12months_debt <>", value, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtGreaterThan(BigDecimal value) {
            addCriterion("due_12months_debt >", value, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("due_12months_debt >=", value, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtLessThan(BigDecimal value) {
            addCriterion("due_12months_debt <", value, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("due_12months_debt <=", value, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtIn(List<BigDecimal> values) {
            addCriterion("due_12months_debt in", values, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtNotIn(List<BigDecimal> values) {
            addCriterion("due_12months_debt not in", values, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_12months_debt between", value1, value2, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue12monthsDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_12months_debt not between", value1, value2, "due12monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtIsNull() {
            addCriterion("due_24months_debt is null");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtIsNotNull() {
            addCriterion("due_24months_debt is not null");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtEqualTo(BigDecimal value) {
            addCriterion("due_24months_debt =", value, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtNotEqualTo(BigDecimal value) {
            addCriterion("due_24months_debt <>", value, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtGreaterThan(BigDecimal value) {
            addCriterion("due_24months_debt >", value, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("due_24months_debt >=", value, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtLessThan(BigDecimal value) {
            addCriterion("due_24months_debt <", value, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("due_24months_debt <=", value, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtIn(List<BigDecimal> values) {
            addCriterion("due_24months_debt in", values, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtNotIn(List<BigDecimal> values) {
            addCriterion("due_24months_debt not in", values, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_24months_debt between", value1, value2, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue24monthsDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_24months_debt not between", value1, value2, "due24monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtIsNull() {
            addCriterion("due_36months_debt is null");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtIsNotNull() {
            addCriterion("due_36months_debt is not null");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtEqualTo(BigDecimal value) {
            addCriterion("due_36months_debt =", value, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtNotEqualTo(BigDecimal value) {
            addCriterion("due_36months_debt <>", value, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtGreaterThan(BigDecimal value) {
            addCriterion("due_36months_debt >", value, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("due_36months_debt >=", value, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtLessThan(BigDecimal value) {
            addCriterion("due_36months_debt <", value, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("due_36months_debt <=", value, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtIn(List<BigDecimal> values) {
            addCriterion("due_36months_debt in", values, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtNotIn(List<BigDecimal> values) {
            addCriterion("due_36months_debt not in", values, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_36months_debt between", value1, value2, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue36monthsDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_36months_debt not between", value1, value2, "due36monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtIsNull() {
            addCriterion("due_48months_debt is null");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtIsNotNull() {
            addCriterion("due_48months_debt is not null");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtEqualTo(BigDecimal value) {
            addCriterion("due_48months_debt =", value, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtNotEqualTo(BigDecimal value) {
            addCriterion("due_48months_debt <>", value, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtGreaterThan(BigDecimal value) {
            addCriterion("due_48months_debt >", value, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("due_48months_debt >=", value, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtLessThan(BigDecimal value) {
            addCriterion("due_48months_debt <", value, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("due_48months_debt <=", value, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtIn(List<BigDecimal> values) {
            addCriterion("due_48months_debt in", values, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtNotIn(List<BigDecimal> values) {
            addCriterion("due_48months_debt not in", values, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_48months_debt between", value1, value2, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue48monthsDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_48months_debt not between", value1, value2, "due48monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtIsNull() {
            addCriterion("due_60months_debt is null");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtIsNotNull() {
            addCriterion("due_60months_debt is not null");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtEqualTo(BigDecimal value) {
            addCriterion("due_60months_debt =", value, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtNotEqualTo(BigDecimal value) {
            addCriterion("due_60months_debt <>", value, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtGreaterThan(BigDecimal value) {
            addCriterion("due_60months_debt >", value, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("due_60months_debt >=", value, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtLessThan(BigDecimal value) {
            addCriterion("due_60months_debt <", value, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("due_60months_debt <=", value, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtIn(List<BigDecimal> values) {
            addCriterion("due_60months_debt in", values, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtNotIn(List<BigDecimal> values) {
            addCriterion("due_60months_debt not in", values, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_60months_debt between", value1, value2, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andDue60monthsDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_60months_debt not between", value1, value2, "due60monthsDebt");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceIsNull() {
            addCriterion("loan_balance is null");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceIsNotNull() {
            addCriterion("loan_balance is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceEqualTo(BigDecimal value) {
            addCriterion("loan_balance =", value, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceNotEqualTo(BigDecimal value) {
            addCriterion("loan_balance <>", value, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceGreaterThan(BigDecimal value) {
            addCriterion("loan_balance >", value, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_balance >=", value, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceLessThan(BigDecimal value) {
            addCriterion("loan_balance <", value, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_balance <=", value, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceIn(List<BigDecimal> values) {
            addCriterion("loan_balance in", values, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceNotIn(List<BigDecimal> values) {
            addCriterion("loan_balance not in", values, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_balance between", value1, value2, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andLoanBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_balance not between", value1, value2, "loanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumIsNull() {
            addCriterion("credit_card_num is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumIsNotNull() {
            addCriterion("credit_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumEqualTo(Integer value) {
            addCriterion("credit_card_num =", value, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumNotEqualTo(Integer value) {
            addCriterion("credit_card_num <>", value, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumGreaterThan(Integer value) {
            addCriterion("credit_card_num >", value, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_card_num >=", value, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumLessThan(Integer value) {
            addCriterion("credit_card_num <", value, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumLessThanOrEqualTo(Integer value) {
            addCriterion("credit_card_num <=", value, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumIn(List<Integer> values) {
            addCriterion("credit_card_num in", values, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumNotIn(List<Integer> values) {
            addCriterion("credit_card_num not in", values, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumBetween(Integer value1, Integer value2) {
            addCriterion("credit_card_num between", value1, value2, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_card_num not between", value1, value2, "creditCardNum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumIsNull() {
            addCriterion("credit_limit_sum is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumIsNotNull() {
            addCriterion("credit_limit_sum is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumEqualTo(Integer value) {
            addCriterion("credit_limit_sum =", value, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumNotEqualTo(Integer value) {
            addCriterion("credit_limit_sum <>", value, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumGreaterThan(Integer value) {
            addCriterion("credit_limit_sum >", value, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_limit_sum >=", value, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumLessThan(Integer value) {
            addCriterion("credit_limit_sum <", value, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumLessThanOrEqualTo(Integer value) {
            addCriterion("credit_limit_sum <=", value, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumIn(List<Integer> values) {
            addCriterion("credit_limit_sum in", values, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumNotIn(List<Integer> values) {
            addCriterion("credit_limit_sum not in", values, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumBetween(Integer value1, Integer value2) {
            addCriterion("credit_limit_sum between", value1, value2, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andCreditLimitSumNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_limit_sum not between", value1, value2, "creditLimitSum");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthIsNull() {
            addCriterion("avg_used_limit_last_six_month is null");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthIsNotNull() {
            addCriterion("avg_used_limit_last_six_month is not null");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthEqualTo(Integer value) {
            addCriterion("avg_used_limit_last_six_month =", value, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthNotEqualTo(Integer value) {
            addCriterion("avg_used_limit_last_six_month <>", value, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthGreaterThan(Integer value) {
            addCriterion("avg_used_limit_last_six_month >", value, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_used_limit_last_six_month >=", value, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthLessThan(Integer value) {
            addCriterion("avg_used_limit_last_six_month <", value, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthLessThanOrEqualTo(Integer value) {
            addCriterion("avg_used_limit_last_six_month <=", value, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthIn(List<Integer> values) {
            addCriterion("avg_used_limit_last_six_month in", values, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthNotIn(List<Integer> values) {
            addCriterion("avg_used_limit_last_six_month not in", values, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthBetween(Integer value1, Integer value2) {
            addCriterion("avg_used_limit_last_six_month between", value1, value2, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andAvgUsedLimitLastSixMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_used_limit_last_six_month not between", value1, value2, "avgUsedLimitLastSixMonth");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearIsNull() {
            addCriterion("overdue_num_last_year is null");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearIsNotNull() {
            addCriterion("overdue_num_last_year is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearEqualTo(Integer value) {
            addCriterion("overdue_num_last_year =", value, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearNotEqualTo(Integer value) {
            addCriterion("overdue_num_last_year <>", value, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearGreaterThan(Integer value) {
            addCriterion("overdue_num_last_year >", value, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_num_last_year >=", value, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearLessThan(Integer value) {
            addCriterion("overdue_num_last_year <", value, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_num_last_year <=", value, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearIn(List<Integer> values) {
            addCriterion("overdue_num_last_year in", values, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearNotIn(List<Integer> values) {
            addCriterion("overdue_num_last_year not in", values, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearBetween(Integer value1, Integer value2) {
            addCriterion("overdue_num_last_year between", value1, value2, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueNumLastYearNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_num_last_year not between", value1, value2, "overdueNumLastYear");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNull() {
            addCriterion("overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNotNull() {
            addCriterion("overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountEqualTo(Integer value) {
            addCriterion("overdue_amount =", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotEqualTo(Integer value) {
            addCriterion("overdue_amount <>", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThan(Integer value) {
            addCriterion("overdue_amount >", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_amount >=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThan(Integer value) {
            addCriterion("overdue_amount <", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_amount <=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIn(List<Integer> values) {
            addCriterion("overdue_amount in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotIn(List<Integer> values) {
            addCriterion("overdue_amount not in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountBetween(Integer value1, Integer value2) {
            addCriterion("overdue_amount between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_amount not between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountIsNull() {
            addCriterion("guaranteed_amount is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountIsNotNull() {
            addCriterion("guaranteed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountEqualTo(Integer value) {
            addCriterion("guaranteed_amount =", value, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountNotEqualTo(Integer value) {
            addCriterion("guaranteed_amount <>", value, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountGreaterThan(Integer value) {
            addCriterion("guaranteed_amount >", value, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("guaranteed_amount >=", value, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountLessThan(Integer value) {
            addCriterion("guaranteed_amount <", value, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("guaranteed_amount <=", value, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountIn(List<Integer> values) {
            addCriterion("guaranteed_amount in", values, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountNotIn(List<Integer> values) {
            addCriterion("guaranteed_amount not in", values, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountBetween(Integer value1, Integer value2) {
            addCriterion("guaranteed_amount between", value1, value2, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("guaranteed_amount not between", value1, value2, "guaranteedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoIsNull() {
            addCriterion("auth_flow_no is null");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoIsNotNull() {
            addCriterion("auth_flow_no is not null");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoEqualTo(String value) {
            addCriterion("auth_flow_no =", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoNotEqualTo(String value) {
            addCriterion("auth_flow_no <>", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoGreaterThan(String value) {
            addCriterion("auth_flow_no >", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("auth_flow_no >=", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoLessThan(String value) {
            addCriterion("auth_flow_no <", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoLessThanOrEqualTo(String value) {
            addCriterion("auth_flow_no <=", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoLike(String value) {
            addCriterion("auth_flow_no like", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoNotLike(String value) {
            addCriterion("auth_flow_no not like", value, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoIn(List<String> values) {
            addCriterion("auth_flow_no in", values, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoNotIn(List<String> values) {
            addCriterion("auth_flow_no not in", values, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoBetween(String value1, String value2) {
            addCriterion("auth_flow_no between", value1, value2, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andAuthFlowNoNotBetween(String value1, String value2) {
            addCriterion("auth_flow_no not between", value1, value2, "authFlowNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}