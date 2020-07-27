package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class Student extends Person implements AgeHolder
{

    private BigDecimal moneyFromMum;

    public Student(String firstName, String lastName, BigDecimal moneyFromMum){
        super(firstName, lastName); // super() - wywolanie konstruktora z nadklasy
        this.moneyFromMum = moneyFromMum;
    }

    public int getAge(){
        return 18;
    }

    public BigDecimal getMoneyFromMum() {
        return moneyFromMum;
    }

    @Override
    public BigDecimal getIncome(){
        return moneyFromMum;
    }

    @Override
    public String introduceMyself(){
        return "Jestem studentem";
    }



}
