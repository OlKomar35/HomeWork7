package com.komar;

public interface Observer {
    void  receiveOffer(String nameCompany, int salary, Vacancy vacancy);
    StatusEmployee getStatus();
}
