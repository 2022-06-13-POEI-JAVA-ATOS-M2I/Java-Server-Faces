package com.m2i.jsf.lession;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

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

}
