package jsonPrint;

import jsonPrint.entity.*;
import jsonPrint.util.GsonUtil;
import jsonPrint.util.PrintAreaCode;
import jsonPrint.util.PrintDividerCode;
import jsonPrint.util.PrintTextCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		PrintFormat print = new PrintFormat();
		List<AreaPrintFormat> areaList = new ArrayList<>();
		DividerPrintFormat dividerFormat = new DividerPrintFormat();
		print.setPrintAreaList(areaList);
		print.setDividerFormat(dividerFormat);
		print.setBottomSpacingLineNum(3);
		print.setIs2DBarcodeConcatBillId(false);

		dividerFormat.setCode(PrintDividerCode.MINUS);
		dividerFormat.setSign('-');
		dividerFormat.setWidthMultiple(1);
		dividerFormat.setHeightMultiple(1);
		dividerFormat.setColor(0x000000);
		dividerFormat.setTopSpacingLineNum(0);
		dividerFormat.setLeftSpacingStep(0);
		dividerFormat.setRightSpacingStep(0);
		dividerFormat.setRowSpacingStep(0);

		/**********************title*****************************/
		AreaPrintFormat titleAreaPrintFormat = new AreaPrintFormat();
		areaList.add(titleAreaPrintFormat);
		List<RowPrintFormat> titleRowList = new ArrayList<>();
		titleAreaPrintFormat.setRowPrintFormatList(titleRowList);
		titleAreaPrintFormat.setCode(PrintAreaCode.TITLE_AREA);
		titleAreaPrintFormat.setOrder(0);
		titleAreaPrintFormat.setDividerFormat(null);
		titleAreaPrintFormat.setTopSpacingLineNum(0);
		titleAreaPrintFormat.setTopHasDivider(false);

		RowPrintFormat firstTitleRow = new RowPrintFormat();
		titleRowList.add(firstTitleRow);
		List<TextPrintFormat> firstTitleRowTextList = new ArrayList<>();
		firstTitleRow.setTextPrintFormatList(firstTitleRowTextList);
		firstTitleRow.setGravity("center");
		firstTitleRow.setRowSpacingStep(0);
		firstTitleRow.setTopSpacingLineNum(0);

		TextPrintFormat firstTitleRowFirstText = new TextPrintFormat();
		firstTitleRowTextList.add(firstTitleRowFirstText);
		firstTitleRowFirstText.setCode("");
		firstTitleRowFirstText.setText("储值卡充值");
		firstTitleRowFirstText.setColor(0x000000);
		firstTitleRowFirstText.setWidthMultiple(2);
		firstTitleRowFirstText.setHeightMultiple(2);
		firstTitleRowFirstText.setLeftSpacingStep(0);
		firstTitleRowFirstText.setRightSpacingStep(0);
		firstTitleRowFirstText.setOwnWidthStep(0);
		firstTitleRowFirstText.setGravity("center");

		RowPrintFormat secondTitleRow = new RowPrintFormat();
		titleRowList.add(secondTitleRow);
		List<TextPrintFormat> secondTitleRowTextList = new ArrayList<>();
		secondTitleRow.setTextPrintFormatList(secondTitleRowTextList);
		secondTitleRow.setGravity("center");
		secondTitleRow.setRowSpacingStep(0);
		secondTitleRow.setTopSpacingLineNum(0);

		TextPrintFormat secondTitleRowFirstText = new TextPrintFormat();
		secondTitleRowTextList.add(secondTitleRowFirstText);
		secondTitleRowFirstText.setCode(PrintTextCode.BRAND_NAME_KEY);
		secondTitleRowFirstText.setText("三草两木");
		secondTitleRowFirstText.setColor(0x000000);
		secondTitleRowFirstText.setWidthMultiple(2);
		secondTitleRowFirstText.setHeightMultiple(2);
		secondTitleRowFirstText.setLeftSpacingStep(0);
		secondTitleRowFirstText.setRightSpacingStep(0);
		secondTitleRowFirstText.setOwnWidthStep(0);
		secondTitleRowFirstText.setGravity("center");


		/**********************saleInfo*****************************/
		AreaPrintFormat saleInfoArea = new AreaPrintFormat();
		areaList.add(saleInfoArea);
		List<RowPrintFormat> saleInfoRowList = new ArrayList<>();
		saleInfoArea.setRowPrintFormatList(saleInfoRowList);
		saleInfoArea.setCode(PrintAreaCode.SALE_INFO_AREA);
		saleInfoArea.setOrder(1);
		saleInfoArea.setTopHasDivider(false);
		saleInfoArea.setTopSpacingLineNum(1);
		saleInfoArea.setDividerFormat(dividerFormat);


		RowPrintFormat firstSaleInfoRow = new RowPrintFormat();
		saleInfoRowList.add(firstSaleInfoRow);
		List<TextPrintFormat> firstSaleInfoRowList = new ArrayList<>();
		firstSaleInfoRow.setTextPrintFormatList(firstSaleInfoRowList);
		firstSaleInfoRow.setGravity("left");
		firstSaleInfoRow.setRowSpacingStep(0);
		firstSaleInfoRow.setTopSpacingLineNum(0);

		TextPrintFormat firstSaleInfoRowFirstText = new TextPrintFormat();
		firstSaleInfoRowList.add(firstSaleInfoRowFirstText);
		firstSaleInfoRowFirstText.setCode(PrintTextCode.COUNTER_CODE_NAME_KEY);
		firstSaleInfoRowFirstText.setText("店号+店名:");
		firstSaleInfoRowFirstText.setHeightMultiple(1);
		firstSaleInfoRowFirstText.setWidthMultiple(1);
		firstSaleInfoRowFirstText.setColor(0x073190);
		firstSaleInfoRowFirstText.setLeftSpacingStep(0);
		firstSaleInfoRowFirstText.setRightSpacingStep(12);
		firstSaleInfoRowFirstText.setOwnWidthStep(0);
		firstSaleInfoRowFirstText.setGravity("left");

		TextPrintFormat firstSaleInfoRowSecondText = new TextPrintFormat();
		firstSaleInfoRowList.add(firstSaleInfoRowSecondText);
		firstSaleInfoRowSecondText.setCode(PrintTextCode.COUNTER_CODE_NAME_VALUE);
		firstSaleInfoRowSecondText.setText("");
		firstSaleInfoRowSecondText.setHeightMultiple(1);
		firstSaleInfoRowSecondText.setWidthMultiple(1);
		firstSaleInfoRowSecondText.setColor(0x414351);
		firstSaleInfoRowSecondText.setLeftSpacingStep(0);
		firstSaleInfoRowSecondText.setRightSpacingStep(0);
		firstSaleInfoRowSecondText.setOwnWidthStep(0);
		firstSaleInfoRowSecondText.setGravity("left");


		RowPrintFormat secondSaleInfoRow = new RowPrintFormat();
		saleInfoRowList.add(secondSaleInfoRow);
		List<TextPrintFormat> secondSaleInfoRowList = new ArrayList<>();
		secondSaleInfoRow.setTextPrintFormatList(secondSaleInfoRowList);
		secondSaleInfoRow.setGravity("left");
		secondSaleInfoRow.setRowSpacingStep(0);
		secondSaleInfoRow.setTopSpacingLineNum(0);

		TextPrintFormat secondSaleInfoRowFirstText = new TextPrintFormat();
		secondSaleInfoRowList.add(secondSaleInfoRowFirstText);
		secondSaleInfoRowFirstText.setCode(PrintTextCode.COUNTER_ADDRESS_KEY);
		secondSaleInfoRowFirstText.setText("门店地址:");
		secondSaleInfoRowFirstText.setHeightMultiple(1);
		secondSaleInfoRowFirstText.setWidthMultiple(1);
		secondSaleInfoRowFirstText.setColor(0x073190);
		secondSaleInfoRowFirstText.setLeftSpacingStep(0);
		secondSaleInfoRowFirstText.setRightSpacingStep(12);
		secondSaleInfoRowFirstText.setOwnWidthStep(0);
		secondSaleInfoRowFirstText.setGravity("left");

		TextPrintFormat secondSaleInfoRowSecondText = new TextPrintFormat();
		secondSaleInfoRowList.add(secondSaleInfoRowSecondText);
		secondSaleInfoRowSecondText.setCode(PrintTextCode.COUNTER_ADDRESS_VALUE);
		secondSaleInfoRowSecondText.setText("");
		secondSaleInfoRowSecondText.setHeightMultiple(1);
		secondSaleInfoRowSecondText.setWidthMultiple(1);
		secondSaleInfoRowSecondText.setColor(0x414351);
		secondSaleInfoRowSecondText.setLeftSpacingStep(0);
		secondSaleInfoRowSecondText.setRightSpacingStep(0);
		secondSaleInfoRowSecondText.setOwnWidthStep(0);
		secondSaleInfoRowSecondText.setGravity("left");

		RowPrintFormat fifthSaleInfoRow = new RowPrintFormat();
		saleInfoRowList.add(fifthSaleInfoRow);
		List<TextPrintFormat> fifthSaleInfoRowList = new ArrayList<>();
		fifthSaleInfoRow.setTextPrintFormatList(fifthSaleInfoRowList);
		fifthSaleInfoRow.setGravity("left");
		fifthSaleInfoRow.setRowSpacingStep(0);
		fifthSaleInfoRow.setTopSpacingLineNum(0);

		TextPrintFormat fifthSaleInfoRowFirstText = new TextPrintFormat();
		fifthSaleInfoRowList.add(fifthSaleInfoRowFirstText);
		fifthSaleInfoRowFirstText.setCode(PrintTextCode.COUNTER_TICKET_CODE_KEY);
		fifthSaleInfoRowFirstText.setText("流水号:");
		fifthSaleInfoRowFirstText.setHeightMultiple(1);
		fifthSaleInfoRowFirstText.setWidthMultiple(1);
		fifthSaleInfoRowFirstText.setColor(0x073190);
		fifthSaleInfoRowFirstText.setLeftSpacingStep(0);
		fifthSaleInfoRowFirstText.setRightSpacingStep(12);
		fifthSaleInfoRowFirstText.setOwnWidthStep(0);
		fifthSaleInfoRowFirstText.setGravity("left");

		TextPrintFormat fifthSaleInfoRowSecondText = new TextPrintFormat();
		fifthSaleInfoRowList.add(fifthSaleInfoRowSecondText);
		fifthSaleInfoRowSecondText.setCode(PrintTextCode.COUNTER_TICKET_CODE_VALUE);
		fifthSaleInfoRowSecondText.setText("");
		fifthSaleInfoRowSecondText.setHeightMultiple(1);
		fifthSaleInfoRowSecondText.setWidthMultiple(1);
		fifthSaleInfoRowSecondText.setColor(0x414351);
		fifthSaleInfoRowSecondText.setLeftSpacingStep(0);
		fifthSaleInfoRowSecondText.setRightSpacingStep(0);
		fifthSaleInfoRowSecondText.setOwnWidthStep(0);
		fifthSaleInfoRowSecondText.setGravity("left");



		RowPrintFormat thirdSaleInfoRow = new RowPrintFormat();
		saleInfoRowList.add(thirdSaleInfoRow);
		List<TextPrintFormat> thirdSaleInfoRowList = new ArrayList<>();
		thirdSaleInfoRow.setTextPrintFormatList(thirdSaleInfoRowList);
		thirdSaleInfoRow.setGravity("left");
		thirdSaleInfoRow.setRowSpacingStep(0);
		thirdSaleInfoRow.setTopSpacingLineNum(0);

		TextPrintFormat thirdSaleInfoRowFirstText = new TextPrintFormat();
		thirdSaleInfoRowList.add(thirdSaleInfoRowFirstText);
		thirdSaleInfoRowFirstText.setCode(PrintTextCode.EMPLOYEE_NAME_KEY);
		thirdSaleInfoRowFirstText.setText("BA:");
		thirdSaleInfoRowFirstText.setHeightMultiple(1);
		thirdSaleInfoRowFirstText.setWidthMultiple(1);
		thirdSaleInfoRowFirstText.setColor(0x073190);
		thirdSaleInfoRowFirstText.setLeftSpacingStep(0);
		thirdSaleInfoRowFirstText.setRightSpacingStep(12);
		thirdSaleInfoRowFirstText.setOwnWidthStep(0);
		thirdSaleInfoRowFirstText.setGravity("left");

		TextPrintFormat thirdSaleInfoRowSecondText = new TextPrintFormat();
		thirdSaleInfoRowList.add(thirdSaleInfoRowSecondText);
		thirdSaleInfoRowSecondText.setCode(PrintTextCode.EMPLOYEE_NAME_VALUE);
		thirdSaleInfoRowSecondText.setText("");
		thirdSaleInfoRowSecondText.setHeightMultiple(1);
		thirdSaleInfoRowSecondText.setWidthMultiple(1);
		thirdSaleInfoRowSecondText.setColor(0x414351);
		thirdSaleInfoRowSecondText.setLeftSpacingStep(0);
		thirdSaleInfoRowSecondText.setRightSpacingStep(48);
		thirdSaleInfoRowSecondText.setOwnWidthStep(0);
		thirdSaleInfoRowSecondText.setGravity("left");

		TextPrintFormat thirdSaleInfoRowThirdText = new TextPrintFormat();
		thirdSaleInfoRowList.add(thirdSaleInfoRowThirdText);
		thirdSaleInfoRowThirdText.setCode(PrintTextCode.SALE_TIME_KEY);
		thirdSaleInfoRowThirdText.setText("业务日期:");
		thirdSaleInfoRowThirdText.setHeightMultiple(1);
		thirdSaleInfoRowThirdText.setWidthMultiple(1);
		thirdSaleInfoRowThirdText.setColor(0x073190);
		thirdSaleInfoRowThirdText.setLeftSpacingStep(0);
		thirdSaleInfoRowThirdText.setRightSpacingStep(12);
		thirdSaleInfoRowThirdText.setOwnWidthStep(0);
		thirdSaleInfoRowThirdText.setGravity("left");

		TextPrintFormat thirdSaleInfoRowFourthText = new TextPrintFormat();
		thirdSaleInfoRowList.add(thirdSaleInfoRowFourthText);
		thirdSaleInfoRowFourthText.setCode(PrintTextCode.SALE_TIME_VALUE);
		thirdSaleInfoRowFourthText.setText("");
		thirdSaleInfoRowFourthText.setWidthMultiple(1);
		thirdSaleInfoRowFourthText.setHeightMultiple(1);
		thirdSaleInfoRowFourthText.setColor(0x414351);
		thirdSaleInfoRowFourthText.setLeftSpacingStep(0);
		thirdSaleInfoRowFourthText.setRightSpacingStep(0);
		thirdSaleInfoRowFourthText.setOwnWidthStep(0);
		thirdSaleInfoRowFourthText.setGravity("left");

		/**********************商品列表title*****************************/
		AreaPrintFormat productTitleArea = new AreaPrintFormat();
		areaList.add(productTitleArea);
		List<RowPrintFormat> productTitleRowList = new ArrayList<>();
		productTitleArea.setRowPrintFormatList(productTitleRowList);
		productTitleArea.setCode(PrintAreaCode.PRODUCT_TITLE_AREA);
		productTitleArea.setOrder(2);
		productTitleArea.setTopSpacingLineNum(0);
		productTitleArea.setTopHasDivider(true);
		productTitleArea.setDividerFormat(null);


		RowPrintFormat firstProductTitleRow = new RowPrintFormat();
		productTitleRowList.add(firstProductTitleRow);
		List<TextPrintFormat> firstProductTitleRowTextList = new ArrayList<>();
		firstProductTitleRow.setTextPrintFormatList(firstProductTitleRowTextList);
		firstProductTitleRow.setGravity("left");
		firstProductTitleRow.setRowSpacingStep(0);
		firstProductTitleRow.setTopSpacingLineNum(0);

		TextPrintFormat firstProductTitleRowFirstText = new TextPrintFormat();
		firstProductTitleRowTextList.add(firstProductTitleRowFirstText);
		firstProductTitleRowFirstText.setCode(PrintTextCode.PRODUCT_NAME_KEY);
		firstProductTitleRowFirstText.setText("储值活动/赠品名称");
		firstProductTitleRowFirstText.setWidthMultiple(1);
		firstProductTitleRowFirstText.setHeightMultiple(1);
		firstProductTitleRowFirstText.setColor(0x000000);
		firstProductTitleRowFirstText.setLeftSpacingStep(0);
		firstProductTitleRowFirstText.setRightSpacingStep(12);
		firstProductTitleRowFirstText.setOwnWidthStep(12*28);
		firstProductTitleRowFirstText.setGravity("left");

		TextPrintFormat firstProductTitleRowSecondText = new TextPrintFormat();
		firstProductTitleRowTextList.add(firstProductTitleRowSecondText);
		firstProductTitleRowSecondText.setCode(PrintTextCode.PRODUCT_QUANTITY_KEY);
		firstProductTitleRowSecondText.setText("数量");
		firstProductTitleRowSecondText.setWidthMultiple(1);
		firstProductTitleRowSecondText.setHeightMultiple(1);
		firstProductTitleRowSecondText.setColor(0x000000);
		firstProductTitleRowSecondText.setLeftSpacingStep(0);
		firstProductTitleRowSecondText.setRightSpacingStep(12);
		firstProductTitleRowSecondText.setOwnWidthStep(12*6);
		firstProductTitleRowSecondText.setGravity("center");

		TextPrintFormat firstProductTitleRowThirdText = new TextPrintFormat();
		firstProductTitleRowTextList.add(firstProductTitleRowThirdText);
		firstProductTitleRowThirdText.setCode(PrintTextCode.PRODUCT_PRICE_KEY);
		firstProductTitleRowThirdText.setText("金额");
		firstProductTitleRowThirdText.setWidthMultiple(1);
		firstProductTitleRowThirdText.setHeightMultiple(1);
		firstProductTitleRowThirdText.setColor(0x000000);
		firstProductTitleRowThirdText.setLeftSpacingStep(0);
		firstProductTitleRowThirdText.setRightSpacingStep(12);
		firstProductTitleRowThirdText.setOwnWidthStep(12*10);
		firstProductTitleRowThirdText.setGravity("right");


		/**********************商品列表item*****************************/
		AreaPrintFormat productItemArea = new AreaPrintFormat();
		areaList.add(productItemArea);
		List<RowPrintFormat> productItemRowList = new ArrayList<>();
		productItemArea.setRowPrintFormatList(productItemRowList);
		productItemArea.setCode(PrintAreaCode.PRODUCT_ITEM_AREA);
		productItemArea.setOrder(3);
		productItemArea.setDividerFormat(null);
		productItemArea.setTopHasDivider(false);
		productItemArea.setTopSpacingLineNum(0);


		RowPrintFormat productItemSecondRow = new RowPrintFormat();
		productItemRowList.add(productItemSecondRow);
		List<TextPrintFormat> productItemSecondRowTextList = new ArrayList<>();
		productItemSecondRow.setTextPrintFormatList(productItemSecondRowTextList);
		productItemSecondRow.setGravity("left");
		productItemSecondRow.setTopSpacingLineNum(0);
		productItemSecondRow.setRowSpacingStep(0);


		TextPrintFormat productItemSecondRowFirstText = new TextPrintFormat();
		productItemSecondRowTextList.add(productItemSecondRowFirstText);
		productItemSecondRowFirstText.setText("");
		productItemSecondRowFirstText.setWidthMultiple(1);
		productItemSecondRowFirstText.setHeightMultiple(1);
		productItemSecondRowFirstText.setColor(0xc099cc);
		productItemSecondRowFirstText.setCode(PrintTextCode.PRODUCT_NAME_VALUE);
		productItemSecondRowFirstText.setLeftSpacingStep(0);
		productItemSecondRowFirstText.setRightSpacingStep(12);
		productItemSecondRowFirstText.setOwnWidthStep(12*28);
		productItemSecondRowFirstText.setGravity("left");

		TextPrintFormat productItemSecondRowSecondText = new TextPrintFormat();
		productItemSecondRowTextList.add(productItemSecondRowSecondText);
		productItemSecondRowSecondText.setText("");
		productItemSecondRowSecondText.setWidthMultiple(1);
		productItemSecondRowSecondText.setHeightMultiple(1);
		productItemSecondRowSecondText.setColor(0xc099cc);
		productItemSecondRowSecondText.setCode(PrintTextCode.PRODUCT_QUANTITY_VALUE);
		productItemSecondRowSecondText.setLeftSpacingStep(0);
		productItemSecondRowSecondText.setRightSpacingStep(12);
		productItemSecondRowSecondText.setOwnWidthStep(12 * 6);
		productItemSecondRowSecondText.setGravity("center");

		TextPrintFormat productItemSecondRowThirdText = new TextPrintFormat();
		productItemSecondRowTextList.add(productItemSecondRowThirdText);
		productItemSecondRowThirdText.setText("");
		productItemSecondRowThirdText.setWidthMultiple(1);
		productItemSecondRowThirdText.setHeightMultiple(1);
		productItemSecondRowThirdText.setColor(0xc099cc);
		productItemSecondRowThirdText.setCode(PrintTextCode.PRODUCT_PRICE_VALUE);
		productItemSecondRowThirdText.setLeftSpacingStep(0);
		productItemSecondRowThirdText.setRightSpacingStep(12);
		productItemSecondRowThirdText.setOwnWidthStep(12*10);
		productItemSecondRowThirdText.setGravity("right");


		/**********************商品合计*****************************/
		AreaPrintFormat totalInfoArea = new AreaPrintFormat();
		areaList.add(totalInfoArea);
		List<RowPrintFormat> totalInfoRowList = new ArrayList<>();
		totalInfoArea.setRowPrintFormatList(totalInfoRowList);
		totalInfoArea.setCode(PrintAreaCode.TOTAL_INFO_AREA);
		totalInfoArea.setOrder(4);
		totalInfoArea.setTopSpacingLineNum(1);
		totalInfoArea.setTopHasDivider(true);
		totalInfoArea.setDividerFormat(null);

		RowPrintFormat totalInfoFirstRow = new RowPrintFormat();
		totalInfoRowList.add(totalInfoFirstRow);
		List<TextPrintFormat> totalInfoFirstRowTextList = new ArrayList<>();
		totalInfoFirstRow.setTextPrintFormatList(totalInfoFirstRowTextList);
		totalInfoFirstRow.setGravity("left");
		totalInfoFirstRow.setRowSpacingStep(0);
		totalInfoFirstRow.setTopSpacingLineNum(0);

		TextPrintFormat totalInfoFirstRowFirstText = new TextPrintFormat();
		totalInfoFirstRowTextList.add(totalInfoFirstRowFirstText);
		totalInfoFirstRowFirstText.setCode(PrintTextCode.RECHARGE_MONEY_KEY);
		totalInfoFirstRowFirstText.setColor(0x000000);
		totalInfoFirstRowFirstText.setOwnWidthStep(12 * 32);
		totalInfoFirstRowFirstText.setGravity("left");
		totalInfoFirstRowFirstText.setLeftSpacingStep(48);
		totalInfoFirstRowFirstText.setRightSpacingStep(12);
		totalInfoFirstRowFirstText.setHeightMultiple(1);
		totalInfoFirstRowFirstText.setWidthMultiple(1);
		totalInfoFirstRowFirstText.setText("充值金额:");

		TextPrintFormat totalInfoFirstRowSecondText = new TextPrintFormat();
		totalInfoFirstRowTextList.add(totalInfoFirstRowSecondText);
		totalInfoFirstRowSecondText.setCode(PrintTextCode.RECHARGE_MONEY_VALUE);
		totalInfoFirstRowSecondText.setText("");
		totalInfoFirstRowSecondText.setColor(0x000000);
		totalInfoFirstRowSecondText.setOwnWidthStep(12 * 10);
		totalInfoFirstRowSecondText.setGravity("right");
		totalInfoFirstRowSecondText.setLeftSpacingStep(0);
		totalInfoFirstRowSecondText.setRightSpacingStep(0);
		totalInfoFirstRowSecondText.setHeightMultiple(1);
		totalInfoFirstRowSecondText.setWidthMultiple(1);


		RowPrintFormat totalInfoSecondRow = new RowPrintFormat();
		totalInfoRowList.add(totalInfoSecondRow);
		List<TextPrintFormat> totalInfoSecondRowTextList = new ArrayList<>();
		totalInfoSecondRow.setTextPrintFormatList(totalInfoSecondRowTextList);
		totalInfoSecondRow.setGravity("left");
		totalInfoSecondRow.setRowSpacingStep(0);
		totalInfoSecondRow.setTopSpacingLineNum(0);

		TextPrintFormat totalInfoSecondRowFirstText = new TextPrintFormat();
		totalInfoSecondRowTextList.add(totalInfoSecondRowFirstText);
		totalInfoSecondRowFirstText.setCode(PrintTextCode.GIVE_MONEY_KEY);
		totalInfoSecondRowFirstText.setColor(0x000000);
		totalInfoSecondRowFirstText.setText("赠送金额:");
		totalInfoSecondRowFirstText.setHeightMultiple(1);
		totalInfoSecondRowFirstText.setWidthMultiple(1);
		totalInfoSecondRowFirstText.setLeftSpacingStep(48);
		totalInfoSecondRowFirstText.setRightSpacingStep(12);
		totalInfoSecondRowFirstText.setOwnWidthStep(12 * 32);
		totalInfoSecondRowFirstText.setGravity("left");

		TextPrintFormat totalInfoSecondRowSecondText = new TextPrintFormat();
		totalInfoSecondRowTextList.add(totalInfoSecondRowSecondText);
		totalInfoSecondRowSecondText.setCode(PrintTextCode.GIVE_MONEY_VALUE);
		totalInfoSecondRowSecondText.setText("");
		totalInfoSecondRowSecondText.setColor(0x000000);
		totalInfoSecondRowSecondText.setHeightMultiple(1);
		totalInfoSecondRowSecondText.setWidthMultiple(1);
		totalInfoSecondRowSecondText.setLeftSpacingStep(0);
		totalInfoSecondRowSecondText.setRightSpacingStep(0);
		totalInfoSecondRowSecondText.setOwnWidthStep(12*10);
		totalInfoSecondRowSecondText.setGravity("right");

		/**********************支付方式区域*****************************/
		AreaPrintFormat payTypeArea = new AreaPrintFormat();
		areaList.add(payTypeArea);
		List<RowPrintFormat> payTypeRowList = new ArrayList<>();
		payTypeArea.setRowPrintFormatList(payTypeRowList);
		payTypeArea.setCode(PrintAreaCode.PAY_TYPE_AREA);
		payTypeArea.setOrder(5);
		payTypeArea.setTopSpacingLineNum(0);
		payTypeArea.setTopHasDivider(false);
		payTypeArea.setDividerFormat(null);

		RowPrintFormat payTypeFirstRow = new RowPrintFormat();
		payTypeRowList.add(payTypeFirstRow);
		List<TextPrintFormat> payTypeFirstRowTextList = new ArrayList<>();
		payTypeFirstRow.setGravity("left");
		payTypeFirstRow.setTextPrintFormatList(payTypeFirstRowTextList);
		payTypeFirstRow.setRowSpacingStep(0);
		payTypeFirstRow.setTopSpacingLineNum(0);


		TextPrintFormat payTypeFirstRowFirstText = new TextPrintFormat();
		payTypeFirstRowTextList.add(payTypeFirstRowFirstText);
		payTypeFirstRowFirstText.setCode(PrintTextCode.PAY_TYPE_NAME);
		payTypeFirstRowFirstText.setText("");
		payTypeFirstRowFirstText.setColor(0x000000);
		payTypeFirstRowFirstText.setHeightMultiple(1);
		payTypeFirstRowFirstText.setWidthMultiple(1);
		payTypeFirstRowFirstText.setLeftSpacingStep(48);
		payTypeFirstRowFirstText.setRightSpacingStep(12);
		payTypeFirstRowFirstText.setOwnWidthStep(12 * 32);
		payTypeFirstRowFirstText.setGravity("left");

		TextPrintFormat payTypeFirstRowSecondText = new TextPrintFormat();
		payTypeFirstRowTextList.add(payTypeFirstRowSecondText);
		payTypeFirstRowSecondText.setCode(PrintTextCode.PAY_TYPE_MONEY);
		payTypeFirstRowSecondText.setText("");
		payTypeFirstRowSecondText.setColor(0x000000);
		payTypeFirstRowSecondText.setHeightMultiple(1);
		payTypeFirstRowSecondText.setWidthMultiple(1);
		payTypeFirstRowSecondText.setLeftSpacingStep(0);
		payTypeFirstRowSecondText.setRightSpacingStep(0);
		payTypeFirstRowSecondText.setOwnWidthStep(12*10);
		payTypeFirstRowSecondText.setGravity("right");

		/**********************会员信息区域*****************************/
		AreaPrintFormat memberInfoArea = new AreaPrintFormat();
		areaList.add(memberInfoArea);
		List<RowPrintFormat> memberInfoRowList = new ArrayList<>();
		memberInfoArea.setRowPrintFormatList(memberInfoRowList);
		memberInfoArea.setCode(PrintAreaCode.MEMBER_INFO_AREA);
		memberInfoArea.setDividerFormat(null);
		memberInfoArea.setOrder(6);
		memberInfoArea.setTopHasDivider(true);
		memberInfoArea.setTopSpacingLineNum(0);


		RowPrintFormat memberInfoFirstRow = new RowPrintFormat();
		memberInfoRowList.add(memberInfoFirstRow);
		List<TextPrintFormat> memberInfoFirstRowTextList = new ArrayList<>();
		memberInfoFirstRow.setTextPrintFormatList(memberInfoFirstRowTextList);
		memberInfoFirstRow.setTopSpacingLineNum(0);
		memberInfoFirstRow.setRowSpacingStep(0);
		memberInfoFirstRow.setGravity("left");

		TextPrintFormat memberInfoFirstRowFirstText = new TextPrintFormat();
		memberInfoFirstRowTextList.add(memberInfoFirstRowFirstText);
		memberInfoFirstRowFirstText.setCode(PrintTextCode.MEMBER_CODE_KEY);
		memberInfoFirstRowFirstText.setColor(0x000000);
		memberInfoFirstRowFirstText.setGravity("left");
		memberInfoFirstRowFirstText.setHeightMultiple(1);
		memberInfoFirstRowFirstText.setWidthMultiple(1);
		memberInfoFirstRowFirstText.setText("会员号:");
		memberInfoFirstRowFirstText.setLeftSpacingStep(48);
		memberInfoFirstRowFirstText.setRightSpacingStep(12);
		memberInfoFirstRowFirstText.setOwnWidthStep(0);

		TextPrintFormat memberInfoFirstRowSecondText = new TextPrintFormat();
		memberInfoFirstRowTextList.add(memberInfoFirstRowSecondText);
		memberInfoFirstRowSecondText.setCode(PrintTextCode.MEMBER_CODE_VALUE);
		memberInfoFirstRowSecondText.setText("");
		memberInfoFirstRowSecondText.setColor(0x000000);
		memberInfoFirstRowSecondText.setGravity("left");
		memberInfoFirstRowSecondText.setHeightMultiple(1);
		memberInfoFirstRowSecondText.setWidthMultiple(1);
		memberInfoFirstRowSecondText.setLeftSpacingStep(0);
		memberInfoFirstRowSecondText.setRightSpacingStep(0);
		memberInfoFirstRowSecondText.setOwnWidthStep(0);


		RowPrintFormat memberInfoSecondRow = new RowPrintFormat();
		memberInfoRowList.add(memberInfoSecondRow);
		List<TextPrintFormat> memberInfoSecondRowTextList = new ArrayList<>();
		memberInfoSecondRow.setTextPrintFormatList(memberInfoSecondRowTextList);
		memberInfoSecondRow.setTopSpacingLineNum(0);
		memberInfoSecondRow.setRowSpacingStep(0);
		memberInfoSecondRow.setGravity("left");

		TextPrintFormat memberInfoSecondRowFirstText = new TextPrintFormat();
		memberInfoSecondRowTextList.add(memberInfoSecondRowFirstText);
		memberInfoSecondRowFirstText.setCode(PrintTextCode.MEMBER_LEVEL_KEY);
		memberInfoSecondRowFirstText.setColor(0x000000);
		memberInfoSecondRowFirstText.setGravity("left");
		memberInfoSecondRowFirstText.setHeightMultiple(1);
		memberInfoSecondRowFirstText.setWidthMultiple(1);
		memberInfoSecondRowFirstText.setText("会员等级:");
		memberInfoSecondRowFirstText.setLeftSpacingStep(48);
		memberInfoSecondRowFirstText.setRightSpacingStep(12);
		memberInfoSecondRowFirstText.setOwnWidthStep(0);

		TextPrintFormat memberInfoSecondRowSecondText = new TextPrintFormat();
		memberInfoSecondRowTextList.add(memberInfoSecondRowSecondText);
		memberInfoSecondRowSecondText.setCode(PrintTextCode.MEMBER_LEVEL_VALUE);
		memberInfoSecondRowSecondText.setText("");
		memberInfoSecondRowSecondText.setColor(0x000000);
		memberInfoSecondRowSecondText.setGravity("left");
		memberInfoSecondRowSecondText.setHeightMultiple(1);
		memberInfoSecondRowSecondText.setWidthMultiple(1);
		memberInfoSecondRowSecondText.setLeftSpacingStep(0);
		memberInfoSecondRowSecondText.setRightSpacingStep(0);
		memberInfoSecondRowSecondText.setOwnWidthStep(0);


		RowPrintFormat memberInfoFourthRow = new RowPrintFormat();
		memberInfoRowList.add(memberInfoFourthRow);
		List<TextPrintFormat> memberInfoFourthRowTextList = new ArrayList<>();
		memberInfoFourthRow.setTextPrintFormatList(memberInfoFourthRowTextList);
		memberInfoFourthRow.setTopSpacingLineNum(0);
		memberInfoFourthRow.setRowSpacingStep(0);
		memberInfoFourthRow.setGravity("left");

		TextPrintFormat memberInfoFourthRowFirstText = new TextPrintFormat();
		memberInfoFourthRowTextList.add(memberInfoFourthRowFirstText);
		memberInfoFourthRowFirstText.setCode(PrintTextCode.CARD_CODE_KEY);
		memberInfoFourthRowFirstText.setColor(0x000000);
		memberInfoFourthRowFirstText.setGravity("left");
		memberInfoFourthRowFirstText.setHeightMultiple(1);
		memberInfoFourthRowFirstText.setWidthMultiple(1);
		memberInfoFourthRowFirstText.setText("储值卡卡号:");
		memberInfoFourthRowFirstText.setLeftSpacingStep(48);
		memberInfoFourthRowFirstText.setRightSpacingStep(12);
		memberInfoFourthRowFirstText.setOwnWidthStep(0);

		TextPrintFormat memberInfoFourthRowSecondText = new TextPrintFormat();
		memberInfoFourthRowTextList.add(memberInfoFourthRowSecondText);
		memberInfoFourthRowSecondText.setCode(PrintTextCode.CARD_CODE_VALUE);
		memberInfoFourthRowSecondText.setText("");
		memberInfoFourthRowSecondText.setColor(0x000000);
		memberInfoFourthRowSecondText.setGravity("left");
		memberInfoFourthRowSecondText.setHeightMultiple(1);
		memberInfoFourthRowSecondText.setWidthMultiple(1);
		memberInfoFourthRowSecondText.setLeftSpacingStep(0);
		memberInfoFourthRowSecondText.setRightSpacingStep(0);
		memberInfoFourthRowSecondText.setOwnWidthStep(0);
		

		RowPrintFormat memberInfoThirdRow = new RowPrintFormat();
		memberInfoRowList.add(memberInfoThirdRow);
		List<TextPrintFormat> memberInfoThirdRowTextList = new ArrayList<>();
		memberInfoThirdRow.setTextPrintFormatList(memberInfoThirdRowTextList);
		memberInfoThirdRow.setTopSpacingLineNum(0);
		memberInfoThirdRow.setRowSpacingStep(0);
		memberInfoThirdRow.setGravity("left");

		TextPrintFormat memberInfoThirdRowFirstText = new TextPrintFormat();
		memberInfoThirdRowTextList.add(memberInfoThirdRowFirstText);
		memberInfoThirdRowFirstText.setCode(PrintTextCode.CARD_REMAIN_MONEY_KEY);
		memberInfoThirdRowFirstText.setColor(0x000000);
		memberInfoThirdRowFirstText.setGravity("left");
		memberInfoThirdRowFirstText.setHeightMultiple(1);
		memberInfoThirdRowFirstText.setWidthMultiple(1);
		memberInfoThirdRowFirstText.setText("充值卡余额:");
		memberInfoThirdRowFirstText.setLeftSpacingStep(48);
		memberInfoThirdRowFirstText.setRightSpacingStep(12);
		memberInfoThirdRowFirstText.setOwnWidthStep(0);

		TextPrintFormat memberInfoThirdRowSecondText = new TextPrintFormat();
		memberInfoThirdRowTextList.add(memberInfoThirdRowSecondText);
		memberInfoThirdRowSecondText.setCode(PrintTextCode.CARD_REMAIN_MONEY_VALUE);
		memberInfoThirdRowSecondText.setText("");
		memberInfoThirdRowSecondText.setColor(0x000000);
		memberInfoThirdRowSecondText.setGravity("left");
		memberInfoThirdRowSecondText.setHeightMultiple(1);
		memberInfoThirdRowSecondText.setWidthMultiple(1);
		memberInfoThirdRowSecondText.setLeftSpacingStep(0);
		memberInfoThirdRowSecondText.setRightSpacingStep(0);
		memberInfoThirdRowSecondText.setOwnWidthStep(0);




		//生成printFormatJson
		System.out.println(GsonUtil.formatObjectToJson(print));
	}
}
