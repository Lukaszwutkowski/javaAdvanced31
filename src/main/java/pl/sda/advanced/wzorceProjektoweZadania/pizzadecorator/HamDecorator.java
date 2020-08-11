package pl.sda.advanced.wzorceProjektoweZadania.pizzadecorator;

public class HamDecorator extends PizzaDecorator{

    int hamPrice = 5;

    public HamDecorator(IPizza basicPizza){
        super(basicPizza);
    }

    @Override
    public int getPrice(){
        return super.getPrice() + hamPrice;
    }
}
