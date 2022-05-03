package 集合;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author： 吕二宁
 * @date： 2021-09-18 23:51
 */
public class List {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean falg = true;
        do {
            System.out.println("---------欢迎进入学生系统---------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            System.out.print("请选择:");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    Add(list);
                    break;
                case "2":
                    SanChu(list);
                    break;
                case "3":
                    XiuGai(list);
                    break;
                case "4":
                    ChaKan(list);
                    break;
                case "5":
                    System.out.println("退出系统！");
                    falg = false;
                    break;
            }
        } while (falg);
    }

    public static void Add(ArrayList<User> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        list.add(user);
        if (list.size() > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    public static void SanChu(ArrayList<User> list){
        if (list.size() == 0){
            System.out.println("学生列表为空，请先添加学生！");
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要删除的学生：");
            String name = scanner.nextLine();
            for (int i = 0; i<list.size(); i++){
                User user = list.get(i);
                if (user.getName().equals(name)){
                    list.remove(i);
                    System.out.println("删除成功");
                    break;
                }
            }
        }
    }
    public static void ChaKan(ArrayList<User> list){
        if (list.size() ==0){
            System.out.println("请先添加学生");
        }else {
            for (int i = 0; i <list.size(); i++){
                User user = list.get(i);
                System.out.println(user.getName()+" "+user.getPassword());
            }
        }
    }
    public static void XiuGai(ArrayList<User> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改学生的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入修改后的名字：");
        String name2 = scanner.nextLine();
        System.out.println("请输入修改后的密码：");
        String password = scanner.nextLine();
        User user = new User();
        user.setName(name2);
        user.setPassword(password);
        for (int i = 0; i<list.size(); i++){
            User user1 = list.get(i);
            if (user1.getName().equals(name)){
                list.set(i,user);
                System.out.println("修改成功");
            }
            break;
        }
    }
}
