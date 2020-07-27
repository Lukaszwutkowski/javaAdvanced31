package pl.sda.advanced.oop2;

public class Student extends Person {

    public Student(String firstName, String lastName){
        super(firstName, lastName); // super() - wywolanie konstruktora z nadklasy

    }

    @Override
    public String introduceMyself(){
        return "Jestem studentem";
    }



}
