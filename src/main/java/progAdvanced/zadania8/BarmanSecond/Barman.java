package progAdvanced.zadania8.BarmanSecond;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barman {

    private static Scanner scanner = new Scanner(System.in);

    private static Ingredient createIngredient(){
        System.out.println("Podaj nazwe skladnika");
        String ingName = scanner.nextLine();
        System.out.println("Podaj ilosc skladnika");
        double ingAmount = scanner.nextDouble();
        scanner.nextLine();
        return new Ingredient(ingName, ingAmount);
    }

    public static Drink createDrink(){
        System.out.println("Podaj ilosc skladnikow");
        int ingredientsNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientsNumber];
        for (int i = 0; i < ingredients.length; i++){
            ingredients[i] = createIngredient();
        }
        return new Drink(ingredients);
    }

    public static void printDrink(Drink drink) {
        Ingredient[] ingredients = drink.getIngredient();
        System.out.printf("Drink sklada sie z %d skladnikow:\n", ingredients.length);
        for (Ingredient ingredient : ingredients) {
            System.out.printf("-%s(%.0fml)\n", ingredient.getName(), ingredient.getAmount());
        }
    }

}
