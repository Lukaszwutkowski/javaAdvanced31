package progAdvanced.zadania4;

import java.util.Arrays;
import java.util.Scanner;

public class Zadania4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe calkowita: ");
        int number = scanner.nextInt();

        System.out.println("Wypisanie liczb od 0 do: " + number + " za pomoca petli for: ");


        for (int i = 0; i <= number; i++) {
            System.out.print(i);
        }

        System.out.println("\nWypisanie liczb od 0 do: " + number + " za pomoca petli while: ");

        int num = 0;
        while (num <= number) {
            System.out.print(num);
            num++;
        }
        System.out.println();

        ArrayFactory arrayFactory = new ArrayFactory(number);
        int[] array1 = arrayFactory.buildOneDimension();
        int[][] array2 = arrayFactory.buildTwoDimensions();
        int[][] array3 = arrayFactory.buildTwoDimensionsInOneLine();
        int[][] array4 = arrayFactory.identityMatrix();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(array3));
        System.out.println(Arrays.deepToString(array4));

        System.out.println("Podaj liczbe calkowita conajmniej dwucyfrowa");
        int secondNumber = scanner.nextInt();
        System.out.print("Odwrotna kolejnosc znakow: \n");
        while (secondNumber > 0) {
            int reminder = secondNumber % 10;
            secondNumber /= 10;
            System.out.println(reminder);
        }

        System.out.println("Wpisz dowolny wyraz a ja wyswietle go w odwroconej kolejnosci :)");
        String text = scanner.next();
        for (int i = text.length() - 1; i >= 0; --i)
            System.out.print(text.charAt(i));
        System.out.println();

        System.out.println("Forma binarna podanej liczby calkowietej przez uzytkownika: " + Integer.toBinaryString(number));

        char[] data = text.toCharArray();
        int i2 = data.length - 1;
        boolean isPalindrom = true;

        for (int i = 0; i < data.length / 2; i++) {
            if (data[i] != data[i2--]) {
                System.out.println("Twoj ciag znakow nie jest palindrom");
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Twoj ciag znakow jest palindromem");
        }

    }

}

