package SesjaSamodzielna1;

import Rectangle.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zadanie569();



    }


    private static void Zadanie569(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy: ");
        int lenght = Integer.valueOf(scanner.nextLine());

        Exce5And6 storage = new Exce5And6(lenght);

        for (int i = 0; i < lenght; i++){
            System.out.println("Podaj " + i + " element tablicy");
            int element = scanner.nextInt();
            storage.add(element);
        }

        System.out.println("Wartosci wybrane w tablicy: " + storage);
        storage.sort();
        storage.sum();
        storage.average();
        storage.reverse();
        storage.reverse2();
       // storage.isInside();
    }
}
