package pl.sda.advanced;

public class Main {
    public static void main(String[] args) {

        createCarsBasic();

    }

    private static void createCarsBasic(){
        Car car1 = new Car();
        car1.setModel("XJ");
        car1.setManufacturer("Jaguar");
        car1.setColour("Czarny");
        car1.setVin("VN213423456755");

        System.out.println(car1.getModelAndManufakturer());
        System.out.println();
        System.out.println(car1.getAllInformationAboutCar());

        Car car2 = new Car();
        car2.setModel("XJ");
        car2.setManufacturer("Jaguar");
        car2.setColour("Czarny");
        car2.setVin("VN213423456755");
        System.out.println("Samochody takie same: " + car1.equals(car2));

        System.out.println("Samochody te same: " + (car2 == car1));

        System.out.println(car1.equals("VN213423456755"));
    }
}
