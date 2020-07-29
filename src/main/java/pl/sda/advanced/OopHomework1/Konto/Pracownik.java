package pl.sda.advanced.OopHomework1.Konto;

import java.math.BigDecimal;

public class Pracownik extends Konto {

    private String firstName;
    private String lastName;
    private int age;
    private boolean plec;
    private BigDecimal pensja;

    public Pracownik(String adress, String firstName, String lastName, boolean plec) {
        super(adress);
        this.firstName = firstName;
        this.lastName = lastName;
        this.plec = plec;
    }

    public String firstPlusLast (String firstName, String secondNAme, String lastName){
        String all = firstName + secondNAme + lastName;
        return all;
    }

    public String sexText(boolean text){
        if (true){
            return "Kobieta";
        } else {
        return "Mezczyzna";
        }
    }

    public String doEmerytury(int x){

        if (plec == true){
            return "Do emerytury pozostalo: " + (60 - x) + " lat";
        } else {
           return "Do emerytury pozostalo: " + (65 - x) + " lat";
        }
    }

    public void nameAndLastNameOneString(){
        String nameAndLastName = firstName + lastName;
        System.out.println(nameAndLastName);
    }

    public void plecTekst(){
        if (plec == true){
            System.out.println("Kobieta");
        } else {
            System.out.println("Mezczyzna");
        }
    }

    public void emeryturaCzas(){
        if (plec == true){
            System.out.println("Do emerytury pozostalo: " + (60 - age) + " lat");
        } else {
            System.out.println("Do emerytury pozostalo: " + (65 - age) + " lat");
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPlec() {
        return plec;
    }

    public void setPlec(boolean plec) {
        this.plec = plec;
    }

    public BigDecimal getPensja() {
        return pensja;
    }

    public void setPensja(BigDecimal pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", plec=" + plec +
                ", pensja=" + pensja +
                '}';
    }
}
