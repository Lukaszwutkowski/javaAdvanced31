package pl.sda.advanced.wzorceProjektoweZadania.pizzadecorator;

public class Test {
    public static void main(String[] args) {

        IPizza pizza2 = new BasicPizza();
        System.out.println(pizza2.getPrice());

        IPizza pizza1 = new MushromDecorator(new BasicPizza());
        System.out.println(pizza1.getPrice());

        IPizza pizza = new DoubleCheese(new MushromDecorator(new BasicPizza()));
        System.out.println(pizza.getPrice());

        IPizza pizza3 = new HamDecorator(new BasicPizza());
        System.out.println(pizza3.getPrice());

        IPizza pizza4 = new DoubleCheese(new MushromDecorator(new HamDecorator(new BasicPizza())));
        System.out.println(pizza4.getPrice());
    }
}
