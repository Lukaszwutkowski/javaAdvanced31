package pl.sda.advanced.wzorceProjektoweZadania.decorator;

public class LuxuryCarDecorator extends BasicDecorator {


    public LuxuryCarDecorator(ICar car){
        super(car);
    }

    @Override
    public void startEngine(){
        System.out.println("Check aircondition");
    }
}
