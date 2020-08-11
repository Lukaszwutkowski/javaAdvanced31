package pl.sda.advanced.wzorceProjektoweZadania.pizzadecorator;

public class MushromDecorator extends PizzaDecorator{

    int mushromPrice = 7;

    public MushromDecorator(IPizza basicPizza){
        super(basicPizza);
    }

    @Override
    public int getPrice(){
        return super.getPrice() + mushromPrice;
    }
}
