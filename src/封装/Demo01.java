package 封装;

/**
 * @author： 吕二宁
 * @date： 2021-08-18 17:35
 */
public class Demo01 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age >150){
            System.out.println("数据不合法");
            return;
        }
        this.age = age;
    }
}
