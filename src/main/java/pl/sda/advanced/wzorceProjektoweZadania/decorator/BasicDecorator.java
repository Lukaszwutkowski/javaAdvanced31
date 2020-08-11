package pl.sda.advanced.wzorceProjektoweZadania.decorator;

public class BasicDecorator implements ICar{

    private ICar car;

    public BasicDecorator(ICar car){
        this.car = car;
    }

    @Override
    public void startEngine(){
        car.startEngine();
    }
}
