package pl.sda.advanced.customers;

import java.math.BigDecimal;

public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer monthSalary;  // wyjatkowo uzywamy Integer - powinno byc BigDecimal

    private static Integer counter = 0;

    public Customer(String firstName, String lastName, Integer age, int monthSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.monthSalary = monthSalary;
        this.id = counter++;
    }

    public Customer(String firstName, String lastName, Integer age, String monthSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.monthSalary = parseSalary(monthSalary);
        this.id = counter++;
    }

    private Integer parseSalary(String monthSalary) {
        return monthSalary == null ? 0 : Integer.parseInt(monthSalary.trim());
        // Ternary operator jest skrotem
        /*

        if (monthSalary == null){
            return 0;
        } else {
            return Integer.parseInt(monthSalary.trim());
        }

         */
    }

    public String prepareFullName(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMonthSalary() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", monthSalary=" + monthSalary +
                '}';
    }
}








