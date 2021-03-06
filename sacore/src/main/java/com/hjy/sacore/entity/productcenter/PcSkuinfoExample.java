package com.hjy.sacore.entity.productcenter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PcSkuinfoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public PcSkuinfoExample() {
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

		public Criteria andSkuCodeOldIsNull() {
			addCriterion("sku_code_old is null");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldIsNotNull() {
			addCriterion("sku_code_old is not null");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldEqualTo(String value) {
			addCriterion("sku_code_old =", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldNotEqualTo(String value) {
			addCriterion("sku_code_old <>", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldGreaterThan(String value) {
			addCriterion("sku_code_old >", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldGreaterThanOrEqualTo(String value) {
			addCriterion("sku_code_old >=", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldLessThan(String value) {
			addCriterion("sku_code_old <", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldLessThanOrEqualTo(String value) {
			addCriterion("sku_code_old <=", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldLike(String value) {
			addCriterion("sku_code_old like", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldNotLike(String value) {
			addCriterion("sku_code_old not like", value, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldIn(List<String> values) {
			addCriterion("sku_code_old in", values, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldNotIn(List<String> values) {
			addCriterion("sku_code_old not in", values, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldBetween(String value1, String value2) {
			addCriterion("sku_code_old between", value1, value2, "skuCodeOld");
			return (Criteria) this;
		}

		public Criteria andSkuCodeOldNotBetween(String value1, String value2) {
			addCriterion("sku_code_old not between", value1, value2, "skuCodeOld");
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

		public Criteria andSellPriceIsNull() {
			addCriterion("sell_price is null");
			return (Criteria) this;
		}

		public Criteria andSellPriceIsNotNull() {
			addCriterion("sell_price is not null");
			return (Criteria) this;
		}

		public Criteria andSellPriceEqualTo(BigDecimal value) {
			addCriterion("sell_price =", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceNotEqualTo(BigDecimal value) {
			addCriterion("sell_price <>", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceGreaterThan(BigDecimal value) {
			addCriterion("sell_price >", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("sell_price >=", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceLessThan(BigDecimal value) {
			addCriterion("sell_price <", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("sell_price <=", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceIn(List<BigDecimal> values) {
			addCriterion("sell_price in", values, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceNotIn(List<BigDecimal> values) {
			addCriterion("sell_price not in", values, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("sell_price between", value1, value2, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("sell_price not between", value1, value2, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIsNull() {
			addCriterion("market_price is null");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIsNotNull() {
			addCriterion("market_price is not null");
			return (Criteria) this;
		}

		public Criteria andMarketPriceEqualTo(BigDecimal value) {
			addCriterion("market_price =", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
			addCriterion("market_price <>", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceGreaterThan(BigDecimal value) {
			addCriterion("market_price >", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("market_price >=", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceLessThan(BigDecimal value) {
			addCriterion("market_price <", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("market_price <=", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIn(List<BigDecimal> values) {
			addCriterion("market_price in", values, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
			addCriterion("market_price not in", values, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("market_price between", value1, value2, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("market_price not between", value1, value2, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceIsNull() {
			addCriterion("cost_price is null");
			return (Criteria) this;
		}

		public Criteria andCostPriceIsNotNull() {
			addCriterion("cost_price is not null");
			return (Criteria) this;
		}

		public Criteria andCostPriceEqualTo(BigDecimal value) {
			addCriterion("cost_price =", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceNotEqualTo(BigDecimal value) {
			addCriterion("cost_price <>", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceGreaterThan(BigDecimal value) {
			addCriterion("cost_price >", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("cost_price >=", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceLessThan(BigDecimal value) {
			addCriterion("cost_price <", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("cost_price <=", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceIn(List<BigDecimal> values) {
			addCriterion("cost_price in", values, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceNotIn(List<BigDecimal> values) {
			addCriterion("cost_price not in", values, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("cost_price between", value1, value2, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("cost_price not between", value1, value2, "costPrice");
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

		public Criteria andSkuKeyIsNull() {
			addCriterion("sku_key is null");
			return (Criteria) this;
		}

		public Criteria andSkuKeyIsNotNull() {
			addCriterion("sku_key is not null");
			return (Criteria) this;
		}

		public Criteria andSkuKeyEqualTo(String value) {
			addCriterion("sku_key =", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyNotEqualTo(String value) {
			addCriterion("sku_key <>", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyGreaterThan(String value) {
			addCriterion("sku_key >", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyGreaterThanOrEqualTo(String value) {
			addCriterion("sku_key >=", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyLessThan(String value) {
			addCriterion("sku_key <", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyLessThanOrEqualTo(String value) {
			addCriterion("sku_key <=", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyLike(String value) {
			addCriterion("sku_key like", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyNotLike(String value) {
			addCriterion("sku_key not like", value, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyIn(List<String> values) {
			addCriterion("sku_key in", values, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyNotIn(List<String> values) {
			addCriterion("sku_key not in", values, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyBetween(String value1, String value2) {
			addCriterion("sku_key between", value1, value2, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyNotBetween(String value1, String value2) {
			addCriterion("sku_key not between", value1, value2, "skuKey");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueIsNull() {
			addCriterion("sku_keyvalue is null");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueIsNotNull() {
			addCriterion("sku_keyvalue is not null");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueEqualTo(String value) {
			addCriterion("sku_keyvalue =", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueNotEqualTo(String value) {
			addCriterion("sku_keyvalue <>", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueGreaterThan(String value) {
			addCriterion("sku_keyvalue >", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueGreaterThanOrEqualTo(String value) {
			addCriterion("sku_keyvalue >=", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueLessThan(String value) {
			addCriterion("sku_keyvalue <", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueLessThanOrEqualTo(String value) {
			addCriterion("sku_keyvalue <=", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueLike(String value) {
			addCriterion("sku_keyvalue like", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueNotLike(String value) {
			addCriterion("sku_keyvalue not like", value, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueIn(List<String> values) {
			addCriterion("sku_keyvalue in", values, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueNotIn(List<String> values) {
			addCriterion("sku_keyvalue not in", values, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueBetween(String value1, String value2) {
			addCriterion("sku_keyvalue between", value1, value2, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuKeyvalueNotBetween(String value1, String value2) {
			addCriterion("sku_keyvalue not between", value1, value2, "skuKeyvalue");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlIsNull() {
			addCriterion("sku_picurl is null");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlIsNotNull() {
			addCriterion("sku_picurl is not null");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlEqualTo(String value) {
			addCriterion("sku_picurl =", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlNotEqualTo(String value) {
			addCriterion("sku_picurl <>", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlGreaterThan(String value) {
			addCriterion("sku_picurl >", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlGreaterThanOrEqualTo(String value) {
			addCriterion("sku_picurl >=", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlLessThan(String value) {
			addCriterion("sku_picurl <", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlLessThanOrEqualTo(String value) {
			addCriterion("sku_picurl <=", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlLike(String value) {
			addCriterion("sku_picurl like", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlNotLike(String value) {
			addCriterion("sku_picurl not like", value, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlIn(List<String> values) {
			addCriterion("sku_picurl in", values, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlNotIn(List<String> values) {
			addCriterion("sku_picurl not in", values, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlBetween(String value1, String value2) {
			addCriterion("sku_picurl between", value1, value2, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSkuPicurlNotBetween(String value1, String value2) {
			addCriterion("sku_picurl not between", value1, value2, "skuPicurl");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeIsNull() {
			addCriterion("sell_productcode is null");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeIsNotNull() {
			addCriterion("sell_productcode is not null");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeEqualTo(String value) {
			addCriterion("sell_productcode =", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotEqualTo(String value) {
			addCriterion("sell_productcode <>", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeGreaterThan(String value) {
			addCriterion("sell_productcode >", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeGreaterThanOrEqualTo(String value) {
			addCriterion("sell_productcode >=", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeLessThan(String value) {
			addCriterion("sell_productcode <", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeLessThanOrEqualTo(String value) {
			addCriterion("sell_productcode <=", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeLike(String value) {
			addCriterion("sell_productcode like", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotLike(String value) {
			addCriterion("sell_productcode not like", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeIn(List<String> values) {
			addCriterion("sell_productcode in", values, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotIn(List<String> values) {
			addCriterion("sell_productcode not in", values, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeBetween(String value1, String value2) {
			addCriterion("sell_productcode between", value1, value2, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotBetween(String value1, String value2) {
			addCriterion("sell_productcode not between", value1, value2, "sellProductcode");
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

		public Criteria andSecurityStockNumIsNull() {
			addCriterion("security_stock_num is null");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumIsNotNull() {
			addCriterion("security_stock_num is not null");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumEqualTo(Long value) {
			addCriterion("security_stock_num =", value, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumNotEqualTo(Long value) {
			addCriterion("security_stock_num <>", value, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumGreaterThan(Long value) {
			addCriterion("security_stock_num >", value, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumGreaterThanOrEqualTo(Long value) {
			addCriterion("security_stock_num >=", value, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumLessThan(Long value) {
			addCriterion("security_stock_num <", value, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumLessThanOrEqualTo(Long value) {
			addCriterion("security_stock_num <=", value, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumIn(List<Long> values) {
			addCriterion("security_stock_num in", values, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumNotIn(List<Long> values) {
			addCriterion("security_stock_num not in", values, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumBetween(Long value1, Long value2) {
			addCriterion("security_stock_num between", value1, value2, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andSecurityStockNumNotBetween(Long value1, Long value2) {
			addCriterion("security_stock_num not between", value1, value2, "securityStockNum");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldIsNull() {
			addCriterion("product_code_old is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldIsNotNull() {
			addCriterion("product_code_old is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldEqualTo(String value) {
			addCriterion("product_code_old =", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotEqualTo(String value) {
			addCriterion("product_code_old <>", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldGreaterThan(String value) {
			addCriterion("product_code_old >", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldGreaterThanOrEqualTo(String value) {
			addCriterion("product_code_old >=", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldLessThan(String value) {
			addCriterion("product_code_old <", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldLessThanOrEqualTo(String value) {
			addCriterion("product_code_old <=", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldLike(String value) {
			addCriterion("product_code_old like", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotLike(String value) {
			addCriterion("product_code_old not like", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldIn(List<String> values) {
			addCriterion("product_code_old in", values, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotIn(List<String> values) {
			addCriterion("product_code_old not in", values, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldBetween(String value1, String value2) {
			addCriterion("product_code_old between", value1, value2, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotBetween(String value1, String value2) {
			addCriterion("product_code_old not between", value1, value2, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkIsNull() {
			addCriterion("qrcode_link is null");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkIsNotNull() {
			addCriterion("qrcode_link is not null");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkEqualTo(String value) {
			addCriterion("qrcode_link =", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkNotEqualTo(String value) {
			addCriterion("qrcode_link <>", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkGreaterThan(String value) {
			addCriterion("qrcode_link >", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkGreaterThanOrEqualTo(String value) {
			addCriterion("qrcode_link >=", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkLessThan(String value) {
			addCriterion("qrcode_link <", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkLessThanOrEqualTo(String value) {
			addCriterion("qrcode_link <=", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkLike(String value) {
			addCriterion("qrcode_link like", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkNotLike(String value) {
			addCriterion("qrcode_link not like", value, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkIn(List<String> values) {
			addCriterion("qrcode_link in", values, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkNotIn(List<String> values) {
			addCriterion("qrcode_link not in", values, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkBetween(String value1, String value2) {
			addCriterion("qrcode_link between", value1, value2, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andQrcodeLinkNotBetween(String value1, String value2) {
			addCriterion("qrcode_link not between", value1, value2, "qrcodeLink");
			return (Criteria) this;
		}

		public Criteria andSellCountIsNull() {
			addCriterion("sell_count is null");
			return (Criteria) this;
		}

		public Criteria andSellCountIsNotNull() {
			addCriterion("sell_count is not null");
			return (Criteria) this;
		}

		public Criteria andSellCountEqualTo(Integer value) {
			addCriterion("sell_count =", value, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountNotEqualTo(Integer value) {
			addCriterion("sell_count <>", value, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountGreaterThan(Integer value) {
			addCriterion("sell_count >", value, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("sell_count >=", value, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountLessThan(Integer value) {
			addCriterion("sell_count <", value, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountLessThanOrEqualTo(Integer value) {
			addCriterion("sell_count <=", value, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountIn(List<Integer> values) {
			addCriterion("sell_count in", values, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountNotIn(List<Integer> values) {
			addCriterion("sell_count not in", values, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountBetween(Integer value1, Integer value2) {
			addCriterion("sell_count between", value1, value2, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSellCountNotBetween(Integer value1, Integer value2) {
			addCriterion("sell_count not between", value1, value2, "sellCount");
			return (Criteria) this;
		}

		public Criteria andSaleYnIsNull() {
			addCriterion("sale_yn is null");
			return (Criteria) this;
		}

		public Criteria andSaleYnIsNotNull() {
			addCriterion("sale_yn is not null");
			return (Criteria) this;
		}

		public Criteria andSaleYnEqualTo(String value) {
			addCriterion("sale_yn =", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnNotEqualTo(String value) {
			addCriterion("sale_yn <>", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnGreaterThan(String value) {
			addCriterion("sale_yn >", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnGreaterThanOrEqualTo(String value) {
			addCriterion("sale_yn >=", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnLessThan(String value) {
			addCriterion("sale_yn <", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnLessThanOrEqualTo(String value) {
			addCriterion("sale_yn <=", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnLike(String value) {
			addCriterion("sale_yn like", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnNotLike(String value) {
			addCriterion("sale_yn not like", value, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnIn(List<String> values) {
			addCriterion("sale_yn in", values, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnNotIn(List<String> values) {
			addCriterion("sale_yn not in", values, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnBetween(String value1, String value2) {
			addCriterion("sale_yn between", value1, value2, "saleYn");
			return (Criteria) this;
		}

		public Criteria andSaleYnNotBetween(String value1, String value2) {
			addCriterion("sale_yn not between", value1, value2, "saleYn");
			return (Criteria) this;
		}

		public Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (Criteria) this;
		}

		public Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (Criteria) this;
		}

		public Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (Criteria) this;
		}

		public Criteria andBarcodeIsNull() {
			addCriterion("barcode is null");
			return (Criteria) this;
		}

		public Criteria andBarcodeIsNotNull() {
			addCriterion("barcode is not null");
			return (Criteria) this;
		}

		public Criteria andBarcodeEqualTo(String value) {
			addCriterion("barcode =", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeNotEqualTo(String value) {
			addCriterion("barcode <>", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeGreaterThan(String value) {
			addCriterion("barcode >", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
			addCriterion("barcode >=", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeLessThan(String value) {
			addCriterion("barcode <", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeLessThanOrEqualTo(String value) {
			addCriterion("barcode <=", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeLike(String value) {
			addCriterion("barcode like", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeNotLike(String value) {
			addCriterion("barcode not like", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeIn(List<String> values) {
			addCriterion("barcode in", values, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeNotIn(List<String> values) {
			addCriterion("barcode not in", values, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeBetween(String value1, String value2) {
			addCriterion("barcode between", value1, value2, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeNotBetween(String value1, String value2) {
			addCriterion("barcode not between", value1, value2, "barcode");
			return (Criteria) this;
		}

		public Criteria andMiniOrderIsNull() {
			addCriterion("mini_order is null");
			return (Criteria) this;
		}

		public Criteria andMiniOrderIsNotNull() {
			addCriterion("mini_order is not null");
			return (Criteria) this;
		}

		public Criteria andMiniOrderEqualTo(Integer value) {
			addCriterion("mini_order =", value, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderNotEqualTo(Integer value) {
			addCriterion("mini_order <>", value, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderGreaterThan(Integer value) {
			addCriterion("mini_order >", value, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("mini_order >=", value, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderLessThan(Integer value) {
			addCriterion("mini_order <", value, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderLessThanOrEqualTo(Integer value) {
			addCriterion("mini_order <=", value, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderIn(List<Integer> values) {
			addCriterion("mini_order in", values, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderNotIn(List<Integer> values) {
			addCriterion("mini_order not in", values, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderBetween(Integer value1, Integer value2) {
			addCriterion("mini_order between", value1, value2, "miniOrder");
			return (Criteria) this;
		}

		public Criteria andMiniOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("mini_order not between", value1, value2, "miniOrder");
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