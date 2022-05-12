package org.example;

import org.example.models.Address;
import org.example.models.Employee;
import org.example.services.EmployeeService;
import lombok.extern.java.Log;

/**
 * Hello world!
 *
 */
@Log
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        EmployeeService employeeService = new EmployeeService();

        Employee e1 = new Employee("jafer", 70000);
        Address a1 = new Address("123 st", "", "plano", 75000, e1);

        employeeService.createEmployee(new Employee("john", 60000));
        employeeService.createEmployee(new Employee("jane", 50000));

        boolean saved = employeeService.createEmployeeAndAddress(a1);

        // e1.setId(233);
        e1.setName("someone else");
        e1.setSalary(101010);
        boolean updated = employeeService.updateEmployee(e1);
        log.info("Saved: "+Boolean.toString(saved));
        log.info("Updated: "+Boolean.toString(updated));
        log.info(employeeService.getAllEmployees().toString());
        log.info(employeeService.getEmployeeById(1).toString());
        log.info(employeeService.findEmployeeSalaryGreaterThan(100000).toString());
        log.info(Boolean.toString(employeeService.deleteEmployee(employeeService.getEmployeeById(1))));
        log.info(employeeService.findEmployeeAddresses(e1).toString());
    }
}
