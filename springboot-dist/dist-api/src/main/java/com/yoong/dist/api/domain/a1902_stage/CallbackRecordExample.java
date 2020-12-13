package com.yoong.dist.api.domain.a1902_stage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallbackRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallbackRecordExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andBusiCodeIsNull() {
            addCriterion("busi_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNotNull() {
            addCriterion("busi_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeEqualTo(String value) {
            addCriterion("busi_code =", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotEqualTo(String value) {
            addCriterion("busi_code <>", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThan(String value) {
            addCriterion("busi_code >", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_code >=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThan(String value) {
            addCriterion("busi_code <", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_code <=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLike(String value) {
            addCriterion("busi_code like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotLike(String value) {
            addCriterion("busi_code not like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIn(List<String> values) {
            addCriterion("busi_code in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotIn(List<String> values) {
            addCriterion("busi_code not in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeBetween(String value1, String value2) {
            addCriterion("busi_code between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotBetween(String value1, String value2) {
            addCriterion("busi_code not between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("trans_type is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("trans_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Integer value) {
            addCriterion("trans_type =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Integer value) {
            addCriterion("trans_type <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Integer value) {
            addCriterion("trans_type >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_type >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Integer value) {
            addCriterion("trans_type <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trans_type <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Integer> values) {
            addCriterion("trans_type in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Integer> values) {
            addCriterion("trans_type not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Integer value1, Integer value2) {
            addCriterion("trans_type between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_type not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
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