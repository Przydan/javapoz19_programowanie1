package pl.sdacademy.employee;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> sortByAge() {
        return employeeRepository.sortByAge();
    }

    public List<Employee> sortBySalary() {
        return employeeRepository.sortBySalary();
    }
}
