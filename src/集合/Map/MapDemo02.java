package 集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author： 吕二宁
 * @date： 2021-09-04 16:00
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("AAA", "a");
        map.put("BBB", "b");
        map.put("CCC", "c");
        //根据键删除元素
        map.remove("CCC");
        //清除所有的键值对元素
        map.clear();
        //判断集合是否包含指定的键
        System.out.println(map.containsKey("AAA"));
        //判断集合是否包含指定的值
        System.out.println(map.containsValue("a"));
        //判断集合是否为空
        System.out.println(map.isEmpty());
        //集合的长度
        System.out.println(map.size());

    }
}
