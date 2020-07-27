package pl.sda.advanced.oop2;

public class Worker extends Person {

    public Worker(String firstName, String lastName){
        super(firstName, lastName); // super() - wywolanie konstruktora z nadklasy

    }

    @Override
    public String introduceMyself(){
        return "Jestem pracownikiem";
    }


}
