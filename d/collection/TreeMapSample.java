package d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.checkTreeMap();
    }
    public void checkTreeMap(){
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("B", "b");
        map.put("가", "나");
        map.put("A", "a");
        map.put("1", "1");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
