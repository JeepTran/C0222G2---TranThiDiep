public class Algorithm3 {
    public static void main(String[] args) {
        int n = 10;
        int m = n;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            m -= 2;
        }
        for (int i = n / 2; i < n; i++) {
            m += 2;
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
