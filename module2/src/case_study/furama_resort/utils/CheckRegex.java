package case_study.furama_resort.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckRegex {
    public static final String VILLA_SERVICE_ID_REGEX = "^SVVL-[0-9]{4}$";
    public static final String HOUSE_SERVICE_ID_REGEX = "^SVHO-[0-9]{4}$";
    public static final String ROOM_SERVICE_ID_REGEX = "^SVRO-[0-9]{4}$";
    public static final String AREA_REGEX = "^(30\\.[1-9]+)|(3[1-9]{1}(\\.[0-9]+)?)|([4-9]{1}[0-9]{1}(\\.[0-9]+)?)|([1-9]{1}[0-9]{2,}(\\.[0-9]+)?)$";
    public static final String MAX_PAX_REGEX = "^([1-9]{1})|(1[0-9]{1})$";
    public static final String STANDARD_STRING_REGEX = "^[A-Z][a-z0-9]{1,}$"; // service name, rental type, room standard
    public static final String POSITIVE_INTEGER_REGEX = "^[1-9][0-9]*$"; //rental fee & num of floors
    public static final String BIRTHDAY_REGEX = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static Scanner scanner;

    public static boolean checkingRegex(String string, String regex) {
        return string.matches(regex);
    }

    public static String checkingAge(String birthdayInput, String regex) throws AgeException {

            if (birthdayInput.matches(regex)) {
                String pattern = "dd/MM/yyyy";
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
                LocalDate birthday = LocalDate.parse(birthdayInput, formatter);
                LocalDate now = LocalDate.now();
                int age = Period.between(birthday, now).getYears();
                if (age < 18 || age > 100) {
                    throw new AgeException("Age should be between 18 and 100.");
                }
            } else {
                throw new AgeException("Invalid date or not formatted as dd/MM/yyyy.");
            }

        return birthdayInput;
    }

    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate birthday = LocalDate.parse("2021-01-01", formatter);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthday, now).getYears();
        System.out.println(age);
    }
}
