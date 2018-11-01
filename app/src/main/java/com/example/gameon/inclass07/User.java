package com.example.gameon.inclass07;

import java.io.Serializable;

public class User implements Serializable {
    String firstName;
    String lastName;
    int studentId;
    String department;
    int profile;

    public User() {
    }

    public User(String firstName, String lastName, int studentId, String department, int profile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.department = department;
        this.profile = profile;
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                ", department='" + department + '\'' +
                ", profile=" + profile +
                '}';
    }
}