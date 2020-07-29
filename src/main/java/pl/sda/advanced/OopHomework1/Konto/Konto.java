package pl.sda.advanced.OopHomework1.Konto;

import java.math.BigDecimal;

public class Konto {

    private BigDecimal saldo;
    private String owner;
    private long accountNumber;
    private String adress;

    public String getAdress() {
        return adress;
    }

    public Konto(BigDecimal saldo, String owner, long accountNumber, String adress) {
        this.saldo = saldo;
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.adress = adress;
    }

    public Konto(String adress) {
        this.adress = adress;
    }

    public BigDecimal saldo(){
        return saldo;
    }


    public void withdraw(BigDecimal bigDecimal){
        if (saldo.compareTo(bigDecimal) <= 0){
            System.out.println("Brak srodkow na koncie");
        }
        if (saldo.compareTo(bigDecimal) > 0){
            BigDecimal divide = saldo.subtract(bigDecimal);
            System.out.println(divide);
        }
    }

    public BigDecimal inn(BigDecimal bigDecimal){
        BigDecimal sum = bigDecimal.add(saldo);
        return sum;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String getOwner() {
        return owner;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "saldo=" + saldo +
                ", owner='" + owner + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
