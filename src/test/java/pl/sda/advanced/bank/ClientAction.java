package pl.sda.advanced.bank;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class ClientAction implements Runnable{

    // symulacja wplaty i wyplaty
    @Override
    public void run() {
      // double v = Math.random() * 100;

       int amount = new Random().nextInt(100);

       Bank.withdraw(amount);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bank.deposit(amount);

    }
}
