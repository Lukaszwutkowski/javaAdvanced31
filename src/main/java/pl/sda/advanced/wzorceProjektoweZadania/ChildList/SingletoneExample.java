package pl.sda.advanced.wzorceProjektoweZadania.ChildList;

public class SingletoneExample {

    private static SingletoneExample instance;

     private Integer numerOperacji = 1;

    private SingletoneExample() {

    }

    public static synchronized SingletoneExample getInstance(){
        if (instance == null){
            instance = new SingletoneExample();
        }
        return instance;
    }

    public synchronized Integer getNumer() {
        return numerOperacji++;
    }
}
