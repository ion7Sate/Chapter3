package com.company;

public class EmployeeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("David","Johson",1600.8);
        Employee employee2 = new Employee("Lia","Braun",1200.5);
        employee1.setMonthlySalary(employee1.getMonthlySalary()*1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
        System.out.println(employee1.getFirstName()+"'s annual salary is "+employee1.YearlySalary(employee1.getMonthlySalary()));
        System.out.println(employee2.getFirstName()+"'s annual salary is "+employee2.YearlySalary(employee2.getMonthlySalary()));
    }
}
