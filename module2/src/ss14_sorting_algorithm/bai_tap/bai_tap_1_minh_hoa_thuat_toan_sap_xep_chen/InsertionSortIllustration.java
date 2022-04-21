package ss14_sorting_algorithm.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("The inputted list: \t");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                System.out.print("The list after the " + i + "-" + j + " sort: \t");
                for (int value : array) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        }
    }
}
