package com.komar;

public class Junior extends Employee implements Observer {
    public Junior(String name, Vacancy vacancy) {
        super(name, vacancy);
        this.salary = 20_000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.vacancy.equals(vacancy)) {
            if (this.salary <= salary) {
                System.out.printf("Джун %s: Мне нужна эта работа!(компания: %s; заработная плата %d; вакансия %s)\n",
                        name, nameCompany, salary, vacancy.getDescription());
                this.salary = salary;
                this.statusEmployee = StatusEmployee.WORKING;
            } else {
                System.out.printf("Джун %s: Я найду работу получше!(компания: %s; заработная плата %d; вакансия %s)\n",
                        name, nameCompany, salary, vacancy.getDescription());
            }
        } else {
            System.out.printf("Джун %s: Мне не подходит данная вакансия!(компания: %s; заработная плата %d; вакансия %s)\n",
                    name, nameCompany, salary, vacancy.getDescription());
        }
    }

    @Override
    public StatusEmployee getStatus() {
        return this.statusEmployee;
    }

    @Override
    public String toString() {
        return "Джун " + name + " ищет вакансию " + vacancy.getDescription() + "\n";
    }
}
