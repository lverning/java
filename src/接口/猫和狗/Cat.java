package 接口.猫和狗;

/**
 * @author： 吕二宁
 * @date： 2021-09-03 17:57
 */
public class Cat extends Animal implements Interface{
   public Cat(){

   }
   public Cat(String name, int age){
       super(name,age);
   }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫可以调高了");
    }
}
