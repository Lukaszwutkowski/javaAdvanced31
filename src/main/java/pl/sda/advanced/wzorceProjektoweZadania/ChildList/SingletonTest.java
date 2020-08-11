package pl.sda.advanced.wzorceProjektoweZadania.ChildList;

public class SingletonTest {
    public static void main(String[] args) {

        SingletoneExample singleton = SingletoneExample.getInstance();
        System.out.println(singleton.getNumer());
        System.out.println(singleton.getNumer());
        System.out.println(singleton.getNumer());
    }
}
