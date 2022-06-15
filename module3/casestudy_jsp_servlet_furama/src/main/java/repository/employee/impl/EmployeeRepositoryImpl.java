package repository.employee.impl;

import model.employee.*;
import repository.base_repository.BaseRepository;
import repository.employee.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private final String FIND_EMPLOYEE_BY_ID = " select * from employee where employee_id = ? ";
    private final String FIND_EMPLOYEE_BY_NAME = " select * from employee where employee_name like ? ";
    private final String FIND_ALL_EMPLOYEE = " select * from employee ";
    private final String FIND_ALL_POSITION = " select * from position ";
    private final String FIND_ALL_EDUCATION_DEGREE = " select * from education_degree ";
    private final String FIND_ALL_DIVISION = " select * from division ";
    private final String FIND_ALL_USER = " select * from user ";
    private final String INSERT_EMPLOYEE = " insert into employee (employee_name, employee_birthday, " +
            " employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, " +
            " education_degree_id, division_id, username) values (?,?,?,?,?,?,?,?,?,?,?)";
    private final String DELETE_EMPLOYEE_BY_ID = " delete from employee where employee_id = ? ";
    private final String UPDATE_EMPLOYEE_BY_ID = " update employee set employee_name = ?, employee_birthday = ?, " +
            " employee_id_card = ?, employee_salary = ?, employee_phone = ?, employee_email = ?, employee_address = ?, " +
            " position_id = ?, education_degree_id = ?, division_id = ?, username = ? where employee_id = ?";


    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                employeeList.add(new Employee(id, name, birthday, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId, username));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeBirthday());
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationDegreeId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.setString(11, employee.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployeeInfo(Employee employee) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_BY_ID);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeBirthday());
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationDegreeId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.setString(11, employee.getUsername());
            preparedStatement.setInt(12, employee.getEmployeeId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int deleteId) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, deleteId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee findEmployeeById(int id) {
        Employee employee = new Employee();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                employee = new Employee(id, name, birthday, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId, username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> findEmployeeByName(String searchName) {
        List<Employee> employeeSearchList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_EMPLOYEE_BY_NAME);
            preparedStatement.setString(1, "%" + searchName + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                employeeSearchList.add(new Employee(id, name, birthday, idCard, salary, phone, email, address,
                        positionId, educationDegreeId, divisionId, username));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeSearchList;
    }

    @Override
    public List<Position> findAllPosition() {
        List<Position> positionList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_POSITION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("position_id");
                String name = resultSet.getString("position_name");
                positionList.add(new Position(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positionList;
    }

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_EDUCATION_DEGREE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("education_degree_id");
                String name = resultSet.getString("education_degree_name");
                educationDegreeList.add(new EducationDegree(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegreeList;
    }

    @Override
    public List<Division> findAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_DIVISION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("division_id");
                String name = resultSet.getString("division_name");
                divisionList.add(new Division(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divisionList;
    }

    @Override
    public List<User> findAllUser() {
        List<User> userList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_USER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                userList.add(new User(username, password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
