package 集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author： 吕二宁
 * @date： 2021-09-04 15:55
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("吕二宁","男");
        map.put("李欣","女");
        System.out.println(map);
    }
}
