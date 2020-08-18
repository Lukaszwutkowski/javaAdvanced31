package progAdvanced.cabrio;

public class CabrioTest {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Mazda", "MX5", true, false);
        System.out.println(cabrio.openRoofButton());

        Cabrio cabrio1 = new Cabrio("Volvo", "C70", false, true);
        System.out.println(cabrio1.openRoofButton());

        Cabrio cabrio2 = new Cabrio("Mercedes", "E320", false, false);
        System.out.println(cabrio2.openRoofButton());

        CabrioOdp cabrioOdp = new CabrioOdp("M6 Cabrio", "BMW");
        cabrioOdp.setRoofOpen(true);
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s\n", cabrioOdp.isMoving(), cabrioOdp.isRoofOpen());
        cabrioOdp.setMoving(true);
        cabrioOdp.setRoofOpen(false);//samochód się porusza, nie uda się złożyć dachu
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s", cabrioOdp.isMoving(), cabrioOdp.isRoofOpen());

    }


}
