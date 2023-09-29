package com.komar;

public class Middle extends Employee implements Observer {

    public Middle(String name, Vacancy vacancy) {
        super(name, vacancy);
        this.salary = 80_000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.vacancy.equals(vacancy)) {
            if (this.salary <= salary) {
                System.out.printf("Мидл %s: Мне нужна эта работа!(компания: %s; заработная плата %d; вакансия %s)\n",
                        name, nameCompany, salary, vacancy.getDescription());
                this.salary = salary;
                this.statusEmployee = StatusEmployee.WORKING;
            } else {
                System.out.printf("Мидл %s: Я найду работу получше!(компания: %s; заработная плата %d; вакансия %s)\n",
                        name, nameCompany, salary, vacancy.getDescription());
            }
        } else {
            System.out.printf("Мидл %s: Мне не подходит данная вакансия!(компания: %s; заработная плата %d; вакансия %s)\n",
                    name, nameCompany, salary, vacancy.getDescription());
        }
    }

    @Override
    public StatusEmployee getStatus() {
        return this.statusEmployee;
    }

    @Override
    public String toString() {
        return "Мидл " + name + " ищет вакансию " + vacancy.getDescription() + "\n";
    }
}
