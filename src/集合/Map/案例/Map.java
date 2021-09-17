package 集合.Map.案例;

import java.util.HashMap;
import java.util.Set;

/**
 * @author： 吕二宁
 * @date： 2021-09-04 16:44
 */
public class Map {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<>();
        //创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        //把学生添加到集合
        map.put("001",s1);
        map.put("002",s2);
        map.put("003",s3);
        //键找值
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            Student student = map.get(key);
            System.out.println(key+","+student.getName()+","+student.getAge());
        }
    }
}
