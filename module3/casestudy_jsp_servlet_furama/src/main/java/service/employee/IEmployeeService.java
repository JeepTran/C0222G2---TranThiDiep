package service.employee;

import model.employee.*;

import java.util.List;

public interface IEmployeeService {
    Employee findEmployeeById(int updateId);

    List<Position> findAllPosition();

    List<Employee> findEmployeeByName(String searchName);

    List<Employee> findAll();

    void addNewEmployee(Employee employee);

    void updateEmployeeInfo(Employee employee);

    void deleteEmployee(int deleteId);

    List<EducationDegree> findAllEducationDegree();

    List<Division> findAllDivision();

    List<User> findAllUser();
}
