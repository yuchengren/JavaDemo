package jsonPrint.entity;

import java.util.List;

/**
 * 打印区域
 * Created by yuchengren on 2017/6/19.
 */
public class AreaPrintFormat {
    /**
     * 打印区域类型的代号
     */
    String code;

    /**
     * 打印区域的序号
     */
    int order;

    /**
     * 打印区域里的行布局
     */
    List<RowPrintFormat> rowPrintFormatList;

    int topSpacingLineNum;//上间距的空行数 （距离 上一行 打空行的数量)

    /**
     * 打印区域顶部是否有分割线
     */
    boolean isTopHasDivider;
    /**
     * 分割线的类型属性所属对象
     * 为兼容可能存在的不同区域的分割线类型不同
     * 如果此对象为空，则分割线使用打印整体格式PrintFormat中的，dividerFormat对象的区域通用分割线属性。
     */
    DividerPrintFormat dividerFormat;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<RowPrintFormat> getRowPrintFormatList() {
        return rowPrintFormatList;
    }

    public void setRowPrintFormatList(List<RowPrintFormat> rowPrintFormatList) {
        this.rowPrintFormatList = rowPrintFormatList;
    }

    public int getTopSpacingLineNum() {
        return topSpacingLineNum;
    }

    public void setTopSpacingLineNum(int topSpacingLineNum) {
        this.topSpacingLineNum = topSpacingLineNum;
    }

    public boolean isTopHasDivider() {
        return isTopHasDivider;
    }

    public void setTopHasDivider(boolean topHasDivider) {
        isTopHasDivider = topHasDivider;
    }

    public DividerPrintFormat getDividerFormat() {
        return dividerFormat;
    }

    public void setDividerFormat(DividerPrintFormat dividerFormat) {
        this.dividerFormat = dividerFormat;
    }
}
