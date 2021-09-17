package 封装;

/**
 * @author： 吕二宁
 * @date： 2021-08-18 17:35
 */
public class Demo01Test {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        // 修改age的值
        demo01.setAge(160);
        System.out.println(demo01.getAge());
    }
}
