package com.yoong.dist.api.domain.a1902_stage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankSettingExample() {
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIsNull() {
            addCriterion("agency_code is null");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIsNotNull() {
            addCriterion("agency_code is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeEqualTo(String value) {
            addCriterion("agency_code =", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotEqualTo(String value) {
            addCriterion("agency_code <>", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeGreaterThan(String value) {
            addCriterion("agency_code >", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("agency_code >=", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLessThan(String value) {
            addCriterion("agency_code <", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLessThanOrEqualTo(String value) {
            addCriterion("agency_code <=", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLike(String value) {
            addCriterion("agency_code like", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotLike(String value) {
            addCriterion("agency_code not like", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIn(List<String> values) {
            addCriterion("agency_code in", values, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotIn(List<String> values) {
            addCriterion("agency_code not in", values, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeBetween(String value1, String value2) {
            addCriterion("agency_code between", value1, value2, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotBetween(String value1, String value2) {
            addCriterion("agency_code not between", value1, value2, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAssurerNoIsNull() {
            addCriterion("assurer_no is null");
            return (Criteria) this;
        }

        public Criteria andAssurerNoIsNotNull() {
            addCriterion("assurer_no is not null");
            return (Criteria) this;
        }

        public Criteria andAssurerNoEqualTo(String value) {
            addCriterion("assurer_no =", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoNotEqualTo(String value) {
            addCriterion("assurer_no <>", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoGreaterThan(String value) {
            addCriterion("assurer_no >", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoGreaterThanOrEqualTo(String value) {
            addCriterion("assurer_no >=", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoLessThan(String value) {
            addCriterion("assurer_no <", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoLessThanOrEqualTo(String value) {
            addCriterion("assurer_no <=", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoLike(String value) {
            addCriterion("assurer_no like", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoNotLike(String value) {
            addCriterion("assurer_no not like", value, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoIn(List<String> values) {
            addCriterion("assurer_no in", values, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoNotIn(List<String> values) {
            addCriterion("assurer_no not in", values, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoBetween(String value1, String value2) {
            addCriterion("assurer_no between", value1, value2, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andAssurerNoNotBetween(String value1, String value2) {
            addCriterion("assurer_no not between", value1, value2, "assurerNo");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("bank_type =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("bank_type <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("bank_type >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_type >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("bank_type <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_type <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("bank_type like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("bank_type not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("bank_type in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("bank_type not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("bank_type between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("bank_type not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountIsNull() {
            addCriterion("credit_receive_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountIsNotNull() {
            addCriterion("credit_receive_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountEqualTo(Integer value) {
            addCriterion("credit_receive_amount =", value, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountNotEqualTo(Integer value) {
            addCriterion("credit_receive_amount <>", value, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountGreaterThan(Integer value) {
            addCriterion("credit_receive_amount >", value, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_receive_amount >=", value, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountLessThan(Integer value) {
            addCriterion("credit_receive_amount <", value, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountLessThanOrEqualTo(Integer value) {
            addCriterion("credit_receive_amount <=", value, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountIn(List<Integer> values) {
            addCriterion("credit_receive_amount in", values, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountNotIn(List<Integer> values) {
            addCriterion("credit_receive_amount not in", values, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountBetween(Integer value1, Integer value2) {
            addCriterion("credit_receive_amount between", value1, value2, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andCreditReceiveAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_receive_amount not between", value1, value2, "creditReceiveAmount");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumIsNull() {
            addCriterion("marketing_archives_num is null");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumIsNotNull() {
            addCriterion("marketing_archives_num is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumEqualTo(String value) {
            addCriterion("marketing_archives_num =", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumNotEqualTo(String value) {
            addCriterion("marketing_archives_num <>", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumGreaterThan(String value) {
            addCriterion("marketing_archives_num >", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_archives_num >=", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumLessThan(String value) {
            addCriterion("marketing_archives_num <", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumLessThanOrEqualTo(String value) {
            addCriterion("marketing_archives_num <=", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumLike(String value) {
            addCriterion("marketing_archives_num like", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumNotLike(String value) {
            addCriterion("marketing_archives_num not like", value, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumIn(List<String> values) {
            addCriterion("marketing_archives_num in", values, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumNotIn(List<String> values) {
            addCriterion("marketing_archives_num not in", values, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumBetween(String value1, String value2) {
            addCriterion("marketing_archives_num between", value1, value2, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andMarketingArchivesNumNotBetween(String value1, String value2) {
            addCriterion("marketing_archives_num not between", value1, value2, "marketingArchivesNum");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Integer value) {
            addCriterion("org_type =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Integer value) {
            addCriterion("org_type <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Integer value) {
            addCriterion("org_type >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_type >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Integer value) {
            addCriterion("org_type <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("org_type <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Integer> values) {
            addCriterion("org_type in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Integer> values) {
            addCriterion("org_type not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Integer value1, Integer value2) {
            addCriterion("org_type between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_type not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andPlatNoIsNull() {
            addCriterion("plat_no is null");
            return (Criteria) this;
        }

        public Criteria andPlatNoIsNotNull() {
            addCriterion("plat_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlatNoEqualTo(String value) {
            addCriterion("plat_no =", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoNotEqualTo(String value) {
            addCriterion("plat_no <>", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoGreaterThan(String value) {
            addCriterion("plat_no >", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoGreaterThanOrEqualTo(String value) {
            addCriterion("plat_no >=", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoLessThan(String value) {
            addCriterion("plat_no <", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoLessThanOrEqualTo(String value) {
            addCriterion("plat_no <=", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoLike(String value) {
            addCriterion("plat_no like", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoNotLike(String value) {
            addCriterion("plat_no not like", value, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoIn(List<String> values) {
            addCriterion("plat_no in", values, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoNotIn(List<String> values) {
            addCriterion("plat_no not in", values, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoBetween(String value1, String value2) {
            addCriterion("plat_no between", value1, value2, "platNo");
            return (Criteria) this;
        }

        public Criteria andPlatNoNotBetween(String value1, String value2) {
            addCriterion("plat_no not between", value1, value2, "platNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeIsNull() {
            addCriterion("bank_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeIsNotNull() {
            addCriterion("bank_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee =", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee <>", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("bank_service_fee >", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee >=", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeLessThan(BigDecimal value) {
            addCriterion("bank_service_fee <", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee <=", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeIn(List<BigDecimal> values) {
            addCriterion("bank_service_fee in", values, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("bank_service_fee not in", values, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_service_fee between", value1, value2, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_service_fee not between", value1, value2, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andIsCocomIsNull() {
            addCriterion("is_cocom is null");
            return (Criteria) this;
        }

        public Criteria andIsCocomIsNotNull() {
            addCriterion("is_cocom is not null");
            return (Criteria) this;
        }

        public Criteria andIsCocomEqualTo(Integer value) {
            addCriterion("is_cocom =", value, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomNotEqualTo(Integer value) {
            addCriterion("is_cocom <>", value, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomGreaterThan(Integer value) {
            addCriterion("is_cocom >", value, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_cocom >=", value, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomLessThan(Integer value) {
            addCriterion("is_cocom <", value, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomLessThanOrEqualTo(Integer value) {
            addCriterion("is_cocom <=", value, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomIn(List<Integer> values) {
            addCriterion("is_cocom in", values, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomNotIn(List<Integer> values) {
            addCriterion("is_cocom not in", values, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomBetween(Integer value1, Integer value2) {
            addCriterion("is_cocom between", value1, value2, "isCocom");
            return (Criteria) this;
        }

        public Criteria andIsCocomNotBetween(Integer value1, Integer value2) {
            addCriterion("is_cocom not between", value1, value2, "isCocom");
            return (Criteria) this;
        }

        public Criteria andCocomIdIsNull() {
            addCriterion("cocom_id is null");
            return (Criteria) this;
        }

        public Criteria andCocomIdIsNotNull() {
            addCriterion("cocom_id is not null");
            return (Criteria) this;
        }

        public Criteria andCocomIdEqualTo(String value) {
            addCriterion("cocom_id =", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdNotEqualTo(String value) {
            addCriterion("cocom_id <>", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdGreaterThan(String value) {
            addCriterion("cocom_id >", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdGreaterThanOrEqualTo(String value) {
            addCriterion("cocom_id >=", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdLessThan(String value) {
            addCriterion("cocom_id <", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdLessThanOrEqualTo(String value) {
            addCriterion("cocom_id <=", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdLike(String value) {
            addCriterion("cocom_id like", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdNotLike(String value) {
            addCriterion("cocom_id not like", value, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdIn(List<String> values) {
            addCriterion("cocom_id in", values, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdNotIn(List<String> values) {
            addCriterion("cocom_id not in", values, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdBetween(String value1, String value2) {
            addCriterion("cocom_id between", value1, value2, "cocomId");
            return (Criteria) this;
        }

        public Criteria andCocomIdNotBetween(String value1, String value2) {
            addCriterion("cocom_id not between", value1, value2, "cocomId");
            return (Criteria) this;
        }

        public Criteria andIsInvokeIsNull() {
            addCriterion("is_invoke is null");
            return (Criteria) this;
        }

        public Criteria andIsInvokeIsNotNull() {
            addCriterion("is_invoke is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvokeEqualTo(Integer value) {
            addCriterion("is_invoke =", value, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeNotEqualTo(Integer value) {
            addCriterion("is_invoke <>", value, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeGreaterThan(Integer value) {
            addCriterion("is_invoke >", value, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_invoke >=", value, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeLessThan(Integer value) {
            addCriterion("is_invoke <", value, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeLessThanOrEqualTo(Integer value) {
            addCriterion("is_invoke <=", value, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeIn(List<Integer> values) {
            addCriterion("is_invoke in", values, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeNotIn(List<Integer> values) {
            addCriterion("is_invoke not in", values, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeBetween(Integer value1, Integer value2) {
            addCriterion("is_invoke between", value1, value2, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andIsInvokeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_invoke not between", value1, value2, "isInvoke");
            return (Criteria) this;
        }

        public Criteria andReczonenoIsNull() {
            addCriterion("reczoneno is null");
            return (Criteria) this;
        }

        public Criteria andReczonenoIsNotNull() {
            addCriterion("reczoneno is not null");
            return (Criteria) this;
        }

        public Criteria andReczonenoEqualTo(String value) {
            addCriterion("reczoneno =", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoNotEqualTo(String value) {
            addCriterion("reczoneno <>", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoGreaterThan(String value) {
            addCriterion("reczoneno >", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoGreaterThanOrEqualTo(String value) {
            addCriterion("reczoneno >=", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoLessThan(String value) {
            addCriterion("reczoneno <", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoLessThanOrEqualTo(String value) {
            addCriterion("reczoneno <=", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoLike(String value) {
            addCriterion("reczoneno like", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoNotLike(String value) {
            addCriterion("reczoneno not like", value, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoIn(List<String> values) {
            addCriterion("reczoneno in", values, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoNotIn(List<String> values) {
            addCriterion("reczoneno not in", values, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoBetween(String value1, String value2) {
            addCriterion("reczoneno between", value1, value2, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andReczonenoNotBetween(String value1, String value2) {
            addCriterion("reczoneno not between", value1, value2, "reczoneno");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeIsNull() {
            addCriterion("guarantee_code is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeIsNotNull() {
            addCriterion("guarantee_code is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeEqualTo(String value) {
            addCriterion("guarantee_code =", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeNotEqualTo(String value) {
            addCriterion("guarantee_code <>", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeGreaterThan(String value) {
            addCriterion("guarantee_code >", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_code >=", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeLessThan(String value) {
            addCriterion("guarantee_code <", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeLessThanOrEqualTo(String value) {
            addCriterion("guarantee_code <=", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeLike(String value) {
            addCriterion("guarantee_code like", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeNotLike(String value) {
            addCriterion("guarantee_code not like", value, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeIn(List<String> values) {
            addCriterion("guarantee_code in", values, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeNotIn(List<String> values) {
            addCriterion("guarantee_code not in", values, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeBetween(String value1, String value2) {
            addCriterion("guarantee_code between", value1, value2, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCodeNotBetween(String value1, String value2) {
            addCriterion("guarantee_code not between", value1, value2, "guaranteeCode");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNull() {
            addCriterion("market_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNotNull() {
            addCriterion("market_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketIdEqualTo(String value) {
            addCriterion("market_id =", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotEqualTo(String value) {
            addCriterion("market_id <>", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThan(String value) {
            addCriterion("market_id >", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThanOrEqualTo(String value) {
            addCriterion("market_id >=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThan(String value) {
            addCriterion("market_id <", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThanOrEqualTo(String value) {
            addCriterion("market_id <=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLike(String value) {
            addCriterion("market_id like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotLike(String value) {
            addCriterion("market_id not like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIn(List<String> values) {
            addCriterion("market_id in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotIn(List<String> values) {
            addCriterion("market_id not in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdBetween(String value1, String value2) {
            addCriterion("market_id between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotBetween(String value1, String value2) {
            addCriterion("market_id not between", value1, value2, "marketId");
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