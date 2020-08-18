package progAdvanced.rectangle;

public class ShapeCalcTest {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(6, 0);
        Point p3 = new Point(6, 5);
        Point p4 = new Point(0, 5);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        double rectArea = ShapeCalc.rectangleArea(rectangle);
        System.out.println("Pole prostokąta to: " + rectArea);

        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);
        Point ok = new Point(0, 3);
        Point notOk = new Point(0, 6);
        boolean pointInsideCircleOk = ShapeCalc.isPointInsideCircle(circle, ok);
        boolean pointInsideCircleNotOk = ShapeCalc.isPointInsideCircle(circle, notOk);
        System.out.println("Pierwszy punkt leży w okręgu: " + pointInsideCircleOk);
        System.out.println("Drugi punkt leży w okręgu: " + pointInsideCircleNotOk);
    }
}
