package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 500000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Студент #1", "Секретарь");
        Master master1 = new Master("Мастер #1", "Директор");
        Master master2 = new Master("Мастер #2", "Инженер");
        Master master3 = new Master("Мастер #3", "Секретарь");
        Master master4 = new Master("Мастер #4", "Директор");
        Senior senior1 = new Senior("Сеньор #1","Программист");
        Senior senior2 = new Senior("Сеньор #2","Программист");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(master3);
        jobAgency.registerObserver(master4);
        jobAgency.registerObserver(senior1);
        jobAgency.registerObserver(senior2);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();

            System.out.println("\n-----------------\n");
        }
    }
    // Лекции: https://cloud.mail.ru/public/sCMM/NfYxiuNRc
}
