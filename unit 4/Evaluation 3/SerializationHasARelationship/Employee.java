package com.evaluation3.SerializationHasARelationship;

public class Employee extends Address{
    private String empId;
    private String empName;
    private String email;
    transient private String password;

    public Employee(String state, String city, String pincode, String empId, String empName, String email, String password) {
        super(state, city, pincode);
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
