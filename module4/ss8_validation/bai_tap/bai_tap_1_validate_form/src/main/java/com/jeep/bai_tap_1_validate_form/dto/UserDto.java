package com.jeep.bai_tap_1_validate_form.dto;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

public class UserDto implements Validator {
    private Integer id;

    @NotEmpty(message = "This field should not be empty.")
    @NotBlank(message = "This field should not be blank.")
    @Size(min = 5, max = 45, message ="This field should contain 5-45 characters.")
    private String firstName;

    @NotEmpty(message = "This field should not be empty.")
    @NotBlank(message = "This field should not be blank.")
    @Size(min = 5, max = 45, message ="This field should contain 5-45 characters.")
    private String lastName;

    @Pattern(regexp = "((09)|(08)|(07)|(05)|(03))[0-9]{8}", message = "Invalid phone number format (10 digits & started by 03/05/07/08/09 ")
    private String phone;

    private String dob;

    //    @Pattern(regexp = "[a-z]+[a-z0-9.]*@[a-z0-9]+(.)*[a-z+]")
    @Email(message = "Invalid email format!")
    private String email;

    public UserDto() {
    }

    public UserDto(Integer id, String firstName, String lastName, String phone, String dob, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dob = dob;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        int yearBirthday = Integer.parseInt(userDto.dob.substring(0, 4));
        int curYear = LocalDateTime.now().getYear();
        if (curYear - yearBirthday < 18) {
            errors.rejectValue("dob", "create.not18", "Not enough 18 years old!.");
        }
    }
}
