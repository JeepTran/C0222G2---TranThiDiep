package ss3_array_and_method_in_java.thuc_hanh.thuc_hanh_6_dem_so_luong_sinh_vien_thi_do;

import java.util.Scanner;

public class CountPassingStudents {
    public static void main(String[] args) {
        double[] marks;
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the number of the students in the list: ");
            size = Integer.parseInt(input.nextLine());
            marks = new double[size];
            if (size > 30) {
                System.out.println("The number can not exceed 30.");
            }
        } while (size > 30);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the mark of student " + (i + 1 + ": "));
            marks[i] = Double.parseDouble(input.nextLine());
        }
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 5 && marks[i] <= 10) {
                count++;
            }
        }
        System.out.println("There are " + count + " students passing.");
    }
}
