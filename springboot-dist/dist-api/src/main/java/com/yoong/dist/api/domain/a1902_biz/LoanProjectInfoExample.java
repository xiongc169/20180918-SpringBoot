package com.yoong.dist.api.domain.a1902_biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanProjectInfoExample() {
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

        public Criteria andProjectNoIsNull() {
            addCriterion("project_no is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("project_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("project_no =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("project_no <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("project_no >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("project_no >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("project_no <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("project_no <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("project_no like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("project_no not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("project_no in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("project_no not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("project_no between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("project_no not between", value1, value2, "projectNo");
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

        public Criteria andBusinessBreedIdIsNull() {
            addCriterion("business_breed_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdIsNotNull() {
            addCriterion("business_breed_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdEqualTo(Long value) {
            addCriterion("business_breed_id =", value, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdNotEqualTo(Long value) {
            addCriterion("business_breed_id <>", value, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdGreaterThan(Long value) {
            addCriterion("business_breed_id >", value, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_breed_id >=", value, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdLessThan(Long value) {
            addCriterion("business_breed_id <", value, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdLessThanOrEqualTo(Long value) {
            addCriterion("business_breed_id <=", value, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdIn(List<Long> values) {
            addCriterion("business_breed_id in", values, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdNotIn(List<Long> values) {
            addCriterion("business_breed_id not in", values, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdBetween(Long value1, Long value2) {
            addCriterion("business_breed_id between", value1, value2, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andBusinessBreedIdNotBetween(Long value1, Long value2) {
            addCriterion("business_breed_id not between", value1, value2, "businessBreedId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdIsNull() {
            addCriterion("financial_product_id is null");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdIsNotNull() {
            addCriterion("financial_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdEqualTo(Long value) {
            addCriterion("financial_product_id =", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdNotEqualTo(Long value) {
            addCriterion("financial_product_id <>", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdGreaterThan(Long value) {
            addCriterion("financial_product_id >", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("financial_product_id >=", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdLessThan(Long value) {
            addCriterion("financial_product_id <", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdLessThanOrEqualTo(Long value) {
            addCriterion("financial_product_id <=", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdIn(List<Long> values) {
            addCriterion("financial_product_id in", values, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdNotIn(List<Long> values) {
            addCriterion("financial_product_id not in", values, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdBetween(Long value1, Long value2) {
            addCriterion("financial_product_id between", value1, value2, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdNotBetween(Long value1, Long value2) {
            addCriterion("financial_product_id not between", value1, value2, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(String value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(String value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(String value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(String value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLike(String value) {
            addCriterion("auth_type like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotLike(String value) {
            addCriterion("auth_type not like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<String> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<String> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(String value1, String value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(String value1, String value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeIsNull() {
            addCriterion("biz_product_type is null");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeIsNotNull() {
            addCriterion("biz_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeEqualTo(String value) {
            addCriterion("biz_product_type =", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeNotEqualTo(String value) {
            addCriterion("biz_product_type <>", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeGreaterThan(String value) {
            addCriterion("biz_product_type >", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_product_type >=", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeLessThan(String value) {
            addCriterion("biz_product_type <", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_product_type <=", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeLike(String value) {
            addCriterion("biz_product_type like", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeNotLike(String value) {
            addCriterion("biz_product_type not like", value, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeIn(List<String> values) {
            addCriterion("biz_product_type in", values, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeNotIn(List<String> values) {
            addCriterion("biz_product_type not in", values, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeBetween(String value1, String value2) {
            addCriterion("biz_product_type between", value1, value2, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andBizProductTypeNotBetween(String value1, String value2) {
            addCriterion("biz_product_type not between", value1, value2, "bizProductType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("sign_type is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("sign_type is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(Integer value) {
            addCriterion("sign_type =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(Integer value) {
            addCriterion("sign_type <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(Integer value) {
            addCriterion("sign_type >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_type >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(Integer value) {
            addCriterion("sign_type <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sign_type <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<Integer> values) {
            addCriterion("sign_type in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<Integer> values) {
            addCriterion("sign_type not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(Integer value1, Integer value2) {
            addCriterion("sign_type between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_type not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeIsNull() {
            addCriterion("outer_sign_type is null");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeIsNotNull() {
            addCriterion("outer_sign_type is not null");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeEqualTo(Integer value) {
            addCriterion("outer_sign_type =", value, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeNotEqualTo(Integer value) {
            addCriterion("outer_sign_type <>", value, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeGreaterThan(Integer value) {
            addCriterion("outer_sign_type >", value, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("outer_sign_type >=", value, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeLessThan(Integer value) {
            addCriterion("outer_sign_type <", value, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("outer_sign_type <=", value, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeIn(List<Integer> values) {
            addCriterion("outer_sign_type in", values, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeNotIn(List<Integer> values) {
            addCriterion("outer_sign_type not in", values, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeBetween(Integer value1, Integer value2) {
            addCriterion("outer_sign_type between", value1, value2, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andOuterSignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("outer_sign_type not between", value1, value2, "outerSignType");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdIsNull() {
            addCriterion("agency_org_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdIsNotNull() {
            addCriterion("agency_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdEqualTo(Long value) {
            addCriterion("agency_org_id =", value, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdNotEqualTo(Long value) {
            addCriterion("agency_org_id <>", value, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdGreaterThan(Long value) {
            addCriterion("agency_org_id >", value, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agency_org_id >=", value, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdLessThan(Long value) {
            addCriterion("agency_org_id <", value, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("agency_org_id <=", value, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdIn(List<Long> values) {
            addCriterion("agency_org_id in", values, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdNotIn(List<Long> values) {
            addCriterion("agency_org_id not in", values, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdBetween(Long value1, Long value2) {
            addCriterion("agency_org_id between", value1, value2, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("agency_org_id not between", value1, value2, "agencyOrgId");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameIsNull() {
            addCriterion("agency_org_name is null");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameIsNotNull() {
            addCriterion("agency_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameEqualTo(String value) {
            addCriterion("agency_org_name =", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameNotEqualTo(String value) {
            addCriterion("agency_org_name <>", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameGreaterThan(String value) {
            addCriterion("agency_org_name >", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("agency_org_name >=", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameLessThan(String value) {
            addCriterion("agency_org_name <", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameLessThanOrEqualTo(String value) {
            addCriterion("agency_org_name <=", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameLike(String value) {
            addCriterion("agency_org_name like", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameNotLike(String value) {
            addCriterion("agency_org_name not like", value, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameIn(List<String> values) {
            addCriterion("agency_org_name in", values, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameNotIn(List<String> values) {
            addCriterion("agency_org_name not in", values, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameBetween(String value1, String value2) {
            addCriterion("agency_org_name between", value1, value2, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andAgencyOrgNameNotBetween(String value1, String value2) {
            addCriterion("agency_org_name not between", value1, value2, "agencyOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdIsNull() {
            addCriterion("branch_org_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdIsNotNull() {
            addCriterion("branch_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdEqualTo(Long value) {
            addCriterion("branch_org_id =", value, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdNotEqualTo(Long value) {
            addCriterion("branch_org_id <>", value, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdGreaterThan(Long value) {
            addCriterion("branch_org_id >", value, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("branch_org_id >=", value, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdLessThan(Long value) {
            addCriterion("branch_org_id <", value, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("branch_org_id <=", value, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdIn(List<Long> values) {
            addCriterion("branch_org_id in", values, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdNotIn(List<Long> values) {
            addCriterion("branch_org_id not in", values, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdBetween(Long value1, Long value2) {
            addCriterion("branch_org_id between", value1, value2, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("branch_org_id not between", value1, value2, "branchOrgId");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameIsNull() {
            addCriterion("branch_org_name is null");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameIsNotNull() {
            addCriterion("branch_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameEqualTo(String value) {
            addCriterion("branch_org_name =", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameNotEqualTo(String value) {
            addCriterion("branch_org_name <>", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameGreaterThan(String value) {
            addCriterion("branch_org_name >", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("branch_org_name >=", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameLessThan(String value) {
            addCriterion("branch_org_name <", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameLessThanOrEqualTo(String value) {
            addCriterion("branch_org_name <=", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameLike(String value) {
            addCriterion("branch_org_name like", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameNotLike(String value) {
            addCriterion("branch_org_name not like", value, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameIn(List<String> values) {
            addCriterion("branch_org_name in", values, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameNotIn(List<String> values) {
            addCriterion("branch_org_name not in", values, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameBetween(String value1, String value2) {
            addCriterion("branch_org_name between", value1, value2, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andBranchOrgNameNotBetween(String value1, String value2) {
            addCriterion("branch_org_name not between", value1, value2, "branchOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdIsNull() {
            addCriterion("sub_org_id is null");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdIsNotNull() {
            addCriterion("sub_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdEqualTo(Long value) {
            addCriterion("sub_org_id =", value, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdNotEqualTo(Long value) {
            addCriterion("sub_org_id <>", value, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdGreaterThan(Long value) {
            addCriterion("sub_org_id >", value, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sub_org_id >=", value, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdLessThan(Long value) {
            addCriterion("sub_org_id <", value, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("sub_org_id <=", value, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdIn(List<Long> values) {
            addCriterion("sub_org_id in", values, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdNotIn(List<Long> values) {
            addCriterion("sub_org_id not in", values, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdBetween(Long value1, Long value2) {
            addCriterion("sub_org_id between", value1, value2, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("sub_org_id not between", value1, value2, "subOrgId");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameIsNull() {
            addCriterion("sub_org_name is null");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameIsNotNull() {
            addCriterion("sub_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameEqualTo(String value) {
            addCriterion("sub_org_name =", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameNotEqualTo(String value) {
            addCriterion("sub_org_name <>", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameGreaterThan(String value) {
            addCriterion("sub_org_name >", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_org_name >=", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameLessThan(String value) {
            addCriterion("sub_org_name <", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameLessThanOrEqualTo(String value) {
            addCriterion("sub_org_name <=", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameLike(String value) {
            addCriterion("sub_org_name like", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameNotLike(String value) {
            addCriterion("sub_org_name not like", value, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameIn(List<String> values) {
            addCriterion("sub_org_name in", values, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameNotIn(List<String> values) {
            addCriterion("sub_org_name not in", values, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameBetween(String value1, String value2) {
            addCriterion("sub_org_name between", value1, value2, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andSubOrgNameNotBetween(String value1, String value2) {
            addCriterion("sub_org_name not between", value1, value2, "subOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdIsNull() {
            addCriterion("fund_org_id is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdIsNotNull() {
            addCriterion("fund_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdEqualTo(Long value) {
            addCriterion("fund_org_id =", value, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdNotEqualTo(Long value) {
            addCriterion("fund_org_id <>", value, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdGreaterThan(Long value) {
            addCriterion("fund_org_id >", value, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fund_org_id >=", value, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdLessThan(Long value) {
            addCriterion("fund_org_id <", value, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("fund_org_id <=", value, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdIn(List<Long> values) {
            addCriterion("fund_org_id in", values, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdNotIn(List<Long> values) {
            addCriterion("fund_org_id not in", values, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdBetween(Long value1, Long value2) {
            addCriterion("fund_org_id between", value1, value2, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("fund_org_id not between", value1, value2, "fundOrgId");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNull() {
            addCriterion("fund_org_name is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNotNull() {
            addCriterion("fund_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameEqualTo(String value) {
            addCriterion("fund_org_name =", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotEqualTo(String value) {
            addCriterion("fund_org_name <>", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThan(String value) {
            addCriterion("fund_org_name >", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_org_name >=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThan(String value) {
            addCriterion("fund_org_name <", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThanOrEqualTo(String value) {
            addCriterion("fund_org_name <=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLike(String value) {
            addCriterion("fund_org_name like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotLike(String value) {
            addCriterion("fund_org_name not like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIn(List<String> values) {
            addCriterion("fund_org_name in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotIn(List<String> values) {
            addCriterion("fund_org_name not in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameBetween(String value1, String value2) {
            addCriterion("fund_org_name between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotBetween(String value1, String value2) {
            addCriterion("fund_org_name not between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeIsNull() {
            addCriterion("outer_fund_system_type is null");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeIsNotNull() {
            addCriterion("outer_fund_system_type is not null");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeEqualTo(Integer value) {
            addCriterion("outer_fund_system_type =", value, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeNotEqualTo(Integer value) {
            addCriterion("outer_fund_system_type <>", value, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeGreaterThan(Integer value) {
            addCriterion("outer_fund_system_type >", value, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("outer_fund_system_type >=", value, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeLessThan(Integer value) {
            addCriterion("outer_fund_system_type <", value, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("outer_fund_system_type <=", value, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeIn(List<Integer> values) {
            addCriterion("outer_fund_system_type in", values, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeNotIn(List<Integer> values) {
            addCriterion("outer_fund_system_type not in", values, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeBetween(Integer value1, Integer value2) {
            addCriterion("outer_fund_system_type between", value1, value2, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andOuterFundSystemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("outer_fund_system_type not between", value1, value2, "outerFundSystemType");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdIsNull() {
            addCriterion("customer_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdIsNotNull() {
            addCriterion("customer_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdEqualTo(Long value) {
            addCriterion("customer_manager_id =", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotEqualTo(Long value) {
            addCriterion("customer_manager_id <>", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdGreaterThan(Long value) {
            addCriterion("customer_manager_id >", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_manager_id >=", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdLessThan(Long value) {
            addCriterion("customer_manager_id <", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_manager_id <=", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdIn(List<Long> values) {
            addCriterion("customer_manager_id in", values, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotIn(List<Long> values) {
            addCriterion("customer_manager_id not in", values, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdBetween(Long value1, Long value2) {
            addCriterion("customer_manager_id between", value1, value2, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_manager_id not between", value1, value2, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameIsNull() {
            addCriterion("customer_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameIsNotNull() {
            addCriterion("customer_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameEqualTo(String value) {
            addCriterion("customer_manager_name =", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotEqualTo(String value) {
            addCriterion("customer_manager_name <>", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameGreaterThan(String value) {
            addCriterion("customer_manager_name >", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager_name >=", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameLessThan(String value) {
            addCriterion("customer_manager_name <", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_manager_name <=", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameLike(String value) {
            addCriterion("customer_manager_name like", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotLike(String value) {
            addCriterion("customer_manager_name not like", value, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameIn(List<String> values) {
            addCriterion("customer_manager_name in", values, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotIn(List<String> values) {
            addCriterion("customer_manager_name not in", values, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameBetween(String value1, String value2) {
            addCriterion("customer_manager_name between", value1, value2, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNameNotBetween(String value1, String value2) {
            addCriterion("customer_manager_name not between", value1, value2, "customerManagerName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
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