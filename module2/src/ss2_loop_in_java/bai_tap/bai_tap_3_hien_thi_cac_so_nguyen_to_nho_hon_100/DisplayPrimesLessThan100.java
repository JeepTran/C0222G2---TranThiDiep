package ss2_loop_in_java.bai_tap.bai_tap_3_hien_thi_cac_so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {

        int number = 2;
        System.out.print("The primes less than 100 are:\t");
        do {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number + "\t");
            }
            number++;
        } while (number < 100);
    }
}
