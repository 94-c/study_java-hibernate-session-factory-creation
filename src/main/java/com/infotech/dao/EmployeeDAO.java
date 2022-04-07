package com.infotech.dao;

import com.infotech.entity.Employee;

public interface EmployeeDAO {

    public abstract void addEmployee(Employee employee);
    public abstract Employee fetchEmployeeById(int employeeId);
    public abstract void updateEmployeeById(int employeeId, Double newSal);
    public abstract void deleteEmployeeById(Integer employeeId);
}
