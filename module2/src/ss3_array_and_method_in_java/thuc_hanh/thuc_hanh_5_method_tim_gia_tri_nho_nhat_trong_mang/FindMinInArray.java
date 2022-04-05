package ss3_array_and_method_in_java.thuc_hanh.thuc_hanh_5_method_tim_gia_tri_nho_nhat_trong_mang;

import java.util.Arrays;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 6, 9, -4, 7};
        System.out.println("The smallest element in the array " + Arrays.toString(myArray) + " is: " + min(myArray));
    }

    public static int min(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return array[index];
    }

}
