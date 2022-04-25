package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.person_models.Employee;
import case_study.furama_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Nguyen Van A", "20/04/2000", "Boy", 12345, 905000000L, "a@gmail.com", 1, "University", "Waiter", 7000000));
        employeeList.add(new Employee("Huynh Van B", "20/05/2002", "Boy", 12346, 905000002L, "b@gmail.com", 8, "College", "Receptionist", 8000000));
        employeeList.add(new Employee("Nguyen Thi C", "12/04/1991", "Girl", 12347, 905000003L, "c@gmail.com", 3, "University", "Director", 50000000));
        employeeList.add(new Employee("Mai Thuy D", "02/04/1995", "Girl", 12348, 905000004L, "d@gmail.com", 4, "University", "Manager", 20000000));
        employeeList.add(new Employee("Ta Van E", "10/11/1989", "Boy", 12349, 905000005L, "e@gmail.com", 6, "Technical School", "Officer", 7000000));
    }


    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        employeeList.add(employeeInformation());
    }

    @Override
    public void edit() {
        System.out.print("Enter employee-ID to edit: ");
        int editEmployeeId = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (editEmployeeId == employee.getEmployeeId()) {
                Employee editEmployee = employeeInformation();

                employee.setEmployeeId(editEmployee.getEmployeeId());
                employee.setFullName(editEmployee.getFullName());
                employee.setDateOfBirth(editEmployee.getDateOfBirth());
                employee.setGender(editEmployee.getGender());
                employee.setIdCardNumber(editEmployee.getIdCardNumber());
                employee.setPhoneNumber(editEmployee.getPhoneNumber());
                employee.setEmailAddress(editEmployee.getEmailAddress());
                employee.setEmployeeLevel(editEmployee.getEmployeeLevel());
                employee.setEmployeePosition(editEmployee.getEmployeePosition());
                employee.setEmployeeSalary(editEmployee.getEmployeeSalary());
            }
        }
    }

    public Employee employeeInformation() {
        String employeeName;
        String dateOfBirth;
        String employeeGender;
        int employeeIdCardNumber;
        long employeePhoneNumber;
        String employeeMail;
        int employeeId;
        String employeeLevel;
        String employeePosition;
        int employeeSalary;

        try {
            System.out.print("Enter employee full-name: ");
            employeeName = scanner.nextLine();
            System.out.print("Enter employee's date of birth: ");
            dateOfBirth = scanner.nextLine();
            System.out.print("Enter employee gender: ");
            employeeGender = scanner.nextLine();
            System.out.print("Enter employee's ID card number: ");
            employeeIdCardNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter employee's phone number: ");
            employeePhoneNumber = Long.parseLong(scanner.nextLine());
            System.out.print("Enter employee's email: ");
            employeeMail = scanner.nextLine();
            System.out.print("Enter employee ID: ");
            employeeId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter employee's level: ");
            employeeLevel = scanner.nextLine();
            System.out.print("Enter employee's position: ");
            employeePosition = scanner.nextLine();
            System.out.print("Enter employee's salary: ");
            employeeSalary = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return employeeInformation();
        }
        return new Employee(employeeName, dateOfBirth, employeeGender, employeeIdCardNumber, employeePhoneNumber, employeeMail, employeeId, employeeLevel, employeePosition, employeeSalary);
    }
}
