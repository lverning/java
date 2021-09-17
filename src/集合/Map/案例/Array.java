package 集合.Map.案例;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-09-05 16:11
 */
public class Array {
    public static void main(String[] args) {
        List list = new ArrayList();
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("A","a");
        hashMap.put("B","b");
        hashMap.put("C","c");
        list.add(hashMap);
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
