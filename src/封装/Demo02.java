package 封装;

/**
 * @author： 吕二宁
 * @date： 2021-08-21 16:21
 */
public class Demo02 {
    public String a(int num) {
        if (num % 2 == 0) {
            return "是偶数";
        } else {
            return "是奇数";
        }
    }

    public static void main(String[] args) {
        int b = 11;
        Demo02 demo02 = new Demo02();
        String r1 = demo02.a(b);
        System.out.println( b + "是" + r1);
    }

}
