package pl.sdacademy.employee;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmployeeServiceTest {

    @Test
    public void findAllShouldReturnGivenEmplyees() {
        // given

        List<Employee> employees = Arrays.asList(
                new Employee("name 1", 5000, 23),
                new Employee("name 2", 3000, 34),
                new Employee("name 3", 7000, 39)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));

        // when

        List<Employee> result = employeeService.findAll();

        // then

        Assert.assertEquals("some-messeage", employees, result); // expected i acctuall
    }

    @Test
    public void sortByAgeShouldReturnSortedEmployees() {
        // given
        List<Employee> employees = Arrays.asList(
                new Employee("name 1", 5000, 23),
                new Employee("name 2", 3000, 35),
                new Employee("name 3", 7000, 39)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));

        // when

        List<Employee> result = employeeService.sortByAge();

        // then

        Assert.assertEquals(" some messeage", employees, result);

    }

    @Test
    public void sortBySalaryShouldReturnSortedEmployeesBySalary() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("name 1", 5000, 23),
                new Employee("name 2", 3000, 35),
                new Employee("name 3", 7000, 39)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));

        //when

        List<Employee> result = employeeService.sortBySalary();

        //then

        Assert.assertEquals(employees.get(1), result.get(0));
        Assert.assertEquals(employees.get(0), result.get(1));
        Assert.assertEquals(employees.get(2), result.get(2));
    }

}
