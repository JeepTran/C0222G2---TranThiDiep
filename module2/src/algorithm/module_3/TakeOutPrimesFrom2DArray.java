import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class te25 {
    public static void main(String[] args) {
        int[][] arg1 = {{1, 2, 8, 43}, {9, 4, 53, 7}, {11, 6, 4, 0}, {1, 2, 6, 51}};

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arg1.length; i++) {
            for (int j = 0; j < arg1[i].length; j++) {
                int num = arg1[i][j];
                if (num > 1) {
                    int count = 0;
                    for (int k = 2; k < num; k++) {
                        if (num % k == 0) {
                            count++;
                        }
                    }
                    if (count == 0 && arrayList.indexOf(num) == -1) {
                        arrayList.add(num);
                    }
                }
            }
        }
        Collections.sort(arrayList);
        int[] result = new int[arrayList.size()];
        for (int x = 0; x < arrayList.size(); x++) {
            result[x] = arrayList.get(x);
        }
        System.out.println(Arrays.toString(result));
    }
}
