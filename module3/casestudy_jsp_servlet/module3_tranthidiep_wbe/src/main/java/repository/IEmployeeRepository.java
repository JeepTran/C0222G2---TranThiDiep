package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void save(Employee employee);
    void edit(Employee employee);
    void delete(int employeeId);
    Employee searchById(int employeeId);
    List<Employee> searchByName(String employeeName);
    List<Employee> findAll();
}
