package org.example.dao;

import org.example.models.Address;
import org.example.models.Employee;

import java.util.List;

public interface EmployeeI {
    List<Employee> getAllEmployees();
    Employee createEmployee(Employee e);
    boolean createEmployeeAndAddress(Address a);
    boolean updateEmployee(Employee e);
    boolean deleteEmployee(Employee e);
    Employee getEmployeeById(int id);
    List<Employee> findEmployeeSalaryGreaterThan(double salary);
    List<Address> findEmployeeAddresses(Employee e);
}
