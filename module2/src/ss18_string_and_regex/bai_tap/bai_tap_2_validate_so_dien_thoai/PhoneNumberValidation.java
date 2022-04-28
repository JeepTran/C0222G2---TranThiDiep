package ss18_string_and_regex.bai_tap.bai_tap_2_validate_so_dien_thoai;

import java.util.Scanner;

public class PhoneNumberValidation {
    private static final String REGEX_PHONE_NUMBER = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    //Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    //x là ký tự số
    //Không chứa các ký tự đặc biệt
    //Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
    //Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phone number to check: ");
        String name = scanner.nextLine();
        PhoneNumberValidation phoneNumberValidation = new PhoneNumberValidation();
        System.out.println(phoneNumberValidation.checkValidation(name));
    }

    public boolean checkValidation(String phoneNumber) {
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }
}
