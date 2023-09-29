package com.komar;

import java.util.Random;

public class Company {
    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private Vacancy vacancy;



    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        Vacancy randomVacancy = Vacancy.getRandomVacancy();
        jobAgency.sendOffer(name, salary, randomVacancy);
    }
}
