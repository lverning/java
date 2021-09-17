package 集合.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author： 吕二宁
 * @date： 2021-09-04 16:27
 */
/*
    Map集合遍历的方式2：

 */
public class MapDemo05 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> me : entries){
            //根据键值对对象获取·键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }


    }
}
