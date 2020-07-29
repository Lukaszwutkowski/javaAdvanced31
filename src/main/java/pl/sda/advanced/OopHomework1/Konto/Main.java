package pl.sda.advanced.OopHomework1.Konto;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        kontoTest();

        System.out.println();

        Pracownik pracownik1 = new Pracownik("Kolorowa 7", "Iwona", "Nowak", true);
        Pracownik pracownik2 = new Pracownik("Szara 13", "Jozef", "Nowacki", false);

        pracownik1.setAge(34);
        pracownik2.setAge(56);

        pracownik1.nameAndLastNameOneString();
        pracownik1.plecTekst();
        pracownik1.emeryturaCzas();
        System.out.println("WERSJA DRUGA");
        System.out.println(pracownik1.firstPlusLast("Iwona", " ","Nowak" ));
        System.out.println(pracownik1.sexText(true));
        System.out.println(pracownik1.doEmerytury(34));
        pracownik2.nameAndLastNameOneString();
        pracownik2.plecTekst();
        pracownik2.emeryturaCzas();



    }

    private static void kontoTest() {
        Konto konto1 = new Konto(BigDecimal.valueOf(5000), "Adam Nowak", 123456, "Publiczna 1");
        System.out.println(konto1);

        Konto konto2 = new Konto(BigDecimal.valueOf(0), "Andrzej Nowak", 123123, "Prywatna 7");

        System.out.println("Numer konta PIERWSZEGO: " + konto1.getAccountNumber());


        Scanner scanner = new Scanner(System.in);
        System.out.println("PROBA WPLATY PIENIEDZY KONTO PIERWSZE: " + "\nPodaj kwote: ");
        BigDecimal tmpSaldo = konto1.inn(scanner.nextBigDecimal());
        System.out.println(tmpSaldo);
        System.out.println("PROBA POBRANIA PIENIEDZY KONTO PIERWSZE: " + "\nPodaj kwote: ");
        konto1.withdraw(scanner.nextBigDecimal());

        System.out.println("Numer konta DRUGIEGO: " + konto2.getAccountNumber());
        System.out.println("PROBA POBRANIA PIENIEDZY KONTO DRUGIE: " + "\nPodaj kwote: ");
        konto2.withdraw(scanner.nextBigDecimal());
    }
}
