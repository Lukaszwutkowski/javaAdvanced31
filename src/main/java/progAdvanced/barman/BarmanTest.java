package progAdvanced.barman;

public class BarmanTest {
    public static void main(String[] args) {
        Drink drink = Barman.createDrink("sok ananasowy", 100, "Likier", 50,
                "Mleko", 100);
        Barman.printDrink(drink);
    }
}
