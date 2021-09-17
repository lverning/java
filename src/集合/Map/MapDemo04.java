package 集合.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author： 吕二宁
 * @date： 2021-09-04 16:19
 */
/*
    Map集合遍历的方式1：
            1,获取所有键的集合，keySet();
            2,遍历键的集合，获取到每一个键，增强for
            3,根据键去找值，get
 */
public class MapDemo04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

    }
}
