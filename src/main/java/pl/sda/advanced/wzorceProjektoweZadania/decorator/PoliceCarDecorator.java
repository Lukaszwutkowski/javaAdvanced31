package pl.sda.advanced.wzorceProjektoweZadania.decorator;

public class PoliceCarDecorator extends BasicDecorator{

    public PoliceCarDecorator(ICar car){
        super(car);
    }

    @Override
    public void startEngine(){
        System.out.println("Check police instruments");
    }
}
