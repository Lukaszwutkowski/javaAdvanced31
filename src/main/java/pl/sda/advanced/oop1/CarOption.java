package pl.sda.advanced.oop1;

import java.math.BigDecimal;

public class CarOption {

    private String optionName; // nazwa wyposazenia
    private BigDecimal price;
    private boolean chosen;

    public CarOption(){}

    public CarOption(String optionName, BigDecimal price){
        this.optionName = optionName;
        this.price = price;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }

    @Override
    public String toString() {
        return "CarOption{" +
                "optionName='" + optionName + '\'' +
                ", price=" + price +
                ", chosen=" + chosen +
                '}';
    }
}
