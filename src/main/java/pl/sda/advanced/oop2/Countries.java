package pl.sda.advanced.oop2;

public enum Countries {    // Posiada skonczona liczbe instancji, obiektow

    POLAND("PL", "Polska"),
    USA("us", "Stany Zjednoczone"),
    FRANCE("FR", "Francja");

    private String symbol;
    private String plName;

    Countries(String symbol, String plName) { // Domyslnie jest prywatny
        this.symbol = symbol;
        this.plName = plName;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
