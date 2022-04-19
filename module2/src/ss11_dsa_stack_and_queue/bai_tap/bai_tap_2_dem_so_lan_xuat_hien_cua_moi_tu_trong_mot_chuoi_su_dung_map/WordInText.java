package ss11_dsa_stack_and_queue.bai_tap.bai_tap_2_dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.*;

public class WordInText {
    public static void main(String[] args) {
        String text = "Chương trình chương trình ca nhạc hiến chương";
        text = text.toLowerCase();
        String[] textArray = text.split(" ");

        // Cách 1:
        Set<String> keySet = new TreeSet<>();
        for (String e : textArray) {
            keySet.add(e);
        }
        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String key : keySet) {
            int value = 0;
            for (String word : textArray) {
                if (word.equals(key)) {
                    value++;
                }
            }
            wordsMap.put(key, value);
        }

    // Cách 2:
//        for(String temp: textArray) {
//            if(wordsMap.containsKey(temp)) {
//                wordsMap.put(temp, wordsMap.get(temp)+1);
//            } else {
//                wordsMap.put(temp,1);
//            }
//        }
        System.out.println(wordsMap);
    }
}
