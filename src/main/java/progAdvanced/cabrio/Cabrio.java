package progAdvanced.cabrio;

public class Cabrio {

    private String manufacturer;
    private String model;
    private boolean move = true;
    private boolean openRoof = true;

    public Cabrio(String manufacturer, String model, boolean move, boolean openRoof) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.move = move;
        this.openRoof = openRoof;
    }

    public String openRoofButton(){
        if (move == true){
            return "Jestes w ruchu, zjedz na bok aby otworzyc dach" + " : " + "Dach jest otwarty: " + openRoof;
        } else if (move == false){
           return "Otwieranie dachu" ;
        } else if (openRoof == true){
            return "Dach otwarty";
        } else {
            return "Otwieranie dachu";
        }
    }
}
