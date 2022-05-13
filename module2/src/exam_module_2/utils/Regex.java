package exam_module_2.utils;

import extra_practice.VehicleManagement.utils.ServiceException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Regex {
    public static final String POSITIVE_INTEGER_REGEX = "^[0-9]+$"; //price, quantity, insurance time
    public static final String INSURANCE_AREA_REGEX = "^[a-zA-Z1-9]$";
    public static final String COUNTRY_REGEX = "^[a-zA-Z1-9]$";
    public static final String STATUS_REGEX = "^[a-zA-Z1-9]$";

    static Scanner scanner = new Scanner(System.in);

    public static String checkRegex(String input, String regex, String errorMassage) {
        boolean check = true;
        do {
            if (input.matches(regex)) {
                check = false;
            } else {
                System.out.println(errorMassage);
                input = scanner.nextLine();
            }
        } while (check);
        return input;
    }

    public static String checkInsuranceTimeRegex(String input, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (input.matches(regex)) {
                    if (Integer.parseInt(input) <= 730 && Integer.parseInt(input) > 0) {
                        check = false;
                    } else {
                        throw new ServiceException("Insurance time should not exceed 730 days!");
                    }
                } else {
                    throw new NumberFormatException("Wrong format!");
                }
            } catch (ServiceException s) {
                System.out.println(s.getMessage());
                input = scanner.nextLine();
            }
        }
        return input;
    }
}
