package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    static BaseRepository baseRepository = new BaseRepository();
    private final String INSERT_QUERY = " insert into furama_resort_jsp_servlet " +
            " (employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone," +
            " employee_email,employee_address,position_id,education_degree_id,division_id,username) values " +
            " (?,?,?,?,?,?,?,?,?,?,?); ";
    private final String UPDATE_QUERY = " update furama_resort_jsp_servlet " +
            " set employee_name = ?, employee_birthday = ?, employee_id_card = ?, employee_salary = ?, " +
            " employee_phone = ?, employee_email = ?, employee_address = ?, position_id = ?," +
            " education_degree_id = ?, division_id = ?, username = ? where employee_id = ?";
    private final String DELETE_QUERY = " delete from furama_resort_jsp_servlet where employee_id = ? ";
    private final String SELECT_BY_ID_QUERY = " select * from furama_resort_jsp_servlet where employee_id = ? ";
    private final String SELECT_BY_NAME_QUERY = " select * from furama_resort_jsp_servlet where employee_name like ? ";
    private final String SELECT_ALL_QUERY = " select * from furama_resort_jsp_servlet ";


    @Override
    public void save(Employee employee) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
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
    public void edit(Employee employee) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);
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
        public void delete ( int employeeId){
            try (Connection connection = baseRepository.getConnectionJavaToDB()) {
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
                preparedStatement.setInt(1, employeeId);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public Employee searchById ( int employeeId){
        Employee employee = null;
            try (Connection connection = baseRepository.getConnectionJavaToDB()) {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY);
                preparedStatement.setInt(1, employeeId);
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
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
                    employee = new Employee(id,name,birthday,idCard,salary,phone,email,address,positionId,educationDegreeId,divisionId,username);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return employee;
        }

        @Override
        public List<Employee> searchByName (String employeeName){
        List<Employee> searchEmployeeList = new ArrayList<>();
            try (Connection connection = baseRepository.getConnectionJavaToDB()) {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME_QUERY);
                preparedStatement.setString(1, "%"+employeeName+"%");
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
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
                    searchEmployeeList.add(new Employee(id,name,birthday,idCard,salary,phone,email,address,positionId,educationDegreeId,divisionId,username));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return searchEmployeeList;
        }

        @Override
        public List<Employee> findAll () {
            List<Employee> selectAllList = new ArrayList<>();
            try (Connection connection = baseRepository.getConnectionJavaToDB()) {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY);
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
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
                    selectAllList.add(new Employee(id,name,birthday,idCard,salary,phone,email,address,positionId,educationDegreeId,divisionId,username));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return selectAllList;
        }
    }
