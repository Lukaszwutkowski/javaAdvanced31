package pl.sda.advanced.OopHomework1.Figure;

public class Square extends Figure{

    private Point p;
    private double r;

    public Square(Point p, double r) {
        this.p = p;
        this.r = r;
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
