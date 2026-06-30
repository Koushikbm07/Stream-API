package dto;

import lombok.Getter;

@Getter
public class Employee {
    private long empId;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private long salary;

    public Employee(String firstname,String department, long salary){
        this.firstName = firstname;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String firstname,String department){
        this.firstName = firstname;
        this.department = department;
    }
}
