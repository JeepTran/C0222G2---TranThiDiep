package ss2_loop_in_java.thuc_hanh.thuc_hanh_1_kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = Integer.parseInt(input.nextLine());
        if (number < 2) {
            System.out.println(number + " is not a prime.");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " is a prime.");
            } else {
                System.out.println(number + " is not a prime.");
            }
        }
    }
}
