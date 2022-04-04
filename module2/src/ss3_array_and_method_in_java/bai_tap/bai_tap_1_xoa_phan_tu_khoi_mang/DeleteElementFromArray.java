package ss3_array_and_method_in_java.bai_tap.bai_tap_1_xoa_phan_tu_khoi_mang;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 1, 1, 5, 6, 0, 8, 1, 0};
        System.out.println("The origin array: " + Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to delete: ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                isExist = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                if (number != 0) {
                    i--;
                }
            }
        }
        if (isExist) {
            System.out.println("Now the array becomes:\t" + Arrays.toString(array));
        } else {
            System.out.println(number + " does not exist in the array.");
        }
    }
}

