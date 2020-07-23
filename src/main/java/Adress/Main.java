package Adress;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Adress adress = new Adress();

        Adress adress1 = new Adress("Kolorowa", 23, 5);

        Adress adress2 = new Adress("Rozowa", 21, 12, "80-234", "Gdansk");

        System.out.println(adress1);

        Adress adress3 = new Adress();
        System.out.println(adress3.streetWithNumbers("Niebieska", 12, 23));
        System.out.println();

        Adress adress4 = new Adress();
        System.out.println(adress4.fullAdress("Dzika", 01, 12, "80-234", "Gdansk"));



    }

}
