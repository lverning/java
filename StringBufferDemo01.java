package string.string.stringBuffer;

/**
 * @author 吕二宁
 * @version 1.0
 * @description: TODO
 * @date 2022/4/22 16:31
 */
public class StringBufferDemo01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("12345");
        System.out.println(stringBuffer.charAt(3));
        System.out.println(stringBuffer);

    }
}
