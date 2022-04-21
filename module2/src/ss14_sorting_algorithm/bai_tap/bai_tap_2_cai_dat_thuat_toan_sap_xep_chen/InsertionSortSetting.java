package ss14_sorting_algorithm.bai_tap.bai_tap_2_cai_dat_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortSetting {
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
        insertionSort(list);
        System.out.print("The list after being insertion-sorted: \t");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
