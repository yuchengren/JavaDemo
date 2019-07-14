package jsonPrint.entity;

/**
 * 文字的打印格式
 * Created by yuchengren on 2017/6/16.
 */
public class TextPrintFormat{
    String code;//文字类型的代号 如 备注 Comment(value类型的数据格式，必须有非空唯一code值标识)
    String text;//文字内容(key类型的数据格式，文本是固定必须给予的)
    int widthMultiple;//宽的倍数(1<= n <=8) （小于1，则默认处理为1倍，大于9则默认处理为8倍)
    int heightMultiple;//高的倍数(1<= n <=8)（小于1，则默认处理为1倍，大于9则默认处理为8倍)
    long color;//颜色，格式 十六进制 0xFFFFFF
    int leftSpacingStep;//左间距的步数（1步数 = 0.125mm * 倍宽)
    int rightSpacingStep;//右间距的步数
    int ownWidthStep;//文本占有区域的步数(默认0代表包裹内容)
    String gravity;//文本内容在文本占有区域内的布局位置 left居左 center居右 right居右(此值为空，默认为 居左）

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public int getOwnWidthStep() {
        return ownWidthStep;
    }

    public void setOwnWidthStep(int ownWidthStep) {
        this.ownWidthStep = ownWidthStep;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }
}
