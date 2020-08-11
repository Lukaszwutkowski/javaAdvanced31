package pl.sda.advanced.wzorceProjektoweZadania.decorator;

public class Test {
    public static void main(String[] args) {

        ICar car = new Car();

        car.startEngine();

        ICar car2 = new LuxuryCarDecorator(new PoliceCarDecorator(new Car()));
        car2.startEngine();
    }
}
