package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.person_models.Employee;
import case_study.furama_resort.services.EmployeeService;
import case_study.furama_resort.utils.AgeException;
import case_study.furama_resort.utils.CheckRegex;
import case_study.furama_resort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();
    static ReadAndWrite readAndWrite = new ReadAndWrite();
    List<String> employeeStr = new ArrayList<>();
//    static {
//        employeeList.add(new Employee("Nguyen Van A", "20/04/2000", "Boy", 12345, 905000000L, "a@gmail.com", 1, "University", "Waiter", 7000000));
//        employeeList.add(new Employee("Huynh Van B", "20/05/2002", "Boy", 12346, 905000002L, "b@gmail.com", 8, "College", "Receptionist", 8000000));
//        employeeList.add(new Employee("Nguyen Thi C", "12/04/1991", "Girl", 12347, 905000003L, "c@gmail.com", 3, "University", "Director", 50000000));
//        employeeList.add(new Employee("Mai Thuy D", "02/04/1995", "Girl", 12348, 905000004L, "d@gmail.com", 4, "University", "Manager", 20000000));
//        employeeList.add(new Employee("Ta Van E", "10/11/1989", "Boy", 12349, 905000005L, "e@gmail.com", 6, "Technical School", "Officer", 7000000));
//        readAndWrite.writeToCsvFile(ReadAndWrite.EMPLOYEE_PATH, employeeList, false);
//    }


    @Override
    public void display() {
        employeeList.clear();
        employeeStr = readAndWrite.readCsvFileToList(ReadAndWrite.EMPLOYEE_PATH);
        for (String item : employeeStr) {
            // Cắt record
            String[] info = item.split(";");

            // đưa từng phần tử vào cho 1 employee
            Employee employee = new Employee();
            employee.setEmployeeId(Integer.parseInt(info[0]));
            employee.setFullName(info[1]);
            employee.setDateOfBirth(info[2]);
            employee.setGender(info[3]);
            employee.setIdCardNumber(Integer.parseInt(info[4]));
            employee.setPhoneNumber(Long.parseLong(info[5]));
            employee.setEmailAddress(info[6]);
            employee.setEmployeeLevel(info[7]);
            employee.setEmployeePosition(info[8]);
            employee.setEmployeeSalary(Integer.parseInt(info[9]));

            // add vào mảng employeeList
            employeeList.add(employee);
        }

        for(Employee employee : employeeList) {
            System.out.println(employee.getInfo());
        }
    }

    @Override
    public void add() {
        try {
            employeeList.add(employeeInformation());
            System.out.println("Add new employee successfully!");
            readAndWrite.writeToCsvFile(ReadAndWrite.EMPLOYEE_PATH, employeeList, false);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit() {
        System.out.print("Enter employee-ID to edit: ");
        int editEmployeeId = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (Employee employee : employeeList) {
            if (editEmployeeId == employee.getEmployeeId()) {
                count++;

                Employee  editEmployee = null;
                try {
                    editEmployee = employeeInformation();
                } catch (AgeException e) {
                    e.printStackTrace();
                }

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
                break;
            }
        }
        if (count == 0) {
            System.out.println("ID not found!");
        }
        readAndWrite.writeToCsvFile(ReadAndWrite.EMPLOYEE_PATH, employeeList, false);
    }

    public Employee employeeInformation() throws AgeException {
        String employeeName;
        String dateOfBirth = null;
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
            boolean check = true;
            while (check) {
                try {
                    System.out.print("Enter employee's date of birth: ");
                    dateOfBirth = scanner.nextLine();
                    CheckRegex.checkingAge(dateOfBirth, CheckRegex.BIRTHDAY_REGEX);
                    check = false;
                } catch (AgeException a) {
                    System.out.println(a.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
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
            System.out.println(e.getMessage());
            return employeeInformation();
        }
        return new Employee(employeeName, dateOfBirth, employeeGender, employeeIdCardNumber, employeePhoneNumber, employeeMail, employeeId, employeeLevel, employeePosition, employeeSalary);
    }
}
