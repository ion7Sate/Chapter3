package com.company;

public class EmployeeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("David","Johson",5741.2);
        Employee employee2 = new Employee("Lia","Braun",4123.56);

        System.out.println(employee1.YarlySalary(employee1.getMonthlySalary()));
    }
}
