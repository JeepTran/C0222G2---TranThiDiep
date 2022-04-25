package case_study.furama_resort.models.person_models;

import case_study.furama_resort.models.Person;

import java.util.Date;

public class Customer extends Person {
    private Integer customerId;
    private String customerType; // type: Diamond, Platinum (Bạch kim), Gold, Silver, Member
    private String customerAddress;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String gender, Integer idCardNumber, Long phoneNumber, String emailAddress, Integer customerId, String customerType, String customerAddress) {
        super(fullName, dateOfBirth, gender, idCardNumber, phoneNumber, emailAddress);
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() +
                ", customer ID: " + customerId +
                ", type: " + customerType +
                ", address: " + customerAddress;
    }
}
