package service.customer.impl;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.customer.ICustomerRepository;
import repository.customer.impl.CustomerRepositoryImpl;
import service.customer.ICustomerService;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {

    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();
    private final String PHONE_REGEX = "^(\\(84\\)\\+|0)9[01][0-9]{7}$";
    private final String ID_CARD_REGEX = "^[0-9]{9}|[0-9]{12}$";
    private final String EMAIL_REGEX = "^[a-z]+[.]*[a-z1-9]+@[a-z]+[.]*[a-z]+$";

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerRepository.findAllCustomerType();
    }

    @Override
    public Map<String, String> addNewCustomer(Customer customer) {
        Map<String, String> errors = createAndUpdateCustomerErrors(customer);
        if (errors.isEmpty()) {
            customerRepository.addNewCustomer(customer);
        } else {
            return errors;
        }
        return errors;
    }

    @Override
    public void deleteCustomer(int deleteId) {
        customerRepository.deleteCustomer(deleteId);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public Map<String, String> updateCustomerInfo(Customer customer) {
        Map<String, String> errors = createAndUpdateCustomerErrors(customer);
        if (errors.isEmpty()) {
            customerRepository.updateCustomerInfo(customer);
        } else {
            return errors;
        }
        return errors;

    }

    @Override
    public List<Customer> findCustomerByMultiInfo(String searchName, String searchCustomerId, String searchCustomerTypeId) {
//        return customerRepository.findCustomerByName(searchName);
        return customerRepository.findCustomerByMultiInfo(searchName,searchCustomerId,searchCustomerTypeId);
    }

    private Map<String, String> createAndUpdateCustomerErrors(Customer customer) {
        Map<String, String> errors = new HashMap<>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = null;
        LocalDate now = null;
        int age = 0;

        try {
            birthday = LocalDate.parse(customer.getCustomerBirthday(), dateTimeFormatter);
            now = LocalDate.now();
            age = Period.between(birthday, now).getYears();
        } catch (DateTimeParseException d) {
            d.printStackTrace();
        }

        if (customer.getCustomerTypeId() > 5 || customer.getCustomerTypeId() < 1) {
            errors.put("customerTypeId", "Select customer type!");
        }
        if (customer.getCustomerName().equals("") || customer.getCustomerName() == null) {
            errors.put("customerName", "This field should not be empty!");
        }
        if (customer.getCustomerBirthday().equals("") || customer.getCustomerBirthday() == null) {
            errors.put("customerBirthday", "This field should not be empty!");
        } else if (age < 18) {
            errors.put("customerBirthday", "Customer should be older than or equal to 18 years old!");
        }
        if (customer.getCustomerGender() > 1 || customer.getCustomerGender() < -1) {
            errors.put("customerGender", "Select gender!");
        }
        if (customer.getCustomerPhone().equals("") || customer.getCustomerPhone() == null) {
            errors.put("customerPhone", "This field should not be empty!");
        } else if (!customer.getCustomerPhone().matches(PHONE_REGEX)) {
            errors.put("customerPhone", "Phone should be in format: 090xxxxxxx, 091xxxxxxx, (84)+90xxxxxxx or (84)+91xxxxxxx");
        }
        if (customer.getCustomerIdCard().equals("")) {
            errors.put("customerIdCard", "This field should not be empty!");
        } else if (!customer.getCustomerIdCard().matches(ID_CARD_REGEX)) {
            errors.put("customerIdCard", "ID Card contains 9 or 12 digits.");
        } else if (customerRepository.findAll().indexOf(customer.getCustomerName()) == -1 &&
                customerRepository.findAll().indexOf(customer.getCustomerIdCard()) != -1) {
            errors.put("customerIdCard", "ID Card should not be the same with other person!");
        }
        if (customer.getCustomerEmail().equals("") || customer.getCustomerEmail() == null) {
            errors.put("customerEmail", "This field should not be empty!");
        } else if (!customer.getCustomerEmail().matches(EMAIL_REGEX)) {
            errors.put("customerEmail", "Invalid email format!");
        }
        if (customer.getCustomerAddress().equals("") || customer.getCustomerAddress() == null) {
            errors.put("customerAddress", "This field should not be empty!");
        }
        return errors;
    }

}
