package ru.geekbrains.lesson7.observer;

public class VacancyBuilder {
    private Vacancy vacancy;

    public VacancyBuilder(){
        vacancy = new Vacancy();
    }

    public Vacancy build(){
        if (vacancy.getCompany() == null) {
            throw new RuntimeException("Компания указана некорректно");
        };
        if (vacancy.getSalary() == 0) {
            throw new RuntimeException("Заработная плата указана некорректно");
        };
        if (vacancy.getPosition() == null) {
            throw new RuntimeException("Должность указана некорректно");
        };
        return vacancy;
    }

    public VacancyBuilder setVacancyName(String vacancyName){
        vacancy.setVacancyName(vacancyName);
        return this;
    }

    public VacancyBuilder setPosition(String position){
        vacancy.setPosition(position);
        return this;
    }

    public VacancyBuilder setSalary(int salary){
        vacancy.setSalary(salary);
        return this;
    }

    public VacancyBuilder setCompany(AgencyClient company){
        vacancy.setCompany(company);
        return this;
    }
}
