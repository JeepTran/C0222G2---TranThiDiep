package ss3_array_and_method_in_java.bai_tap.bai_tap_6_tinh_tong_cac_so_o_mot_cot_xac_dinh;

import java.util.Scanner;

public class SumOfAColumn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of columns of the matrix: ");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] myArray = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element [" + i + "]-[" + j + "]: ");
                myArray[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.print("Enter the column to calculate: ");
        int column = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (j == column) {
                    sum += myArray[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
