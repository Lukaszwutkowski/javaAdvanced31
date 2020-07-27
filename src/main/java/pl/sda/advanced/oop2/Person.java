package pl.sda.advanced.oop2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Person {
    private String firstName;
    private String lastName;


    public String introduceMyself(){
        return "Jestem czlowiekiem";
    }

    public BigDecimal getIncome() // metoda abstrakcyjna - nie posiada ciala i wymaga implementacji, nadpisania
    {
        return null;
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
