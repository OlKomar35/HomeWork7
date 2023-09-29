package com.komar;

import java.util.List;

public interface Publisher {

    void sendOffer(String companyName, int salary, Vacancy vacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    List<Observer> getObservers();
}
