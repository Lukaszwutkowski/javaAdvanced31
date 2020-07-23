package Adress;

public class Adress {

    private String street;
    private int houseNumber;
    private int apartmentNumber;
    private String stateCode;
    private String city;

    public Adress (){}

    public Adress (String street, int houseNumber, int apartmentNumber){
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public Adress (String street, int houseNumber, int apartmentNumber, String stateCode, String city){
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.stateCode = stateCode;
        this.city = city;
    }

    public String streetWithNumbers (String street, int houseNumber, int apartmentNumber){
        return "Ulica: " + street + "\nNumer domu: " + houseNumber + "\nNumer mieszkania: " + apartmentNumber;
    }

    public String fullAdress (String street, int houseNumber, int apartmentNumber, String stateCode, String city){
        return "Ulica: " + street + "\nNumer domu: " + houseNumber + "\nNumer mieszkania: " + apartmentNumber + "\nKod pocztowy: " + stateCode + "\nMiasto: " + city;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    /*

*metody zwracające:*
* pełen adres
* ulicę (wraz z numerami)

     */

}


