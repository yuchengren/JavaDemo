package jsonPrint.util;

/**
 * 打印文本类型的代号
 * Created by yuchengren on 2017/6/28.
 */

public interface PrintTextCode {
	String BRAND_CODE_VALUE = "brand_code_value";
	String BRAND_NAME_KEY = "brand_name_key";//品牌中文简称（json配置）
	String BRAND_NAME_VALUE = "brand_name_value";//品牌中文简称（从BrandDao.getInstance(context).getBrandsEntity()读取）

	String COUNTER_CODE_NAME_KEY = "counter_code_name_key";//店号店名的标签
	String COUNTER_CODE_KEY = "counter_code_key";//店号的标签
	String COUNTER_NAME_KEY = "counter_name_key";//店名的标签
	String COUNTER_ADDRESS_KEY = "counter_address_key";//店址的标签
	String EMPLOYEE_CODE_KEY = "employee_code_key";//营业员号的标签
	String EMPLOYEE_NAME_KEY = "employee_name_key";//营业员姓名的标签
	String SALE_TIME_KEY = "sale_time_key";//销售时间的标签
	String PRINT_TIME_KEY = "print_time_key";//打印时间的标签
	String PRINT_BUSINESS_TIME_KEY = "print_business_time_key";//业务时间的标签，格式：2017-06-6到2017-07-07
	String PRINT_BRAND_ABBR_KEY = "print_brand_abbr_key";//品牌简称的标签

	String COUNTER_TICKET_CODE_KEY = "counter_ticket_code_key";//小票号的标签

	String COUNTER_CODE_NAME_VALUE = "counter_code_name_value";//店号店名
	String COUNTER_CODE_VALUE = "counter_code_value";//店号
	String COUNTER_NAME_VALUE = "counter_name_value";//店名
	String COUNTER_ADDRESS_VALUE = "counter_address_value";//店址
	String EMPLOYEE_CODE_VALUE = "employee_code_value";//营业员号
	String EMPLOYEE_NAME_VALUE = "employee_name_value";//营业员姓名
	String SALE_TIME_VALUE = "sale_time_value";//销售时间
	String PRINT_TIME_VALUE = "print_time_value";//打印时间
	String PRINT_BUSINESS_TIME_VALUE = "print_business_time_value";//业务时间，格式：2017-06-6到2017-07-07
	String PRINT_BRAND_ABBR_VALUE = "print_brand_abbr_value";//品牌简称
	String COUNTER_TICKET_CODE_VALUE = "counter_ticket_code_value";//小票号


	String PRODUCT_NAME_KEY = "product_name_key";//商品Title的商品名称的标签
	String PRODUCT_BARCODE_KEY = "product_barcode_key";//商品Title的商品条码的标签
	String PRODUCT_UNITCODE_KEY = "product_unitcode_key";//商品Title的厂商编码的标签
	String PRODUCT_QUANTITY_KEY = "product_quantity_key";//商品Title的数量的标签
	String PRODUCT_PRICE_KEY = "product_price_key";//商品Title的零售价或会员价的标签
	String PRODUCT_MONEY_KEY = "product_money_key";//商品Title的金额的标签
	String BILL_BUSINESS_TIME_KEY = "bill_business_time_key";//单据Title的销售时间的标签
	String PRODUCT_DISCOUNT_KEY = "product_discount_key";//商品Title的折扣的标签
	String PRODUCT_UNIQUE_CODE_KEY = "product_unique_code_key";//商品Title或Item里的唯一码的标签

	String PRODUCT_NAME_VALUE = "product_name_value";//商品Item显示的商品名称
	String PRODUCT_BARCODE_VALUE = "product_barcode_value";//商品Item显示的商品条码
	String PRODUCT_UNITCODE_VALUE = "product_unitcode_value";//商品Item显示的厂商编码
	String PRODUCT_QUANTITY_VALUE = "product_quantity_value";//商品Item显示的数量
	String PRODUCT_PRICE_VALUE = "product_price_value";//商品Item显示的零售价或会员价
	String PRODUCT_MONEY_VALUE = "product_money_value";//商品Item显示的金额
	String BILL_BUSINESS_TIME_VALUE = "bill_business_time_value";//单据Title的销售时间的
	String PRODUCT_DISCOUNT_VALUE = "product_discount_value";//商品Title的折扣
	String PRODUCT_UNIQUE_CODE_VALUE = "product_unique_code_value";//商品Item里的唯一码


	String TOTAL_AMOUNT_KEY = "total_amount_key";//合计的金额的标签
	String TOTAL_DISCOUNT_MONEY_KEY = "total_discount_money_key";//合计中的折扣金额的标签
	String TOTAL_QUANTITY_KEY = "total_quantity_key";//合计的数量的标签
	String TOTAL_ZD_DISCOUNT_KEY="total_zd_discount_key";//合计区域的整单折扣标签
	String TOTAL_ZD_QULING_KEY="total_zd_quling_key";//合计区域的整单去零标签

	String TOTAL_AMOUNT_VALUE = "total_amount_value";//合计的金额
	String TOTAL_DISCOUNT_MONEY_VALUE = "total_discount_money_value";//合计中的折扣金额
	String TOTAL_QUANTITY_VALUE = "total_quantity_value";//合计的数量
	String TOTAL_ZD_DISCOUNT_VALUE="total_zd_discount_value";//合计区域的整单折扣
	String TOTAL_ZD_QULING_VALUE="total_zd_quling_value";//合计区域的整单去零

	String PAY_TYPE_NAME = "pay_type_name";//支付方式的名称
	String PAY_TYPE_MONEY = "pay_type_money";//支付方式的对应的支付金额

	String MEMBER_CODE_KEY = "member_code_key";//会员号的标签
	String MEMBER_NAME_KEY = "member_name_key";//会员姓名的标签
	String MEMBER_LEVEL_KEY = "member_level_key";//会员等级的标签
	String MEMBER_BEFORE_POINT_KEY = "member_before_point_key";//会员消费前的积分的标签

	String MEMBER_CODE_VALUE = "member_code_value";//会员号
	String MEMBER_NAME_VALUE = "member_name_value";//会员姓名
	String MEMBER_LEVEL_VALUE = "member_level_value";//会员等级
	String MEMBER_BEFORE_POINT_VALUE = "member_before_point_value";//会员消费前的积分

	String POINT_RULE = "point_rule";//积分规则信息
	String COMMENT = "comment";//退货政策等备注信息
	String BRAND_SLOGAN = "brand_slogan";//品牌广告语、宣传语
	String BRAND_2D_BARCODE = "brand_2D_barcode";//品牌二维码
	String BRAND_OFFICE_WEBSITE = "brand_office_website";//品牌官网
	String BRAND_HOTLINE_TELEPHONE = "brand_hotline_telephone";//品牌热线电话

	String CARD_CODE_KEY = "card_code_key";//卡号的标签
	String CARD_CODE_VALUE = "card_code_value";//卡号
	String RECHARGE_MONEY_KEY = "recharge_money_key";//充值金额的标签
	String RECHARGE_MONEY_VALUE = "recharge_money_value";//充值金额
	String GIVE_MONEY_KEY = "give_money_key";//赠送金额的标签
	String GIVE_MONEY_VALUE = "give_money_value";//赠送金额
	String CARD_REMAIN_MONEY_KEY = "card_remain_money_key";//卡余额的标签
	String CARD_REMAIN_MONEY_VALUE = "card_remain_money_value";//卡余额


}
