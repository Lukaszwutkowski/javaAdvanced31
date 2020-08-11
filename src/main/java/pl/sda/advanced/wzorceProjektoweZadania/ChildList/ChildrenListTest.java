package pl.sda.advanced.wzorceProjektoweZadania.ChildList;

public class ChildrenListTest {
    public static void main(String[] args) {

        IChildrenList childrenList = new ChildrenListImpl();
        childrenList.addChild("Jan");
        childrenList.addChild("Tomek");
        childrenList.addChild("Ania");
        childrenList.addChild("Asia");
        System.out.println(childrenList.getChildren());


    }
}
