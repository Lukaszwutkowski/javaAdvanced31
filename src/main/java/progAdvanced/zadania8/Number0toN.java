package progAdvanced.zadania8;

import java.math.BigDecimal;
import java.util.Scanner;

public class Number0toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        BigDecimal number = scanner.nextBigDecimal();
        scanner.close();

        for (BigDecimal i = BigDecimal.valueOf(0.0); i.compareTo(number) <= 0; i = i.add(BigDecimal.valueOf(0.1)))
            System.out.println(i);
        for (BigDecimal i = BigDecimal.valueOf(0.0); i.compareTo(number) >= 0; i = i.subtract(BigDecimal.valueOf(0.1)))
            System.out.println(i);


        System.out.println("Podaj liczbe calkowita: ");

        double n = scanner.nextDouble();
        scanner.close();
        if (n > 0) {
            for (double i = 0; i < (n + 0.1); i += 0.1) {
                System.out.printf("%.1f ", i);
            }
        } else if (n < 0) {
            for (double i = 0; i > (n - 0.1); i -= 0.1) {
                System.out.printf("%f ", i);
            }
        }

        System.out.println("Podaj liczbę:");
        double num = scanner.nextInt();
        scanner.close();
        BigDecimal limit = BigDecimal.valueOf(num);
        if (num > 0)
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(limit) <= 0; i = i.add(BigDecimal.valueOf(0.1)))
                System.out.print(i.toString() + " ");
        else if (n < 0)
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(limit) >= 0; i = i.subtract(BigDecimal.valueOf(0.1)))
                System.out.print(i.toString() + " ");

    }
}
