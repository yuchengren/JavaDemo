package jsonPrint.entity;

import java.util.List;

/**
 * Created by yuchengren on 2017/6/30.
 */

public class RowPrintFormat {
	int topSpacingLineNum;//上间距的空行数（距离 上一行 打空行的数量)
	int rowSpacingStep;//行距的步数(默认0代表标准间距30步)
	String gravity;//布局位置 left居左 center居右 right居右(此值为空，默认为 居左）
	List<TextPrintFormat> textPrintFormatList;//打印行里的文本格式List

	public int getTopSpacingLineNum() {
		return topSpacingLineNum;
	}

	public void setTopSpacingLineNum(int topSpacingLineNum) {
		this.topSpacingLineNum = topSpacingLineNum;
	}

	public int getRowSpacingStep() {
		return rowSpacingStep;
	}

	public void setRowSpacingStep(int rowSpacingStep) {
		this.rowSpacingStep = rowSpacingStep;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public List<TextPrintFormat> getTextPrintFormatList() {
		return textPrintFormatList;
	}

	public void setTextPrintFormatList(List<TextPrintFormat> textPrintFormatList) {
		this.textPrintFormatList = textPrintFormatList;
	}
}
