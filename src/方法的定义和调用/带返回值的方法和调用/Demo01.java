package 方法的定义和调用.带返回值的方法和调用;

/**
 * @author： 吕二宁
 * @date： 2021-08-29 17:00
 */

/*
    void表示无返回值
    带返回值方法的定义和调用
    定义格式：
        public static 数据类型 方法名(参数){
            return 数据
        }
    调用格式：
    1.方法名(参数)
    2.数据类型 变量名 = 方法名(参数);

*/
public class Demo01 {
    public static void main(String[] args) {
        //1.方法名(参数)
        //Parity(10);没有意义
        //2.数据类型 变量名 = 方法名(参数);
        boolean a = Parity(11);
        System.out.println(a);
    }
    //定义一个方法，该方法接收一个参数，判断是否为偶数,并返回真假值
    public static boolean Parity(int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
