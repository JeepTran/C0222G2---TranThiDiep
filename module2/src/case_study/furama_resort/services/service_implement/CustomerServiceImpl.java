package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.person_models.Customer;
import case_study.furama_resort.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("Mai Thị K", "12/09/2000", "Girl", 29830, 936100000L, "k@gmail.com", 10, "Gold", "TP HCM"));
        customerList.add(new Customer("Hoàng Thanh L", "30/05/1999", "Boy", 29831, 936100001L, "l@gmail.com", 11, "Silver", "Cà Mau"));
        customerList.add(new Customer("Lê Văn M", "10/10/1990", "Boy", 29832, 936100002L, "m@gmail.com", 12, "Platinum", "Hà Nội"));
        customerList.add(new Customer("Đặng Văn N", "20/01/1998", "Boy", 29833, 936100003L, "n@gmail.com", 13, "Member", "Hải Phòng"));
        customerList.add(new Customer("Phan Thị O", "02/12/1992", "Girl", 29834, 936100004L, "o@gmail.com", 14, "Diamond", "Cần Thơ"));
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        customerList.add(customerInformation());
    }

    @Override
    public void edit() {
        System.out.print("Enter customer ID to edit: ");
        int editCustomerId = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (editCustomerId == customer.getCustomerId()) {
                Customer editCustomer = customerInformation();
                customer.setFullName(editCustomer.getFullName());
                customer.setDateOfBirth(editCustomer.getDateOfBirth());
                customer.setGender(editCustomer.getGender());
                customer.setIdCardNumber(editCustomer.getIdCardNumber());
                customer.setPhoneNumber(editCustomer.getPhoneNumber());
                customer.setEmailAddress(editCustomer.getEmailAddress());
                customer.setCustomerId(editCustomer.getCustomerId());
                customer.setCustomerType(editCustomer.getCustomerType());
                customer.setCustomerAddress(editCustomer.getCustomerAddress());
            }
        }
    }

    public Customer customerInformation() {
        String customerName;
        String dateOfBirth;
        String customerGender;
        int customerIdCardNumber;
        long customerPhoneNumber;
        String customerMail;
        int customerId;
        String customerType;
        String customerAddress;

        try {
            System.out.print("Enter customer full-name: ");
            customerName = scanner.nextLine();
            System.out.print("Enter customer's date of birth: ");
            dateOfBirth = scanner.nextLine();
            System.out.print("Enter customer gender: ");
            customerGender = scanner.nextLine();
            System.out.print("Enter customer's ID card number: ");
            customerIdCardNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter customer's phone number: ");
            customerPhoneNumber = Long.parseLong(scanner.nextLine());
            System.out.print("Enter customer's email: ");
            customerMail = scanner.nextLine();
            System.out.print("Enter customer ID: ");
            customerId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter customer type: ");
            customerType = scanner.nextLine();
            System.out.print("Enter customer's address: ");
            customerAddress = scanner.nextLine();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return customerInformation();
        }
        return new Customer(customerName, dateOfBirth, customerGender, customerIdCardNumber, customerPhoneNumber, customerMail, customerId, customerType, customerAddress);
    }
}
