package ss3_array_and_method_in_java.bai_tap.bai_tap_7_2D_array_tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran;

import java.util.Scanner;

public class SumDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square matrix: ");
        int len = Integer.parseInt(scanner.nextLine());

        int[][] myArray = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print("Enter the element [" + i + "]-[" + j + "]: ");
                myArray[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == j) {
                    sum += myArray[i][j];
                }
            }
        }
        System.out.println("Summary of the elements on the main matrix diagonal is: " + sum);
    }
}
