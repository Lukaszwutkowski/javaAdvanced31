package SesjaSamodzielna1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exce5And6 {

    int[] tablica;
    int index = 0;

    @Override
    public String toString() {
        return Arrays.toString(tablica);
    }

    public Exce5And6(int tablicaSize) {
        this.tablica = new int[tablicaSize];
    }

    public void add(int element) {
        if (index < tablica.length) {
            tablica[index] = element;
            index++;
        } else {
            System.out.println("Tablica pelna!");
        }
    }

    public void sort() {
        Arrays.sort(tablica);
    }

    public void sum() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println("\nZadanie 5 SUMA wszystkich wartosci: " + suma);
    }

    public void average() {
        int suma = 0;
        int avg = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
            avg = suma / tablica.length;
        }
        System.out.println("\nZadanie 6 SREDNIA wszystkich wartosci: " + avg);
    }

    public void reverse() {
        int[] rev = new int[tablica.length];
        int n = tablica.length - 1;
        int j = n;
        for (int i = 0; i <= n; i++){
            rev[i] = tablica[j];
            j--;
        }
        System.out.println(Arrays.toString(rev));
    }

    public void reverse2(){
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, Arrays.stream(tablica).boxed().toArray(Integer[]::new));
        Collections.reverse(list);
        System.out.println(list);
    }

    /*
    public void isInside(){
        int liczba = 5;
        if (liczba == tablica[index]){
            System.out.println(true);
        } else System.out.println(false);
    }

     */
}
