package ss3_array_and_method_in_java.bai_tap.bai_tap_8_dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi;

import java.util.Scanner;

public class CountCharacterAppearingInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = input.nextLine();
        System.out.print("Enter a character to check: ");
        char checkingCharacter = input.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == checkingCharacter) {
                count++;
            }
        }
        System.out.println("'" + checkingCharacter + "' appears in the string '" + myString + "' " + count + " time(s).");
    }
}
