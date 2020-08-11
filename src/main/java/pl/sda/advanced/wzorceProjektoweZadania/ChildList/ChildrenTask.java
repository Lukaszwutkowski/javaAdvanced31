package pl.sda.advanced.wzorceProjektoweZadania.ChildList;

import java.util.Scanner;

public class ChildrenTask {
    public static void main(String[] args) {
        String menu = "Menu:\n" +
                "1.dodaj dziecko do listy\n" +
                "2.wyswielt liste dzieci\n" +
                "3.posortuj liste dzieci\n" +
                "4.wyczysc z duplikatów liste dzieci\n" +
                "5.zmien wszystkie litery imion dzieci na duze\n" +
                "6.zmien wszystkie litery imion dzieci na male\n" +
                "7.wyswietl historie zdarzen (log)\n" +
                "8.wyjscie z programu";

        Scanner scanner = new Scanner(System.in);
        IChildrenList iChildrenList = new ChildrenListImpl();
        System.out.println("Witaj w programie");

        SingletonCache.getInstance().getLog();


        while(true){
            System.out.println();
            System.out.println(menu);
            int number;
            try {
                number = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dokonaj wyboru wprowadzajac cyfre");
                continue;
            }
            switch(number){
                case 1:
                    System.out.println("Podaj dziecko");
                    String name = scanner.nextLine();
                    System.out.println("Dodaje dziecko " + name);
                    iChildrenList.addChild(name);
                    SingletonCache.getInstance().log("Dodano dziecko: ");
                    break;
                case 2:
                    System.out.println(iChildrenList.getChildren());
                    SingletonCache.getInstance().log("Wyswietlono liste: ");
                    break;
                case 3:
                    System.out.println("Sortuje liste dzieci");
                    iChildrenList.sortChildren();
                    SingletonCache.getInstance().log("Posortowano liste: ");
                    break;
                case 4:
                    System.out.println("Usuwam duplikat");
                    iChildrenList.removeDuplicate();
                    SingletonCache.getInstance().log("Usunieto duplikaty: ");
                    break;
                case 5:
                    System.out.println("Imiona duza litera");
                    iChildrenList.setNamesToUpperCase();
                    SingletonCache.getInstance().log("Dokonano zmiany na duze litery: ");
                    break;
                case 6:
                    System.out.println("Imiona mala litera");
                    iChildrenList.setNamesToLowerCase();
                    SingletonCache.getInstance().log("Dokonano zmiany na male litery: ");
                    break;
                case 7:
                    System.out.println(SingletonCache.getInstance().getLog());
                case 8:
                    System.out.println("Exit");
                    System.exit(-1);
                default:
                    System.out.println("Wprowadzono niepoprawna wartosc");
            }

        }
    }
}
