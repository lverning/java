package 接口.猫和狗;

/**
 * @author： 吕二宁
 * @date： 2021-09-03 18:01
 */
public class Dog extends Animal implements Interface{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println("狗可以叫了");
    }
}
