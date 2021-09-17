package 多态;

/**
 * @author： 吕二宁
 * @date： 2021-09-07 08:21
 */
public class Demo01 {
    private String name;
    private int age;
    private String sex;

    public Demo01() {
    }

    public void XingWei(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Demo01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
