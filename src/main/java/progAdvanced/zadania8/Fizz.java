package progAdvanced.zadania8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita z przedzialu 1 - 100");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 3 == 0){
                if (i % 5 == 0){
                    System.out.println(i + " FizzBuzz");
                } else {
                    System.out.println(i + " Fizz");
                }
            } else if (i % 5 == 0){
                System.out.println(i + " Buzz");
            }
            System.out.println(i);
        }
        IntStream.rangeClosed(1, number ).mapToObj(
                i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);

    }
}
