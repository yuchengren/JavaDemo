package jsonPrint.entity;

/**
 * 分割线格式
 * Created by yuchengren on 2017/6/19.
 */
public class DividerPrintFormat {

    String code;//分割线类型的代号 minus代表-，point代表…
    char sign;//符号 如- * # …等
    int widthMultiple;//宽的倍数(1<= n <=8) （小于1，则默认处理为1倍，大于9则默认处理为8倍)
    int heightMultiple;//高的倍数(1<= n <=8) （小于1，则默认处理为1倍，大于9则默认处理为8倍)
    long color;//颜色，格式 十六进制 OxFFFFFF

    int leftSpacingStep;//左间距的步数（步数*0.125mm 为具体值)
    int rightSpacingStep;//右间距的步数
    int rowSpacingStep;//行距的步数(默认0代表标准间距30步)

    int topSpacingLineNum;//上间距的行数（距离 上一行 打空行的数量)

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getWidthMultiple() {
        return widthMultiple;
    }

    public void setWidthMultiple(int widthMultiple) {
        this.widthMultiple = widthMultiple;
    }

    public int getHeightMultiple() {
        return heightMultiple;
    }

    public void setHeightMultiple(int heightMultiple) {
        this.heightMultiple = heightMultiple;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int getLeftSpacingStep() {
        return leftSpacingStep;
    }

    public void setLeftSpacingStep(int leftSpacingStep) {
        this.leftSpacingStep = leftSpacingStep;
    }

    public int getRightSpacingStep() {
        return rightSpacingStep;
    }

    public void setRightSpacingStep(int rightSpacingStep) {
        this.rightSpacingStep = rightSpacingStep;
    }

    public int getRowSpacingStep() {
        return rowSpacingStep;
    }

    public void setRowSpacingStep(int rowSpacingStep) {
        this.rowSpacingStep = rowSpacingStep;
    }

    public int getTopSpacingLineNum() {
        return topSpacingLineNum;
    }

    public void setTopSpacingLineNum(int topSpacingLineNum) {
        this.topSpacingLineNum = topSpacingLineNum;
    }
}
