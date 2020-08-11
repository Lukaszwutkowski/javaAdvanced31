package pl.sda.advanced.wzorceProjektoweZadania.pizzadecorator;

public class BasicPizza implements IPizza{

    int basicPrice = 10;

    @Override
    public int getPrice(){
        return basicPrice;
    }

}
