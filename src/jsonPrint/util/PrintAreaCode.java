package jsonPrint.util;

/**
 * 打印区域类型的代号
 * Created by yuchengren on 2017/6/28.
 */

public interface PrintAreaCode {
	String TITLE_AREA = "title_area";//标题区域
	String SALE_INFO_AREA = "sale_info_area";//销售的门店、地址、BA、时间等信息区域
	String PRODUCT_TITLE_AREA = "product_title_area";//商品信息的标题区域
	String PRODUCT_ITEM_AREA = "product_item_area";//商品信息的条目Item区域
	String TOTAL_INFO_AREA = "total_info_area";//合计金额、折扣等合计信息区域
	String PAY_TYPE_AREA = "pay_type_area";//支付类型区域
	String MEMBER_INFO_AREA = "member_info_area";//会员号、会员等级、积分等会员信息区域
	String POINT_RULE_AREA = "point_rule_area";//积分规则的信息区域
	String COMMENT_AREA = "comment_area";//备注说明，如退货政策等信息区域
	String BRAND_INFO_AREA = "brand_info_area";//品牌的信息（宣传语、二维码字符串、官网地址、热线电话等）区域

}
