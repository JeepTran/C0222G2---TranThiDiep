package ss1_java_overview.bai_tap.bai_tap_1_hien_thi_loi_chao;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
