package com.komar;

public class Employee {
    protected String name;
    protected int salary;
    protected Vacancy vacancy;
    protected StatusEmployee statusEmployee = StatusEmployee.UNEMPLOYED;

    public Employee(String name, Vacancy vacancy) {
        this.name = name;
        this.vacancy = vacancy;
    }
}
