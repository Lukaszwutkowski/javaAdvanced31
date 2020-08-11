package pl.sda.advanced.wzorceProjektoweZadania;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Jan");
        System.out.println(lista);

        ListHelper.addSomething(lista);
        System.out.println(lista);

        ListHelper.clearList(lista);
        System.out.println(lista);
    }
}
