package com.hjy.sacore.entity.usercenter;

import java.util.ArrayList;
import java.util.List;

public class UcSellercategoryProductRelationExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UcSellercategoryProductRelationExample() {
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

		public Criteria andZidIsNull() {
			addCriterion("zid is null");
			return (Criteria) this;
		}

		public Criteria andZidIsNotNull() {
			addCriterion("zid is not null");
			return (Criteria) this;
		}

		public Criteria andZidEqualTo(Integer value) {
			addCriterion("zid =", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidNotEqualTo(Integer value) {
			addCriterion("zid <>", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidGreaterThan(Integer value) {
			addCriterion("zid >", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidGreaterThanOrEqualTo(Integer value) {
			addCriterion("zid >=", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidLessThan(Integer value) {
			addCriterion("zid <", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidLessThanOrEqualTo(Integer value) {
			addCriterion("zid <=", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidIn(List<Integer> values) {
			addCriterion("zid in", values, "zid");
			return (Criteria) this;
		}

		public Criteria andZidNotIn(List<Integer> values) {
			addCriterion("zid not in", values, "zid");
			return (Criteria) this;
		}

		public Criteria andZidBetween(Integer value1, Integer value2) {
			addCriterion("zid between", value1, value2, "zid");
			return (Criteria) this;
		}

		public Criteria andZidNotBetween(Integer value1, Integer value2) {
			addCriterion("zid not between", value1, value2, "zid");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("uid is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(String value) {
			addCriterion("uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(String value) {
			addCriterion("uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(String value) {
			addCriterion("uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(String value) {
			addCriterion("uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(String value) {
			addCriterion("uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(String value) {
			addCriterion("uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLike(String value) {
			addCriterion("uid like", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotLike(String value) {
			addCriterion("uid not like", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<String> values) {
			addCriterion("uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<String> values) {
			addCriterion("uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(String value1, String value2) {
			addCriterion("uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(String value1, String value2) {
			addCriterion("uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNull() {
			addCriterion("product_code is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNotNull() {
			addCriterion("product_code is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeEqualTo(String value) {
			addCriterion("product_code =", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotEqualTo(String value) {
			addCriterion("product_code <>", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThan(String value) {
			addCriterion("product_code >", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
			addCriterion("product_code >=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThan(String value) {
			addCriterion("product_code <", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThanOrEqualTo(String value) {
			addCriterion("product_code <=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLike(String value) {
			addCriterion("product_code like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotLike(String value) {
			addCriterion("product_code not like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeIn(List<String> values) {
			addCriterion("product_code in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotIn(List<String> values) {
			addCriterion("product_code not in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeBetween(String value1, String value2) {
			addCriterion("product_code between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotBetween(String value1, String value2) {
			addCriterion("product_code not between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeIsNull() {
			addCriterion("category_code is null");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeIsNotNull() {
			addCriterion("category_code is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeEqualTo(String value) {
			addCriterion("category_code =", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeNotEqualTo(String value) {
			addCriterion("category_code <>", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeGreaterThan(String value) {
			addCriterion("category_code >", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
			addCriterion("category_code >=", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeLessThan(String value) {
			addCriterion("category_code <", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
			addCriterion("category_code <=", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeLike(String value) {
			addCriterion("category_code like", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeNotLike(String value) {
			addCriterion("category_code not like", value, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeIn(List<String> values) {
			addCriterion("category_code in", values, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeNotIn(List<String> values) {
			addCriterion("category_code not in", values, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeBetween(String value1, String value2) {
			addCriterion("category_code between", value1, value2, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andCategoryCodeNotBetween(String value1, String value2) {
			addCriterion("category_code not between", value1, value2, "categoryCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeIsNull() {
			addCriterion("seller_code is null");
			return (Criteria) this;
		}

		public Criteria andSellerCodeIsNotNull() {
			addCriterion("seller_code is not null");
			return (Criteria) this;
		}

		public Criteria andSellerCodeEqualTo(String value) {
			addCriterion("seller_code =", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotEqualTo(String value) {
			addCriterion("seller_code <>", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeGreaterThan(String value) {
			addCriterion("seller_code >", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeGreaterThanOrEqualTo(String value) {
			addCriterion("seller_code >=", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeLessThan(String value) {
			addCriterion("seller_code <", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeLessThanOrEqualTo(String value) {
			addCriterion("seller_code <=", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeLike(String value) {
			addCriterion("seller_code like", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotLike(String value) {
			addCriterion("seller_code not like", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeIn(List<String> values) {
			addCriterion("seller_code in", values, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotIn(List<String> values) {
			addCriterion("seller_code not in", values, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeBetween(String value1, String value2) {
			addCriterion("seller_code between", value1, value2, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotBetween(String value1, String value2) {
			addCriterion("seller_code not between", value1, value2, "sellerCode");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table uc_sellercategory_product_relation
	 *
	 * @mbggenerated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table uc_sellercategory_product_relation
	 *
	 * @mbggenerated
	 */
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