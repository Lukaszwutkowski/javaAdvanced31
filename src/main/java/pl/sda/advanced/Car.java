package pl.sda.advanced;

import java.util.Objects;

public class Car {

    private String model;
    private String manufacturer;
    private String colour;
    private String vin;
    private CarOption[] options = new CarOption[1];

    public CarOption[] getOptions() {
        return options;
    }

    public void setOptions(CarOption[] options) {
        this.options = options;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModelAndManufakturer() {
        return "Marka samochodu: " + manufacturer + "\nModel samochodu: " + model;
    }

    public String getAllInformationAboutCar() {
        return "Marka samochodu: " + manufacturer + "\nModel samochodu: " + model + "\nKolor samochodu: " + colour + "\nNumer VIN: "
                + vin;
    }

    public boolean equals(Object anythingElse) {
        if (!this.getClass().equals(anythingElse.getClass())){
            return false;
        }
        Car car = (Car) anythingElse; // Rzutowanie
        if (this.vin.equals(car.vin)) {
            return true;
        } else {
            return false;
        }
    }

}
