package pl.sda.advanced.oop2;

public class Dog implements AgeHolder {

    private int age;
    public int getAge(){
        return age;
    }

    public Dog(int age) {
        this.age = age;
    }
}
