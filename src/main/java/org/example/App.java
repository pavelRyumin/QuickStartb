package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployee = communication.getAllEmployees();
//        System.out.println(allEmployee);
//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);
//        Employee employee = new Employee("Sveta", "Kominz", "HR", 1400);
//        communication.saveEmployee(employee);
        communication.deleteEmployee(6);
    }
}
