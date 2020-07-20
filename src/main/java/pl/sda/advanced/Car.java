package pl.sda.advanced;

import java.util.Objects;

public class Car {

    private String model;
    private String manufacturer;
    private String colour;
    private String vin;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, colour, vin);
    }
}
