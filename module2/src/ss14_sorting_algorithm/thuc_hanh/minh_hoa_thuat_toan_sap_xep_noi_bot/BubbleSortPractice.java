package ss14_sorting_algorithm.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortPractice {
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
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("The list may be completely sorted, no need more pass!");
                break;
            }
            System.out.print("The list after the " + i + " sort: \t");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + "\t");
            }
            System.out.println();
        }
    }
}
