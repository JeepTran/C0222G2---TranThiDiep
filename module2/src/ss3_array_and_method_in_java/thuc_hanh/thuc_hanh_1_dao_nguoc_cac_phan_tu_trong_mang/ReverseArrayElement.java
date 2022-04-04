package ss3_array_and_method_in_java.thuc_hanh.thuc_hanh_1_dao_nguoc_cac_phan_tu_trong_mang;

import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size of the array: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Origin array:\t");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.print("\nReversed array:\t");
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + "\t");
        }
    }
}
