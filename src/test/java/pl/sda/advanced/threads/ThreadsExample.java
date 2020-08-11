package pl.sda.advanced.threads;

import org.junit.jupiter.api.Test;

public class ThreadsExample {

    @Test
    void runnableBasics(){

        // Pierwszy sposob
        Runnable outRunnable = new OutRunnable();
       // outRunnable.run();   to uruchomi sie w watku main

        // Drugi sposob
        Runnable runnable = new Runnable() { // klasa anonimowa
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " klasa anonimowa");

            }
        };
        // Trzeci sposob
        Runnable lambdaRunnable = () ->  System.out.println(Thread.currentThread().getName() + " lambda");

        // Te prace uruchomia sie w aktualnym watku - watek main
        outRunnable.run();
        runnable.run();
        lambdaRunnable.run();

        // Powolujemy 3 nowych pracownikow - watki i przekazujemy im prace do wykonania
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(outRunnable);
        Thread t3 = new Thread(lambdaRunnable);

       // t1.run(); - wykonanie na watku metody run spowoduje wykonanie pracy w AKTUALNYM watku

        t1.start();
        t2.start();
        t3.start();


    }
}
