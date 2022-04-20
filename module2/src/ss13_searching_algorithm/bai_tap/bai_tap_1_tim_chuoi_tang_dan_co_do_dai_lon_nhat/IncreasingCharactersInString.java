package ss13_searching_algorithm.bai_tap.bai_tap_1_tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreasingCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Result: ");
        searchingIncreasingString(str);
    }

    public static void searchingIncreasingString(String string) {
        List<Character> chars = new ArrayList<>();
        chars.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > chars.get(chars.size() - 1)) {
                chars.add(string.charAt(i));
            }
        }
        for (Character character : chars) {
            System.out.print(character);
        }
    }
}


