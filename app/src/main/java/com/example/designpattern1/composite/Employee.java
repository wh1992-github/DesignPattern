package com.example.designpattern1.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 2020-02-02.
 * 1. 创建 Employee 类，该类带有 Employee 对象的列表。
 */

public class Employee {
    //姓名
    private String name;
    //部门
    private String dept;
    //工资
    private int salary;
    //员工 list
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : subordinates) {
            stringBuilder.append("\nEmployee{")
                    .append("name = ").append(employee.name)
                    .append(", dept = ").append(employee.dept)
                    .append(", salary = ").append(employee.salary)
                    .append("}");
        }
        return stringBuilder.toString();
    }
}
