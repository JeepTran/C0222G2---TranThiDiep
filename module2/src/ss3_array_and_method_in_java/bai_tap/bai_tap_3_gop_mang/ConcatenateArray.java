package ss3_array_and_method_in_java.bai_tap.bai_tap_3_gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int size1 = Integer.parseInt(input.nextLine());
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter the element " + (i + 1) + " of the array 1: ");
            array1[i] = Integer.parseInt(input.nextLine());
        }

        System.out.print("Enter the size of array 2: ");
        int size2 = Integer.parseInt(input.nextLine());
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter the element " + (i + 1) + " of the array 2: ");
            array2[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        System.out.println("Array 1 + array 2: " + Arrays.toString(array3));
    }
}
