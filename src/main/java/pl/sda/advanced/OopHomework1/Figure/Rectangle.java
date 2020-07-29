package pl.sda.advanced.OopHomework1.Figure;

public class Rectangle extends Figure {

    private Point p;
    private double width;
    private double height;

    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getAreal() {
        return 0;
    }

    @Override
    double getCircuit() {
        return 0;
    }

    @Override
    Point[] getEdges() {
        return new Point[0];
    }
}
