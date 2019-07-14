package jsonPrint.entity;

import java.util.List;

/**
 * 整体的打印
 * Created by yuchengren on 2017/6/16.
 */
public class PrintFormat {

    List<AreaPrintFormat> printAreaList;//打印的区域集合

    DividerPrintFormat dividerFormat;//分割线的类型属性所属对象

    int bottomSpacingLineNum;//底部空行数（数据打完，小票底部还需的空行数)

    boolean is2DBarcodeConcatBillId;//用来控制二维码字符串是否需要拼接单号

    public List<AreaPrintFormat> getPrintAreaList() {
        return printAreaList;
    }

    public void setPrintAreaList(List<AreaPrintFormat> printAreaList) {
        this.printAreaList = printAreaList;
    }

    public DividerPrintFormat getDividerFormat() {
        return dividerFormat;
    }

    public void setDividerFormat(DividerPrintFormat dividerFormat) {
        this.dividerFormat = dividerFormat;
    }

    public int getBottomSpacingLineNum() {
        return bottomSpacingLineNum;
    }

    public void setBottomSpacingLineNum(int bottomSpacingLineNum) {
        this.bottomSpacingLineNum = bottomSpacingLineNum;
    }

    public boolean is2DBarcodeConcatBillId() {
        return is2DBarcodeConcatBillId;
    }

    public void setIs2DBarcodeConcatBillId(boolean is2DBarcodeConcatBillId) {
        this.is2DBarcodeConcatBillId = is2DBarcodeConcatBillId;
    }
}
