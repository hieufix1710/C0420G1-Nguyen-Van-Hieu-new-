package collection_framework.thuc_hanh.bai2_collecttions.build_treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String args[]) {

        TreeMap<String, String> map = new TreeMap<String, String>();

        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");



        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + map.get(key));
        }

    }
}
