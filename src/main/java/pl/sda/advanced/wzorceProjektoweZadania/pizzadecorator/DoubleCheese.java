package pl.sda.advanced.wzorceProjektoweZadania.pizzadecorator;

public class DoubleCheese extends PizzaDecorator{
    int cheesePrice = 15;

    public DoubleCheese(IPizza basicPizza){
        super(basicPizza);
    }

    @Override
    public int getPrice(){
        return super.getPrice() + cheesePrice;
    }
}
