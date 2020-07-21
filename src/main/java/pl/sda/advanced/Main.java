package pl.sda.advanced;

public class Main {
    public static void main(String[] args) {

        createCarsBasic();

        CarOption option1 = new CarOption();
        CarOption option2 = new CarOption();

        option1.setOptionName("Radio z Mp3");
        option1.setPrice(2000);
        option1.setChosen(true);

        option2.setOptionName("Radio z nawigacja");
        option2.setPrice(8500);
        option2.setChosen(true);

        CarOption[] tab = new CarOption[2];
        tab[0] = option1;
        tab[1]= option2;

        CarOption[] tab2 = new CarOption[] {option1, option2};

        Car car = new Car();
        car.setManufacturer("Skoda");
        car.setModel("Fabia");
        car.setColour("Czarny");
        car.setVin("VM2324545667");
        car.setOptions(tab);
        System.out.println(car.getAllInformationAboutCar() + "\nDodatkowe wyposazenie: " + tab);

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
