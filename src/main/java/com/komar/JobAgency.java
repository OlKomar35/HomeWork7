package com.komar;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, Vacancy vacancy) {
        for (Observer observer : observers) {
            if (observer.getStatus().equals(StatusEmployee.UNEMPLOYED)) {
                observer.receiveOffer(companyName, salary, vacancy);
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer.getStatus().equals(StatusEmployee.WORKING)) {
            observers.remove(observer);
        }
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }
}
