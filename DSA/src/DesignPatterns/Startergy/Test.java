package DesignPatterns.Startergy;

import Pojo.Employee;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(10.0, 40, 2000.0);
        System.out.println(employee.calculateSalary()); // prints 400.0 (default calculation using HourlySalaryCalculationStrategy)
        employee.setCalculationStrategy(new MonthlySalaryCalculationStrategy());
        System.out.println(employee.calculateSalary()); // prints 2000.0 (new calculation using MonthlySalaryCalculationStrategy)
    }
}
