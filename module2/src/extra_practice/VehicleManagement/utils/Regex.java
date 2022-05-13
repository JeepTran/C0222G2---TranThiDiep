package extra_practice.VehicleManagement.utils;

import demo.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

public class Regex {
    public static final String SIGNAL_PLATE = "^[0-9]{2}[A-Z]-[0-9]{4,5}$";
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

    public static String checkAgeRegex(String input, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (input.matches(regex)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate birthday = LocalDate.parse(input, formatter);
                    LocalDate now = LocalDate.now();
                    int age = Period.between(birthday, now).getYears();
                    if (age < 100 && age > 18) {
                        check = false;
                    } else {
                        throw new ServiceException("Tuổi phải lớn hơn 18 và bé hơn 100.");
                    }
                } else {
                    throw new ServiceException("Định dạng chưa đúng dd/MM/yyyy!");
                }
            } catch (ServiceException s) {
                System.out.println(s.getMessage());
                input = scanner.nextLine();
            }
        }
        return input;
    }
}

