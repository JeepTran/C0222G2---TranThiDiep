package ss3_array_and_method_in_java.bai_tap.bai_tap_2_them_phan_tu_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 1, 7, 8, 0, 0, 0};
        int[] array2 = new int[array1.length];
        System.out.println("The origin array: " + Arrays.toString(array1));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to add: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the index to add: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= array1.length - 1) {
            System.out.println("Can not add the element to the index " + index);
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (i < index) {
                    array2[i] = array1[i];
                } else if (i == index) {
                    array2[i] = num;
                    for (int j = i + 1; j < array1.length; j++) {
                        array2[j] = array1[j - 1];
                    }
                    break;
                }
            }
            System.out.println("The new array: " + Arrays.toString(array2));
        }
    }
}
