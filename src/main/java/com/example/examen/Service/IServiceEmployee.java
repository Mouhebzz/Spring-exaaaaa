package com.example.examen.Service;

import com.example.examen.Entity.Employee;

import java.util.List;

public interface IServiceEmployee {
    public Employee addEmployeeAndAssignToCompany(Employee employee,String companyName);
    List<Employee> getEmployyeByArea(String companyName,String area);
}
