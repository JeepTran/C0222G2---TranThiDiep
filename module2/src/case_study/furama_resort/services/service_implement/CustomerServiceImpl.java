package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.person_models.Customer;
import case_study.furama_resort.services.CustomerService;
import case_study.furama_resort.utils.AgeException;
import case_study.furama_resort.utils.CheckRegex;
import case_study.furama_resort.utils.ReadAndWrite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();
    static ReadAndWrite readAndWrite = new ReadAndWrite();
    List<String> customerStr = new LinkedList<>();

//    static {
//        customerList.add(new Customer("Mai Thị K", "12/09/2000", "Girl", 29830, 936100000L, "k@gmail.com", 10, "Gold", "TP HCM"));
//        customerList.add(new Customer("Hoàng Thanh L", "30/05/1999", "Boy", 29831, 936100001L, "l@gmail.com", 11, "Silver", "Cà Mau"));
//        customerList.add(new Customer("Lê Văn M", "10/10/1990", "Boy", 29832, 936100002L, "m@gmail.com", 12, "Platinum", "Hà Nội"));
//        customerList.add(new Customer("Đặng Văn N", "20/01/1998", "Boy", 29833, 936100003L, "n@gmail.com", 13, "Member", "Hải Phòng"));
//        customerList.add(new Customer("Phan Thị O", "02/12/1992", "Girl", 29834, 936100004L, "o@gmail.com", 14, "Diamond", "Cần Thơ"));
//   readAndWrite.writeToCsvFile(ReadAndWrite.CUSTOMER_PATH,customerList,false);
//    }

    @Override
    public void display() {
        customerList.clear();
        customerStr = readAndWrite.readCsvFileToList(ReadAndWrite.CUSTOMER_PATH);
        for (String item : customerStr) {
            String[] info = item.split(";");

            Customer customer = new Customer();
            customer.setCustomerId(Integer.parseInt(info[0]));
            customer.setFullName(info[1]);
            customer.setDateOfBirth(info[2]);
            customer.setGender(info[3]);
            customer.setIdCardNumber(Integer.parseInt(info[4]));
            customer.setPhoneNumber(Long.parseLong(info[5]));
            customer.setEmailAddress(info[6]);
            customer.setCustomerType(info[7]);
            customer.setCustomerAddress(info[8]);

            customerList.add(customer);
        }
        for (Customer customer : customerList) {
            System.out.println(customer.getInfo());
        }
    }

    @Override
    public void add() {
        try {
            customerList.add(customerInformation());
            System.out.println("Add new customer successfully!");
            readAndWrite.writeToCsvFile(ReadAndWrite.CUSTOMER_PATH, customerList, false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void edit() {
        System.out.print("Enter customer ID to edit: ");
        int editCustomerId = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (Customer customer : customerList) {
            if (editCustomerId == customer.getCustomerId()) {
                count++;
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
                break;
            }
        }
        if (count == 0) {
            System.out.println("ID not found!");
        }
        readAndWrite.writeToCsvFile(ReadAndWrite.CUSTOMER_PATH,customerList,false);

    }

    public Customer customerInformation() {
        String customerName;
        String dateOfBirth = null;
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

            boolean check = true;
            while (check) {
                try {
                    System.out.print("Enter customer's date of birth: ");
                    dateOfBirth = scanner.nextLine();
                    CheckRegex.checkingAge(dateOfBirth, CheckRegex.BIRTHDAY_REGEX);
                    check = false;
                } catch (AgeException a) {
                    System.out.println(a.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
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
            System.out.println(e.getMessage());
            return customerInformation();
        }
        return new Customer(customerName, dateOfBirth, customerGender, customerIdCardNumber, customerPhoneNumber, customerMail, customerId, customerType, customerAddress);
    }
}
