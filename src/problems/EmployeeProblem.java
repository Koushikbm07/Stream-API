package problems;

import dto.Employee;

import java.util.List;

public class EmployeeProblem {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("John", "IT"),
                new Employee("Bob", "IT"),
                new Employee("Alice", "HR"),
                new Employee("Emma", "HR"),
                new Employee("David", "Finance"),
                new Employee("Mike", "IT")

        );


    }
}
