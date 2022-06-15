package algorithm.module_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TakeOutRepeatedCharacters {

    public static void main(String[] args) {
        String arg1 = "abcbc";
        for (int i = 0; i < arg1.length() - 1; i++) {
            char cha = arg1.charAt(i);
            int count = 0;

            for (int j = i + 1; j < arg1.length(); j++) {
                if (cha == (arg1.charAt(j))) {
                    count++;
                    if (j == arg1.length() - 1) {
                        arg1 = arg1.substring(0, j);
                    } else {
                        arg1 = arg1.substring(0, j) + arg1.substring(j + 1);
                        j--;
                    }
                }
            }
            if (count == 0) {
                if (i == arg1.length() - 1) {
                    arg1 = arg1.substring(0, i);
                } else {
                    arg1 = arg1.substring(0, i) + arg1.substring(i + 1);
                    i--;
                }

            }
        }

        String result[] = arg1.split("");

        System.out.println(Arrays.toString(result));
    }
}
