package ss13_searching_algorithm.bai_tap.bai_tap_2_tim_chuoi_tien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxConsecutiveIncreasingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Result: ");
        FindMaxConsecutiveIncreasingString(str);
    }

    public static void FindMaxConsecutiveIncreasingString(String string) {
        List<Character> result = new LinkedList<>();
        List<Character> chars = new LinkedList<>();
        chars.add(string.charAt(0));
        result.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > chars.get(chars.size() - 1)) {
                chars.add(string.charAt(i));
                if (chars.size() > result.size()) {
                    result.clear();
                    result.addAll(chars);
                }
            } else {
                chars.clear();
                chars.add(string.charAt(i));
            }
        }

        for (Character character : result) {
            System.out.print(character);
        }
    }
}
