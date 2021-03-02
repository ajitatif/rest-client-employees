package org.acme.rest.models;

import java.sql.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email, Date dateOfBirth, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String lastName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle =  jobTitle; }

}