package pl.sdacademy.employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();

    List<Employee> sortByAge();

    List<Employee> sortBySalary();

    //Map<String, List<Employee>> groupByAgeSegment();
}
