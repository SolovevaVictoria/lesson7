package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        for (int i = observers.size() - 1; i >= 0; i--) {
            Company k = (Company) vacancy.getCompany();
            if (k.isVacansyInList(vacancy)) observers.get(i).receiveOffer(vacancy);
        }
    }
}
