package ss1_introduction_to_java.thuc_hanh.thuc_hanh_7_tinh_chi_so_can_nang;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight (kg):");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (m):");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        String result;
        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25.0) {
            result = "Normal";
        } else if (bmi < 30.0) {
            result = "Overweight";
        } else {
            result = "Obese";
        }
        System.out.println(result);
    }
}
