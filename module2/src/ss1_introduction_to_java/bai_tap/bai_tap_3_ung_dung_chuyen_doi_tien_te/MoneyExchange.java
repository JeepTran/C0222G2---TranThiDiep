package ss1_java_overview.bai_tap.bai_tap_3_ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        double usd;
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money in USD: ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println(usd + "USD = " + result + "VND");
    }
}
