package com.komar;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company gB = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Petrov", Vacancy.DESIGNER);
        Middle middle1 = new Middle("Ivanov", Vacancy.BACK_END_DEVELOPER);
        Middle middle2 = new Middle("Sidorov", Vacancy.ANALYST);
        Junior junior1 = new Junior("Radush", Vacancy.TESTER);
        Junior junior2 = new Junior("Komar", Vacancy.FULL_STACK_DEVELOPER);
        Senior senior1 = new Senior("Savenkova", Vacancy.FRONT_END_DEVELOPER);
        Senior senior2 = new Senior("Latuth", Vacancy.FULL_STACK_DEVELOPER);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(middle1);
        jobAgency.registerObserver(middle2);
        jobAgency.registerObserver(junior1);
        jobAgency.registerObserver(junior2);
        jobAgency.registerObserver(senior1);
        jobAgency.registerObserver(senior2);


        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            System.out.println("______________________________________________________________________________________");
            yandex.needEmployee();
            System.out.println("______________________________________________________________________________________");
            gB.needEmployee();
            System.out.println("______________________________________________________________________________________");
        }

        jobAgency.removeObserver(student1);
        jobAgency.removeObserver(middle1);
        jobAgency.removeObserver(middle2);
        jobAgency.removeObserver(junior1);
        jobAgency.removeObserver(junior2);
        jobAgency.removeObserver(senior1);
        jobAgency.removeObserver(senior2);
        System.out.println(jobAgency.getObservers());
    }

}
