package ru.geekbrains.lesson7.observer;

public interface AgencyClient {

    public String getName();
    public void needEmployee();
    public void removeObserver(Observer observer);
    public void removeVacancy(Vacancy vacancy);

}
