package ss3_array_and_method_in_java.thuc_hanh.thuc_hanh_3_tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        int maxElement = array[0];
        int indexOfMax = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > maxElement) {
                maxElement = array[j];
                indexOfMax = j;
            }
        }
        System.out.println("The max element in the array is: " + maxElement + ", at position: " + (indexOfMax + 1));
    }
}
