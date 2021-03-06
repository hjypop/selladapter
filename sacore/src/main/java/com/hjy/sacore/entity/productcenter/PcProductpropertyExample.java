package com.hjy.sacore.entity.productcenter;

import java.util.ArrayList;
import java.util.List;

public class PcProductpropertyExample {
	protected String orderByClause;
	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PcProductpropertyExample() {
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

		public Criteria andPropertyKeycodeIsNull() {
			addCriterion("property_keycode is null");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeIsNotNull() {
			addCriterion("property_keycode is not null");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeEqualTo(String value) {
			addCriterion("property_keycode =", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeNotEqualTo(String value) {
			addCriterion("property_keycode <>", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeGreaterThan(String value) {
			addCriterion("property_keycode >", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeGreaterThanOrEqualTo(String value) {
			addCriterion("property_keycode >=", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeLessThan(String value) {
			addCriterion("property_keycode <", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeLessThanOrEqualTo(String value) {
			addCriterion("property_keycode <=", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeLike(String value) {
			addCriterion("property_keycode like", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeNotLike(String value) {
			addCriterion("property_keycode not like", value, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeIn(List<String> values) {
			addCriterion("property_keycode in", values, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeNotIn(List<String> values) {
			addCriterion("property_keycode not in", values, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeBetween(String value1, String value2) {
			addCriterion("property_keycode between", value1, value2, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeycodeNotBetween(String value1, String value2) {
			addCriterion("property_keycode not between", value1, value2, "propertyKeycode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeIsNull() {
			addCriterion("property_code is null");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeIsNotNull() {
			addCriterion("property_code is not null");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeEqualTo(String value) {
			addCriterion("property_code =", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeNotEqualTo(String value) {
			addCriterion("property_code <>", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeGreaterThan(String value) {
			addCriterion("property_code >", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeGreaterThanOrEqualTo(String value) {
			addCriterion("property_code >=", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeLessThan(String value) {
			addCriterion("property_code <", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeLessThanOrEqualTo(String value) {
			addCriterion("property_code <=", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeLike(String value) {
			addCriterion("property_code like", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeNotLike(String value) {
			addCriterion("property_code not like", value, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeIn(List<String> values) {
			addCriterion("property_code in", values, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeNotIn(List<String> values) {
			addCriterion("property_code not in", values, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeBetween(String value1, String value2) {
			addCriterion("property_code between", value1, value2, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyCodeNotBetween(String value1, String value2) {
			addCriterion("property_code not between", value1, value2, "propertyCode");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyIsNull() {
			addCriterion("property_key is null");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyIsNotNull() {
			addCriterion("property_key is not null");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyEqualTo(String value) {
			addCriterion("property_key =", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyNotEqualTo(String value) {
			addCriterion("property_key <>", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyGreaterThan(String value) {
			addCriterion("property_key >", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyGreaterThanOrEqualTo(String value) {
			addCriterion("property_key >=", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyLessThan(String value) {
			addCriterion("property_key <", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyLessThanOrEqualTo(String value) {
			addCriterion("property_key <=", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyLike(String value) {
			addCriterion("property_key like", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyNotLike(String value) {
			addCriterion("property_key not like", value, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyIn(List<String> values) {
			addCriterion("property_key in", values, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyNotIn(List<String> values) {
			addCriterion("property_key not in", values, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyBetween(String value1, String value2) {
			addCriterion("property_key between", value1, value2, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyKeyNotBetween(String value1, String value2) {
			addCriterion("property_key not between", value1, value2, "propertyKey");
			return (Criteria) this;
		}

		public Criteria andPropertyValueIsNull() {
			addCriterion("property_value is null");
			return (Criteria) this;
		}

		public Criteria andPropertyValueIsNotNull() {
			addCriterion("property_value is not null");
			return (Criteria) this;
		}

		public Criteria andPropertyValueEqualTo(String value) {
			addCriterion("property_value =", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueNotEqualTo(String value) {
			addCriterion("property_value <>", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueGreaterThan(String value) {
			addCriterion("property_value >", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueGreaterThanOrEqualTo(String value) {
			addCriterion("property_value >=", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueLessThan(String value) {
			addCriterion("property_value <", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueLessThanOrEqualTo(String value) {
			addCriterion("property_value <=", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueLike(String value) {
			addCriterion("property_value like", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueNotLike(String value) {
			addCriterion("property_value not like", value, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueIn(List<String> values) {
			addCriterion("property_value in", values, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueNotIn(List<String> values) {
			addCriterion("property_value not in", values, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueBetween(String value1, String value2) {
			addCriterion("property_value between", value1, value2, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyValueNotBetween(String value1, String value2) {
			addCriterion("property_value not between", value1, value2, "propertyValue");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeIsNull() {
			addCriterion("property_type is null");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeIsNotNull() {
			addCriterion("property_type is not null");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeEqualTo(String value) {
			addCriterion("property_type =", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeNotEqualTo(String value) {
			addCriterion("property_type <>", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeGreaterThan(String value) {
			addCriterion("property_type >", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
			addCriterion("property_type >=", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeLessThan(String value) {
			addCriterion("property_type <", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
			addCriterion("property_type <=", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeLike(String value) {
			addCriterion("property_type like", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeNotLike(String value) {
			addCriterion("property_type not like", value, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeIn(List<String> values) {
			addCriterion("property_type in", values, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeNotIn(List<String> values) {
			addCriterion("property_type not in", values, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeBetween(String value1, String value2) {
			addCriterion("property_type between", value1, value2, "propertyType");
			return (Criteria) this;
		}

		public Criteria andPropertyTypeNotBetween(String value1, String value2) {
			addCriterion("property_type not between", value1, value2, "propertyType");
			return (Criteria) this;
		}

		public Criteria andBigSortIsNull() {
			addCriterion("big_sort is null");
			return (Criteria) this;
		}

		public Criteria andBigSortIsNotNull() {
			addCriterion("big_sort is not null");
			return (Criteria) this;
		}

		public Criteria andBigSortEqualTo(Integer value) {
			addCriterion("big_sort =", value, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortNotEqualTo(Integer value) {
			addCriterion("big_sort <>", value, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortGreaterThan(Integer value) {
			addCriterion("big_sort >", value, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("big_sort >=", value, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortLessThan(Integer value) {
			addCriterion("big_sort <", value, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortLessThanOrEqualTo(Integer value) {
			addCriterion("big_sort <=", value, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortIn(List<Integer> values) {
			addCriterion("big_sort in", values, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortNotIn(List<Integer> values) {
			addCriterion("big_sort not in", values, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortBetween(Integer value1, Integer value2) {
			addCriterion("big_sort between", value1, value2, "bigSort");
			return (Criteria) this;
		}

		public Criteria andBigSortNotBetween(Integer value1, Integer value2) {
			addCriterion("big_sort not between", value1, value2, "bigSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortIsNull() {
			addCriterion("small_sort is null");
			return (Criteria) this;
		}

		public Criteria andSmallSortIsNotNull() {
			addCriterion("small_sort is not null");
			return (Criteria) this;
		}

		public Criteria andSmallSortEqualTo(Integer value) {
			addCriterion("small_sort =", value, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortNotEqualTo(Integer value) {
			addCriterion("small_sort <>", value, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortGreaterThan(Integer value) {
			addCriterion("small_sort >", value, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("small_sort >=", value, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortLessThan(Integer value) {
			addCriterion("small_sort <", value, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortLessThanOrEqualTo(Integer value) {
			addCriterion("small_sort <=", value, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortIn(List<Integer> values) {
			addCriterion("small_sort in", values, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortNotIn(List<Integer> values) {
			addCriterion("small_sort not in", values, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortBetween(Integer value1, Integer value2) {
			addCriterion("small_sort between", value1, value2, "smallSort");
			return (Criteria) this;
		}

		public Criteria andSmallSortNotBetween(Integer value1, Integer value2) {
			addCriterion("small_sort not between", value1, value2, "smallSort");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table pc_productproperty
	 *
	 * @mbggenerated do_not_delete_during_merge
	 */
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