package case_study.furama_resort.models;

import java.util.Date;

public abstract class Person {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private Integer idCardNumber;
    private Long phoneNumber;
    private String emailAddress;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, String gender, Integer idCardNumber, Long phoneNumber, String emailAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(Integer idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return  fullName +
                ", DOB: " + dateOfBirth +
                ", gender: " + gender +
                ", ID card: " + idCardNumber +
                ", phone: " + phoneNumber +
                ", email: " + emailAddress ;
    }
}
