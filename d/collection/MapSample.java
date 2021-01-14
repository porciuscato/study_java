package d.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        // sample.checkHashMap();
        // sample.checkKeySet();
        // sample.checkValues();
        // sample.checkHashMapEntry();
        // sample.checkContains();
        sample.checkRemove();
    }
    public void checkHashMap(){
        HashMap<String, String> map = new HashMap<String, String> ();
        map.put("A", "a");
        System.out.println(map.get("A"));
        map.put("A", "1");
        System.out.println(map.get("A"));
    }
    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        for(String key: keySet){
            System.out.println(key);
        }
    }
    public void checkValues() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");
        Collection<String> values = map.values();
        System.out.println(values);
    }
    public void checkHashMapEntry(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for(Map.Entry<String, String> entry: entries){
            System.out.println(entry);
        }
    }
    public void checkContains(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }
    public void checkRemove() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.remove("A");
        System.out.println(map.size());
        System.out.println(map);
    }
}
