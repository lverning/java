package 集合;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author： 吕二宁
 * @date： 2021-08-22 14:05
 * 学生管理系统
 */
public class Array {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
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
                    addStudebt(arrayList);
                    break;
                case "2":
                    Delect(arrayList);
                    break;
                case "3":
                    XiuGai(arrayList);
                    break;
                case "4":
                    ChaKan(arrayList);
                    break;
                case "5":
                    System.out.println("退出系统！");
                    falg = false;
                    break;
            }
        } while (falg);
    }

    public static void addStudebt(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入年龄：");
        String age = scanner.nextLine();
        System.out.print("请输入性别：");
        String sex = scanner.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setSex(sex);
        arrayList.add(s);
        if (arrayList.size() > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public static void Delect(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        if (arrayList.size()==0){
            System.out.println("请先添加学生！");
        }else {
            System.out.println("请输入您要删除学生姓名：");
            String name = scanner.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                if (student.name.equals(name)) {
                    arrayList.remove(i);
                    System.out.println("删除成功！");
                    break;
                }
            }
        }
    }

    public static void ChaKan(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("请先添加学生！");
        } else {
            System.out.println("姓名\t\t" + "年龄\t\t" + "性别\t");
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                System.out.println(student.getName() + "\t" + student.getAge() + "\t\t" + student.getSex());
            }
        }
    }

    public static void XiuGai(ArrayList<Student> arrayList) {
        if (arrayList.size()==0){
            System.out.println("请先添加学生！");
        }else {
            Scanner scanner = new Scanner(System.in);
            ChaKan(arrayList);
            System.out.println("请选择修改的学生姓名：");
            String name = scanner.nextLine();
            System.out.println("请选择修改后的学生姓名：");
            String name2 = scanner.nextLine();
            System.out.println("请输入修改后的学生年龄：");
            String age = scanner.nextLine();
            System.out.println("请输入修改后的学生性别：");
            String sex = scanner.nextLine();
            Student student = new Student();
            student.setName(name2);
            student.setAge(age);
            student.setSex(sex);
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (s.getName().equals(name)) {
                    arrayList.set(i, student);
                    System.out.println("修改成功！");
                    break;
                }
            }
        }
    }
}

