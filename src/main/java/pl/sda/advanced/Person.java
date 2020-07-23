package pl.sda.advanced;

public class Person {

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
        Person person = (Person) object;
        return this.pesel.equals(person.pesel);
    }

    public int hashCode() {
        return pesel.hashCode();
    }
}
