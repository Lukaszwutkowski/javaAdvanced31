package pl.sda.advanced.wzorceProjektoweZadania.iterator.nameList;

import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        INameList nameList = new NameListImpl();

        int index = 0;
        System.out.println("Podaj piec imion");

        while (index < 5) {
            System.out.println("Podaj imie: ");
            String name = scanner.nextLine();
            nameList.add(name);
            index++;
        }

        System.out.println(nameList.getNames());
        System.out.println();
        System.out.println("Ktore imie skasowac?: ");
        String actualName = scanner.nextLine();
        nameList.deleteName(actualName);
        System.out.println(nameList.getNames());


    }
}
