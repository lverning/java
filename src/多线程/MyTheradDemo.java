package 多线程;

/**
 * @author： 吕二宁
 * @date： 2021-08-31 22:34
 */

/*
    1.为什么要重写run()方法?
        因为run()方法是用来封装被线程执行的代码
    2.run()方法和start()方法的区别？
        run()：封装线程执行的代码，直接调用，相当于普通方法的调用
        start()：启动线程；然后由JVM调用此线程的run()方法
 */
public class MyTheradDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
//        my1.run();
//        my2.run();

        //void start()导致此线程开始执行，java虚拟机调用此线程的run方法
        my1.start();
        my2.start();
    }
}
