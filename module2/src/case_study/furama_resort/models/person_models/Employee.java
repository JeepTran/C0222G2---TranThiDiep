package case_study.furama_resort.models.person_models;

import case_study.furama_resort.models.Person;

public class Employee extends Person {
    private Integer employeeId;
    private String employeeLevel; // level: Technical School (Trung cấp), College (Cao đẳng), University (Đại học), (Postgraduate) Sau Đại học
    private String employeePosition; // position: Receptionist (Lễ tân), Waiter (Phục vụ), Officer (Chuyên viên), Supervisor (Giám sát), Manager (Quản lý), Director (Giám đốc)
    private Integer employeeSalary;

    public Employee() {
    }

    public Employee(String fullName, String dateOfBirth, String gender, Integer idCardNumber, Long phoneNumber, String emailAddress, Integer employeeId, String employeeLevel, String employeePosition, Integer employeeSalary) {
        super(fullName, dateOfBirth, gender, idCardNumber, phoneNumber, emailAddress);
        this.employeeId = employeeId;
        this.employeeLevel = employeeLevel;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return this.getEmployeeId() + ";" + this.getFullName() + ";" + this.getDateOfBirth() + ";" +
                this.getGender() + ";" + this.getIdCardNumber() + ";" + this.getPhoneNumber() + ";" +
                this.getEmailAddress() + ";" + this.getEmployeeLevel() + ";" + this.getEmployeePosition() + ";" + this.getEmployeeSalary();
    }

    public String getInfo() {
        return "Employee: " +
                "employee ID: " + employeeId +
                "," + super.toString() +
                ", level: " + employeeLevel +
                ", position: " + employeePosition +
                ", salary: " + employeeSalary;
    }
}
