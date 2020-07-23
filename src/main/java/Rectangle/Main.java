package Rectangle;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle();
        rectangle.setLongerSide(4);
        rectangle.setShorterSide(2);
        System.out.println(rectangle.obwod());
        System.out.println(rectangle.polePowierzchni());
        System.out.println(rectangle.sameSize());
    }
}
