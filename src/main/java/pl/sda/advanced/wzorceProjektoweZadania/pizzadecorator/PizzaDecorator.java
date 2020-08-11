package pl.sda.advanced.wzorceProjektoweZadania.pizzadecorator;

public class PizzaDecorator extends BasicPizza{

    private IPizza basicPizza;

    public PizzaDecorator(IPizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public int getPrice() {
        return basicPizza.getPrice();
    }
}
