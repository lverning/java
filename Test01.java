package com.接口和抽象类;

/**
 * @author 吕二宁
 * @version 1.0
 * @description: TODO
 * @date 2022/5/18 20:36
 */
public class Test01 extends Myabstract implements Myinterface {

    @Override
    public String test1(String name) {
        return "hello" + name;
    }

    @Override
    public String test2(String name) {
        return "world" + name;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(test01.test1("测试1"));
        System.out.println(test01.test2("测试2"));
        test01.test02();
    }

}

interface Myinterface {
    String test2(String name);

    default void test02() {
        System.out.println("接口的默认实现方法");

    }
}

abstract class Myabstract {
    public abstract String test1(String name);

}