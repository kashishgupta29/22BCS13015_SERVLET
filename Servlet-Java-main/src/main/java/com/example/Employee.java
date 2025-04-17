package com.example;

public class Employee {

    private int id;
    private String name;
    private String email;
    private String department;

    Employee(int id, String name, String email, String department){
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
}
