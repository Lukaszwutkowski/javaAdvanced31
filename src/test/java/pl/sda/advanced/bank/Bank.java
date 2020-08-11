package pl.sda.advanced.bank;

public class Bank {   // Operacje wykonywane na banku beda wspolbiezne, bo wspoldziela balance

    private static Integer balance = 1000;     // Pieniadze wyrazamy Integerem tylko dla celow zadania
    private static Integer counter = 0;

    public static synchronized void withdraw(Integer amount){
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName() + " Bilans konta po wyplacie: " + balance);

    }

    public static synchronized void deposit(Integer amount){
        balance = balance + amount;
        System.out.println(Thread.currentThread().getName() + " Bilans konta po wplacie: " + balance);
        counter++;
    }

    public static void printBalance(){
        System.out.println("Bilans po wszystkich operacjach: " + balance);
        System.out.println("Liczba operacji: " + counter);
    }

}
