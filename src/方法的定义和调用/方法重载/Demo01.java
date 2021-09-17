package 方法的定义和调用.方法重载;

/**
 * @author： 吕二宁
 * @date： 2021-08-29 17:17
 */
/*
    方法重载：
        1.多个方法在同一个类中
        2.多个方法具有相同的方法名
        3.多个方法的参数不同，参数数量不同，类型不同
 */
public class Demo01 {
    public static void main(String[] args) {
        //调用方法
        int resule = sum(10,20);
        System.out.println(resule);
        double resule2 = sum(10.0,20.0);
        System.out.println(resule2);
        int resule3 = sum(10,20,30);
        System.out.println(resule3);
    }
    //求两个int类型数据和的方法
    public static int sum(int a, int b){
        return a + b;
    }
    //求两个double类型数据和的方法
    public static double sum(double a, double b){
        return a + b;
    }
    //求三个int类型数据和的方法
    public static int sum(int a, int b, int c){
        return a + b + c;
    }


}
