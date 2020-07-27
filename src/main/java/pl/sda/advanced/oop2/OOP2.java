package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class OOP2 {

    public static void main(String[] args) {

        personBasic();
        polymorphism();
        interfaces();

    }

    private static void interfaces() {
        AgeHolder student = new Student("Jan", "Kowalski", BigDecimal.valueOf(200));
        AgeHolder dog = new Dog(5);

        AgeHolder[] ageHolders = new AgeHolder[]{student, dog};
        for (AgeHolder ageHolder : ageHolders) {
            System.out.println(ageHolder.getAge());
        }
    }

    private static void polymorphism() {
        Person studentPerson = new Student("Jan", "Kowalski", BigDecimal.valueOf(200));
        Person workerPerson = new Worker("Kuba", "Nowak", BigDecimal.valueOf(5000));
        printIncome(studentPerson);
        printIncome(workerPerson);

        Person[] people = new Person[]{studentPerson, workerPerson};
        for (int i = 0; i < people.length; i++){
            Person person = people[i];
            String name = person.introduceMyself();
            System.out.println(name);
            if (person instanceof Student){
                BigDecimal moneyFromMum = ((Student) person).getMoneyFromMum();
                System.out.println(moneyFromMum);
            }

        }
    }

    // Przyklad przypisania syudenta/workera - nadiarowy
    public static void printIncome(Student student){
        System.out.println(student.getIncome());
    }

    public static void printIncome(Worker worker){
        System.out.println(worker.getIncome());
    }

    public static void printIncome(Person person){
        System.out.println(person.getIncome());
    }

    public static void personBasic(){
        Student student = new Student("Jan", "Kowalski", BigDecimal.valueOf(200));
        Worker worker = new Worker("Kuba", "Nowak", BigDecimal.valueOf(5000));

        System.out.println(student);
        System.out.println(worker);
        System.out.println(student.introduceMyself());
        System.out.println(worker.introduceMyself());
        System.out.println(student.getIncome());
        System.out.println(worker.getIncome());

        System.out.println(student.getMoneyFromMum());
        System.out.println(worker.getMoneyFromWork());
    }
}
