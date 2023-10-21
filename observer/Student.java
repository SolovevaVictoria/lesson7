package ru.geekbrains.lesson7.observer;

public class Student implements Observer{

    private String name;

    private String position;
    private int salary = 2000;

    public Student(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void removeObserver(AgencyClient company, Observer observer){
        company.removeObserver(observer);
    }

    public void removeVacancy(Vacancy vacancy){
        vacancy.getCompany().removeVacancy(vacancy);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '}';
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() && this.position == vacancy.getPosition()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, vacancy.getCompany().getName(), vacancy.getSalary(), vacancy.getPosition());
            this.salary = vacancy.getSalary();
            vacancy.getCompany().removeObserver(this);

        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, vacancy.getCompany().getName(), vacancy.getSalary(), vacancy.getPosition());
        }
    }
}
