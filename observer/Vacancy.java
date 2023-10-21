package ru.geekbrains.lesson7.observer;

public class Vacancy {
    private String vacancyName;
    private String position;
    private int salary;
    private AgencyClient company;

    public String getVacancyName() {
        return vacancyName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public AgencyClient getCompany() {
        return company;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(AgencyClient company) {
        this.company = company;
    }

}
