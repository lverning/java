package 案例;

import java.util.Scanner;

/**
 * @author： 吕二宁
 * @date： 2021-09-06 16:21
 */
public class DEmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();
        System.out.println("请输入一个表达式：");
        String s = scanner.next();
        switch (s) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
        String[] c = new String[5];
        int [] d = {1,2,3};
        int [] [] eArray = {  {1,2,3}  ,{4,5,6} };
        for (int i = 0; i < eArray.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(eArray[i][j] + "\t" );
            }
            System.out.println();
        }
    }
}
