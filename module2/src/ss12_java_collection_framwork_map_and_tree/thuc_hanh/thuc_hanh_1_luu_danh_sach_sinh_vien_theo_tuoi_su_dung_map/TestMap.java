package ss12_java_collection_framwork_map_and_tree.thuc_hanh.thuc_hanh_1_luu_danh_sach_sinh_vien_theo_tuoi_su_dung_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        Map<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("A",18);
        hashMap.put("B",19);
        hashMap.put("C",21);
        hashMap.put("D",22);
        hashMap.put("E",25);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(15,0.5f,true);
        linkedHashMap.put("A",18);
        linkedHashMap.put("B",19);
        linkedHashMap.put("C",21);
        linkedHashMap.put("D",22);
        linkedHashMap.put("E",25);
        System.out.println("The age of E is " + linkedHashMap.get("E"));
    }
}
