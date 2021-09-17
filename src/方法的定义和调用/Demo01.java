package 方法的定义和调用;

/**
 * @author： 吕二宁
 * @date： 2021-08-29 16:40
 */
public class Demo01 {
    public static void main(String[] args) {
        //调用Parity()方法
        Parity();
        Parity2(89,9);
    }

    public static void Parity() {
        //定义一个int变量为10
        int a = 10;
        if (a % 2 == 0) {
            System.out.println(a + "是偶数");
        } else {
            System.out.println(a + "是奇数");
        }
    }

    //定义一个带参数方法,比较最大值
    public static void Parity2(int a, int b) {
        if (a > b ){
            System.out.println(a + "最大");
        }else {
            System.out.println(b + "最大");
        }
    }
}
