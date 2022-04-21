package ss15_exception_and_debug.thuc_hanh.thuc_hanh_2_su_dung_lop_arrayindexoutofboundsexception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExceptionExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách các phần tử trong mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        ArrayExceptionExample arrayExample = new ArrayExceptionExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số của 1 phần tử bất kì: ");
        int index = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là: " + arr[index]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng!");
        }
    }


}
