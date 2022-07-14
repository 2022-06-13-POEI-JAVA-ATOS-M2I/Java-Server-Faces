package com.m2i.jsf.lesson;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

    private String name;
    private String department;
    private int age;
    private double salary;
    
    private static final List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("John", "Marketing", 30, 2000.00),
            new Employee("Robert", "Marketing", 35, 3000.00),
            new Employee("Mark", "Sales", 25, 2500.00),
            new Employee("Chris", "Marketing", 33, 2500.00),
            new Employee("Peter", "Customer Care", 20, 1500.00)
    ));

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String addEmployee() {		 
      Employee employee = new Employee(name, department, age, salary);
      employees.add(employee);
      return null;
   }
    
}
