package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(Vacancy vacancy);

    public void setPosition(String position);

    public String getPosition();

    public void removeVacancy(Vacancy vacancy);

}
