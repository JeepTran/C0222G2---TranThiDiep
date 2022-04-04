package ss2_loop_in_java.thuc_hanh.thuc_hanh_2_tinh_tien_lai_cho_vay;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BankLoanInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan: ");
        double loan = input.nextDouble();
        System.out.print("Enter yearly interest rate (%): ");
        double interestRate = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int numberOfMonth = input.nextInt();

        double totalInterest = 0;
        for (int i = 1; i < numberOfMonth; i++) {
            totalInterest += loan * (interestRate / 100) / 12 * numberOfMonth;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
