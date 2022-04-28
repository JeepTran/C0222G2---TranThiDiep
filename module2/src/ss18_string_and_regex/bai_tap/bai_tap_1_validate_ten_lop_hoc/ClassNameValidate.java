package ss18_string_and_regex.bai_tap.bai_tap_1_validate_ten_lop_hoc;

import java.util.Scanner;

public class ClassNameValidate {
    private static final String REGEX_CLASS_NAME = "^[CAP]{1}[0-9]{4}[GHIKLM]{1}$";

    //Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
//1. Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//2. Không chứa các ký tự đặc biệt
//3. Theo sau ký tự bắt đầu là 4 ký tự số
//4. Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a class name to check: ");
        String name = scanner.nextLine();
        ClassNameValidate classNameValidate = new ClassNameValidate();
        System.out.println(classNameValidate.checkValidation(name));
    }

    public boolean checkValidation(String className) {
        return className.matches(REGEX_CLASS_NAME);
    }
}
