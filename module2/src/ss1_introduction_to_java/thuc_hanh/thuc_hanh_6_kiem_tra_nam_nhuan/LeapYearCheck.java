package ss1_introduction_to_java.thuc_hanh.thuc_hanh_6_kiem_tra_nam_nhuan;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which year do you want to check?");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
