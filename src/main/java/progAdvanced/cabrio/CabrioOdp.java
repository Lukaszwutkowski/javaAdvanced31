package progAdvanced.cabrio;

public class CabrioOdp {
    private String model;
    private String brand;
    private boolean moving;
    private boolean roofOpen;

    public CabrioOdp(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if(moving) {
            System.out.println("Nie możesz otwierać ani składać dachu podczas jazdy!");
        } else {
            this.roofOpen = roofOpen;
        }
    }
}
