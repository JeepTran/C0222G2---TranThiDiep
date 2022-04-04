package ss3_array_and_method_in_java.bai_tap.bai_tap_4_tim_phan_tu_lon_nhat_trong_mang_hai_chieu;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of matrix rows: ");
        int row = Integer.parseInt(input.nextLine());
        System.out.print("Enter the number of matrix column: ");
        int col = Integer.parseInt(input.nextLine());
        double[][] array = new double[row][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the element [" + i + "]-[" + j + "]: ");
                array[i][j] = input.nextDouble();
            }
        }
        double max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("The array has the max element '" + max + "' at the position of row " + row + " - column " + col);
    }
}
