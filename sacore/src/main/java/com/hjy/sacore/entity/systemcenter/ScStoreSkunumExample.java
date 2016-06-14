package com.hjy.sacore.entity.systemcenter;

import java.util.ArrayList;
import java.util.List;

public class ScStoreSkunumExample {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	protected String orderByClause;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	protected boolean distinct;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public ScStoreSkunumExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sc_store_skunum
	 *
	 * @mbggenerated
	 */
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

		public Criteria andStoreCodeIsNull() {
			addCriterion("store_code is null");
			return (Criteria) this;
		}

		public Criteria andStoreCodeIsNotNull() {
			addCriterion("store_code is not null");
			return (Criteria) this;
		}

		public Criteria andStoreCodeEqualTo(String value) {
			addCriterion("store_code =", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeNotEqualTo(String value) {
			addCriterion("store_code <>", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeGreaterThan(String value) {
			addCriterion("store_code >", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
			addCriterion("store_code >=", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeLessThan(String value) {
			addCriterion("store_code <", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeLessThanOrEqualTo(String value) {
			addCriterion("store_code <=", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeLike(String value) {
			addCriterion("store_code like", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeNotLike(String value) {
			addCriterion("store_code not like", value, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeIn(List<String> values) {
			addCriterion("store_code in", values, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeNotIn(List<String> values) {
			addCriterion("store_code not in", values, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeBetween(String value1, String value2) {
			addCriterion("store_code between", value1, value2, "storeCode");
			return (Criteria) this;
		}

		public Criteria andStoreCodeNotBetween(String value1, String value2) {
			addCriterion("store_code not between", value1, value2, "storeCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeIsNull() {
			addCriterion("sku_code is null");
			return (Criteria) this;
		}

		public Criteria andSkuCodeIsNotNull() {
			addCriterion("sku_code is not null");
			return (Criteria) this;
		}

		public Criteria andSkuCodeEqualTo(String value) {
			addCriterion("sku_code =", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeNotEqualTo(String value) {
			addCriterion("sku_code <>", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeGreaterThan(String value) {
			addCriterion("sku_code >", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
			addCriterion("sku_code >=", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeLessThan(String value) {
			addCriterion("sku_code <", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeLessThanOrEqualTo(String value) {
			addCriterion("sku_code <=", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeLike(String value) {
			addCriterion("sku_code like", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeNotLike(String value) {
			addCriterion("sku_code not like", value, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeIn(List<String> values) {
			addCriterion("sku_code in", values, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeNotIn(List<String> values) {
			addCriterion("sku_code not in", values, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeBetween(String value1, String value2) {
			addCriterion("sku_code between", value1, value2, "skuCode");
			return (Criteria) this;
		}

		public Criteria andSkuCodeNotBetween(String value1, String value2) {
			addCriterion("sku_code not between", value1, value2, "skuCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeIsNull() {
			addCriterion("batch_code is null");
			return (Criteria) this;
		}

		public Criteria andBatchCodeIsNotNull() {
			addCriterion("batch_code is not null");
			return (Criteria) this;
		}

		public Criteria andBatchCodeEqualTo(String value) {
			addCriterion("batch_code =", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeNotEqualTo(String value) {
			addCriterion("batch_code <>", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeGreaterThan(String value) {
			addCriterion("batch_code >", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeGreaterThanOrEqualTo(String value) {
			addCriterion("batch_code >=", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeLessThan(String value) {
			addCriterion("batch_code <", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeLessThanOrEqualTo(String value) {
			addCriterion("batch_code <=", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeLike(String value) {
			addCriterion("batch_code like", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeNotLike(String value) {
			addCriterion("batch_code not like", value, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeIn(List<String> values) {
			addCriterion("batch_code in", values, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeNotIn(List<String> values) {
			addCriterion("batch_code not in", values, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeBetween(String value1, String value2) {
			addCriterion("batch_code between", value1, value2, "batchCode");
			return (Criteria) this;
		}

		public Criteria andBatchCodeNotBetween(String value1, String value2) {
			addCriterion("batch_code not between", value1, value2, "batchCode");
			return (Criteria) this;
		}

		public Criteria andStockNumIsNull() {
			addCriterion("stock_num is null");
			return (Criteria) this;
		}

		public Criteria andStockNumIsNotNull() {
			addCriterion("stock_num is not null");
			return (Criteria) this;
		}

		public Criteria andStockNumEqualTo(Long value) {
			addCriterion("stock_num =", value, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumNotEqualTo(Long value) {
			addCriterion("stock_num <>", value, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumGreaterThan(Long value) {
			addCriterion("stock_num >", value, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumGreaterThanOrEqualTo(Long value) {
			addCriterion("stock_num >=", value, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumLessThan(Long value) {
			addCriterion("stock_num <", value, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumLessThanOrEqualTo(Long value) {
			addCriterion("stock_num <=", value, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumIn(List<Long> values) {
			addCriterion("stock_num in", values, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumNotIn(List<Long> values) {
			addCriterion("stock_num not in", values, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumBetween(Long value1, Long value2) {
			addCriterion("stock_num between", value1, value2, "stockNum");
			return (Criteria) this;
		}

		public Criteria andStockNumNotBetween(Long value1, Long value2) {
			addCriterion("stock_num not between", value1, value2, "stockNum");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sc_store_skunum
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
	 * the database table sc_store_skunum
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