package ss3_array_and_method_in_java.thuc_hanh.thuc_hanh_2_tim_gia_tri_trong_mang;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Hoa", "Mai", "Nở", "Mùa", "Xuân", "Đến"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to check: ");
        String checkName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(checkName)) {
                System.out.println("Position of the student " + checkName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + checkName + " in the list.");
        }
    }
}
