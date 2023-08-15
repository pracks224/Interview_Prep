package DesignPatterns.Startergy;

import Pojo.Employee;

@FunctionalInterface
public interface CalculationStratergy {
    double salaryCaluclation(Employee employee);
}
