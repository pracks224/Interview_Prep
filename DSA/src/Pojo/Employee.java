package Pojo;

import DesignPatterns.Startergy.CalculationStratergy;
import DesignPatterns.Startergy.HourlySalaryCalculationStrategy;

public class Employee {
    private CalculationStratergy calculationStrategy;
    private double hourlyRate;
    private int hoursWorked;
    private double monthlySalary;

    public Employee(double hourlyRate, int hoursWorked, double monthlySalary) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.monthlySalary = monthlySalary;
        calculationStrategy = new HourlySalaryCalculationStrategy(); // default strategy
    }

    public void setCalculationStrategy(CalculationStratergy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculateSalary() {
        return calculationStrategy.salaryCaluclation(this);
    }
}
