package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company implements AgencyClient{

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public List<Vacancy> vacancyList = new ArrayList<>();


    public Vacancy createVacancy(){
        int salary = random.nextInt(maxSalary);
        String[] positions = new String[] {"Менеджер", "Инженер", "Программист", "Учитель", "Секретарь", "Директор"};
        int indexPosition = random.nextInt(positions.length);
        Vacancy vacancy = new VacancyBuilder()
                .setCompany(this)
                .setPosition(positions[indexPosition])
                .setSalary(salary)
                .build();
         return vacancy;
    }


    @Override
    public void removeVacancy(Vacancy vacancy) {
        this.vacancyList.remove(vacancy);
    }

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.vacancyList.add(createVacancy());
        this.vacancyList.add(createVacancy());
        this.vacancyList.add(createVacancy());
    }

    public void removeObserver(Observer observer){
        this.jobAgency.removeObserver(observer);
    }

    public String getName() {
        return name;
    }


    public void needEmployee(){
        if (this.vacancyList != null){
            int i = random.nextInt(this.vacancyList.size());
            Vacancy vacancy = vacancyList.get(i);
            jobAgency.sendOffer(vacancy);}
    }

    public Boolean isVacansyInList(Vacancy vacancy){
        return this.vacancyList.contains(vacancy);
    }

}
