package ss3_array_and_method_in_java.thuc_hanh.thuc_hanh_4_chuyen_doi_nhiet_do;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        boolean flag = true;
        int choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu:" +
                    "\n1. Fahrenheit to Celsius" +
                    "\n2. Celsius to Fahrenheit" +
                    "\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            double fahrenheit;
            double celsius;

            switch (choice) {
                case 1:
                    System.out.println("Convert Fahrenheit degree to Celsius degree: ");
                    System.out.print("Enter Fahrenheit degree: ");
                    fahrenheit = input.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println(fahrenheit + "F = " + celsius + "C");
                    break;
                case 2:
                    System.out.println("Convert Celsius degree to Fahrenheit degree: ");
                    System.out.print("Enter Celsius degree: ");
                    celsius = input.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println(celsius + "C = " + fahrenheit + "F");
                    break;
                case 0:
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice! Choose again.");
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * (9.0 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9;
    }
}
