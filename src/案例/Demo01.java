package 案例;

/**
 * @author： 吕二宁
 * @date： 2021-09-06 18:05
 */
public class Demo01 {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.name = "红玉";
        demoClass.age = 50;
        demoClass.sex = "女";

        System.out.println(demoClass.name);
        demoClass.XinhWei();
    }
}
