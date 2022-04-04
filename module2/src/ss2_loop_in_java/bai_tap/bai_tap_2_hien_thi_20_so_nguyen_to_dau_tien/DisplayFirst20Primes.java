package ss2_loop_in_java.bai_tap.bai_tap_2_hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class DisplayFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the first primes to display: ");
        int numberOfPrimes = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int number = 2;
        System.out.print("The first 20 primes are:\t");
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
                count++;
            }
            number++;
        } while (count < numberOfPrimes);
    }
}
