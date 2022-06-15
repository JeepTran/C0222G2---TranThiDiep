package algorithm.module_2;

public class VeHinhThoi {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                if (j == i) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int k = 0; k < i * 2 + 1; k++) {
                if (k == i * 2) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.print(4 - j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int k = 2 * (4 - i) - 1; k > 0; k--) {
                if (k == 1) {
                    System.out.print(4 - i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}