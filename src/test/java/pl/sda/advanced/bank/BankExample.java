package pl.sda.advanced.bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BankExample {

    @Test
    void sequential(){
        for (int i = 0; i < 100; i++) {
            ClientAction clientAction = new ClientAction();

            clientAction.run();
        }
    }

    @Test
    void threads() {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ClientAction clientAction = new ClientAction();
            Thread t = new Thread(clientAction);  // Tworzenie kasjerow w banku razem z czynnoscia wyplaty i wplaty
            threadList.add(t);
        }

        for (Thread thread : threadList) {  // pracownicy rozpoczynaja prace
            thread.start();
        }
        for (Thread thread : threadList) {  // sprawdzam kazdego po kolei czy skonczyl prace
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Bank.printBalance();
    }
}
