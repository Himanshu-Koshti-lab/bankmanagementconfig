package com.tcs.poc.app.model;

import java.util.Date;

import lombok.Data;

@Data
public class UserResponse {
    
    private int user_id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailID;
    private String password;
    private long mobileNo;
    private Date dob;
    private String gender;
    private String currentAddress;
    private String currentCity;
    private String currentState;
    private long currentZipcode;
    private String permanentAddress;
    private String permanentCity;
    private String permanentState;
    private long permanentZipcode;
    private String securityQuestion;
    private String answer;
    private Date createdDate;
    private Date lastModifiedDate;
    private String createdBy;
    private String modifiedBy;
    private int OTP;
    private String role;
    private UserRegistrationStatusResponse registrationStatus;
    
}
