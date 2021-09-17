package 案例;

/**
 * @author： 吕二宁
 * @date： 2021-09-06 18:02
 */
public class DemoClass {
    public String name;
    public int age;
    public String sex;

    public DemoClass(){
    }

    public void XinhWei(){
        System.out.println("来查寝");
    }


    public DemoClass(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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
}
