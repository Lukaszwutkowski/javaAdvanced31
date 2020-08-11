package pl.sda.advanced.threads;

public class OutRunnable implements Runnable{  // Praca do wykonania


    @Override
    public void run() {     // Szczegoly pracy i jej rozpoczecie

        System.out.println(Thread.currentThread().getName() + " klasa OurRunnable");

    }
}
