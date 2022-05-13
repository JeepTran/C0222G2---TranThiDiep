package ss18_string_and_regex.thuc_hanh.thuc_hanh_1_validate_email;

public class ValidateEmailTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@hotmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
    }


}
