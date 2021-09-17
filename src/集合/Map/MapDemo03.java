package 集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author： 吕二宁
 * @date： 2021-09-04 16:11
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //添加元素
        map.put("AAA",19);
        map.put("BBB",18);
        //根据键获取值
        System.out.println(map.get("AAA"));
        //获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key);
        }
        //获取所有值得集合
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println(value);
        }
    }
}
