package ss3_array_and_method_in_java.bai_tap.bai_tap_5_tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(input.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The min of the array is: " + min);
    }
}