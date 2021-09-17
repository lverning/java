package 多线程;

/**
 * @author： 吕二宁
 * @date： 2021-08-31 22:32
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
