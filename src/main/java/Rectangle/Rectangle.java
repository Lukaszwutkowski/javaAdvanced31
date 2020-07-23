package Rectangle;

public class Rectangle {

    int shorterSide;
    int longerSide;

    public int obwod(){
        int c = (2*shorterSide)+(2*longerSide);
        return c;
    }
    public double polePowierzchni(){
        double wynik = (longerSide * longerSide) + (shorterSide * shorterSide);
        double przekatna = Math.sqrt(wynik);
        return przekatna;
    }

    public boolean sameSize(){
        if (shorterSide == longerSide){
            return true;
        } else {
            return false;
        }
    }

    public int getShorterSide() {
        return shorterSide;
    }

    public void setShorterSide(int shorterSide) {
        this.shorterSide = shorterSide;
    }

    public int getLongerSide() {
        return longerSide;
    }

    public void setLongerSide(int longerSide) {
        this.longerSide = longerSide;
    }
}
