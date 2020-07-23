package pl.sda.advanced;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        createCarsBasic();
        createCarOption();
        createPerson();
        equalsExample();

        CarOption radio = new CarOption("Radio", BigDecimal.valueOf(2000));
        CarOption whippers = new CarOption("Wycieraczki", BigDecimal.valueOf(170));

        Car car = new Car();
        car.setManufacturer("Skoda");
        car.setModel("Fabia");
        car.setColour("Niebieski");
        car.setVin("TMBR4567345678450");
        car.setOptions(new CarOption[] {radio,whippers});
        car.setBasePrice(BigDecimal.valueOf(32560));
        Person person = new Person();
        person.setSurname("Kowalski");
        person.setFirstName("Marian");
        person.setPesel("86042976456");

        System.out.println("Gratulujemy " + person.getFirstName() + " zakupu nowego samochodu"
                + "\nInformacje nowego wlasciciela: " + "\n" + person.allPersonInformation()
                + "\nInformacje odnosnie zakuponego samochodu: " + "\n" + car.getAllInformationAboutCar()
                + "\nDodatkowe wyposazenie: " + car.getOptions()
                + "\nCena calkowita samochodu: " + car.finallyPrice());


    }

    private static void equalsExample(){
        Long first = 127L;
        Long scond = 127L;

        System.out.println(first==scond); //przypadek - wynika ze zastosowania cash'a
        System.out.println(first.equals(scond));

        Long third = 128L;
        Long fourth = 128L;

        System.out.println(third==fourth);
        System.out.println(third.equals(fourth));

        long n1 = 128;
        long n2 = 128;

        String text = "abcCzyCokolwiek";
        String text2 = new String("abcCzyCokolwiek");
    }

    private static void createPerson(){
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setFirstName("Anna");
        person2.setFirstName("Anna");

        person1.setPesel("88091231213");
        person2.setPesel("88091231213");

        person1.setSurname("Nowak");
        person2.setSurname("Nowakowski");

        System.out.println();

        System.out.println("Porownanie 1: " + (person1 == person2));
        System.out.println("Porownanie 2: " + person1.equals(person2));
        System.out.println("Porownanie 3: " + (person1.hashCode()==person2.hashCode()));

    }
    
    private static void createCarOption(){
        CarOption option1 = new CarOption();
        CarOption option2 = new CarOption();

        option1.setOptionName("Radio z Mp3");
        option1.setPrice(BigDecimal.valueOf(2000));
        option1.setChosen(true);

        option2.setOptionName("Radio z nawigacja");
        option2.setPrice(BigDecimal.valueOf(8500));
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
        System.out.print(car.getAllInformationAboutCar() + "\nDodatkowe wyposazenie: " + Arrays.toString(car.getOptions()));
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
