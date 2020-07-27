package pl.sda.advanced.oop1;

import java.util.Objects;

// Ta klasa jest mutable - poniewaz zawiera settery
public class TestPerson {

    private String firstName;
    private String surname;
    private int agr;
    private String pesel;

    public String allPersonInformation(){
        return "Imie: " + firstName + "\nNazwisko: " + surname + "\nNumer pesel: " + pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAgr() {
        return agr;
    }

    public void setAgr(int agr) {
        this.agr = agr;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public boolean equals(Object object) {
        TestPerson testPerson = (TestPerson) object;
        return Objects.equals(testPerson.pesel, this.pesel);
    }

    public int hashCode() {
        return Objects.hashCode(pesel);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", agr=" + agr +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
