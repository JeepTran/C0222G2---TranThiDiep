package repository.customer.impl;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.customer.ICustomerRepository;
import repository.base_repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private BaseRepository baseRepository = new BaseRepository();
    private final String FIND_CUSTOMER_BY_ID = " select * from customer where customer_id = ? ";
    private final String FIND_ALL_CUSTOMER = " select * from customer ";
    private final String FIND_ALL_CUSTOMER_TYPE = " select * from customer_type ";
    private final String INSERT_CUSTOMER = " insert into customer (customer_type_id, customer_name, customer_birthday, " +
            "customer_gender, customer_id_card, customer_phone, customer_email, customer_address) " +
            " values (?,?,?,?,?,?,?,?)";
    private final String DELETE_CUSTOMER_BY_ID = " delete from customer where customer_id = ? ";
    private final String UPDATE_CUSTOMER_BY_ID = " update customer set customer_type_id = ?, customer_name = ?, " +
            " customer_birthday = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?, " +
            "customer_email = ?, customer_address = ? where customer_id = ?";

    private final String FIND_CUSTOMER_BY_NAME = " select * from customer where customer_name like ? ";
    private final String FIND_CUSTOMER_BY_MULTI_INFO = " select * from customer " +
            " join customer_type on customer.customer_type_id = customer_type.customer_type_id " +
            " where customer_name like ? and customer_id like ? and customer.customer_type_id like ? ";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerList.add(new Customer(id, customerTypeId, name, birthday, gender, idCard, phone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = baseRepository.getConnectionJavaToDB();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_CUSTOMER_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerTypeId = resultSet.getInt("customer_type_id");
                String customerTypeName = resultSet.getString("customer_type_name");
                customerTypeList.add(new CustomerType(customerTypeId, customerTypeName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return customerTypeList;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getCustomerBirthday());
            preparedStatement.setInt(4, customer.getCustomerGender());
            preparedStatement.setString(5, customer.getCustomerIdCard());
            preparedStatement.setString(6, customer.getCustomerPhone());
            preparedStatement.setString(7, customer.getCustomerEmail());
            preparedStatement.setString(8, customer.getCustomerAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(int deleteId) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, deleteId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findCustomerById(int id) {
        Customer customer = null;
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id, customerTypeId, name, birthday, gender, idCard, phone, email, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void updateCustomerInfo(Customer customer) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getCustomerBirthday());
            preparedStatement.setInt(4, customer.getCustomerGender());
            preparedStatement.setString(5, customer.getCustomerIdCard());
            preparedStatement.setString(6, customer.getCustomerPhone());
            preparedStatement.setString(7, customer.getCustomerEmail());
            preparedStatement.setString(8, customer.getCustomerAddress());
            preparedStatement.setInt(9, customer.getCustomerId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findCustomerByName(String searchName) {
        List<Customer> customerSearchList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_CUSTOMER_BY_NAME);
            preparedStatement.setString(1, "%" + searchName + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerSearchList.add(new Customer(customerId, customerTypeId, name, birthday, gender, idCard, phone, email, address));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerSearchList;
    }

    @Override
    public List<Customer> findCustomerByMultiInfo(String searchName, String searchCustomerId, String searchCustomerTypeId) {
        List<Customer> customerSearchList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_CUSTOMER_BY_MULTI_INFO);
            preparedStatement.setString(1, "%" + searchName + "%");
            preparedStatement.setString(2, "%" + searchCustomerId + "%");
            preparedStatement.setString(3, "%" + searchCustomerTypeId + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerSearchList.add(new Customer(customerId, customerTypeId, name, birthday, gender, idCard, phone, email, address));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerSearchList;
    }
}