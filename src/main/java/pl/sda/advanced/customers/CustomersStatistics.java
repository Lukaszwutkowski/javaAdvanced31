package pl.sda.advanced.customers;

import java.util.*;
import java.util.stream.Collectors;

public class CustomersStatistics {


    public static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250 "),
            new Customer("Adam", "Twardowski", 33, "4100 "),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333),
            new Customer("Adam", "Nowak ", 15, null)
    };

    // 1. Napisz metodę, która zamieni tablicę people na listę people
// - ta metoda może być potem wykorzystywana przez Was w następnych metodach
    public List<Customer> arrayToList() {

        return Arrays.asList(people);

      /*  return Arrays.stream(people)
                .collect(Collectors.toList());

       */

     /*   List<Customer> result = new ArrayList<>();
        for (Customer person : people) {
            result.add(person);

        } return result;

      */
    }

    // 2. Napisz metodę, która przyjmie tablicę people i zwróci listę Stringów <imię nazwisko>
    // (elementem listy będzie np "Anna Nowak")

    public List<String> customersToNamesList() {
        List<Customer> customers = arrayToList();
        return customers.stream()
                .map(Customer::prepareFullName)
                .collect(Collectors.toList());                      // na wejsciu do metody mamy Customera a chcemy miec Imie i nazwisko (String)
    }

    // 3. Napisz metodę, która zwróci mapę osób <id,osoba>
    public Map<Integer, Customer> customersToMap() {
        Map<Integer, Customer> resultMap = new HashMap<>();
        for (Customer person : people) {
            resultMap.put(person.getId(), person);
        }
        return resultMap;
    }

    // Sposob za pomoca streamow
    public Map<Integer, Customer> customersToMapWithStream() {
        return arrayToList().stream()
                .collect(Collectors.toMap(customer -> customer.getId(), c -> c));
    }

    // 4. Napisz metodę, która zwróci mapę osób według zarobków <zarobki,osoby_z_zarobkami>
    public static Map<Integer, List<Customer>> collectCustomersUsingSalary() {
        Map<Integer, List<Customer>> resultMap = new HashMap<>();
        for (Customer person : people) {
            Integer monthSalary = person.getMonthSalary();
            if (resultMap.containsKey(monthSalary)) {
                List<Customer> customers = resultMap.get(monthSalary);
                customers.add(person);
            } else {
                List<Customer> customersList = new ArrayList<>();
                customersList.add(person);
                resultMap.put(monthSalary, customersList);
            }
        }
        return resultMap;
    }

    public static Map<Integer, List<Customer>> collectCustomersUsingSalaryWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy(p -> p.getMonthSalary()));
    }

    // 5. Napisz metodę, która zwróci mapę ile jest osób z danymi zarobkami <zarobki, liczba_osób>
    public static Map<Integer, Long> showNumberOfCustomersWithSameSalary() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy(Customer::getMonthSalary, Collectors.counting()));
    }

    // 6. Napisz metodę, która zwróci mapę map <imię,<zarobki, liczba_osób_z_takimi_zarobkami>>
    
    
    
    // *** Dodatkowo poza zadaniem srednia zarobkow
    public static OptionalDouble showAverageSalary() {
        return Arrays.stream(people)
                .mapToInt(Customer::getMonthSalary)
                .average();
    }

    // *** Dodatkowo sortowanie po imieniu
    public static List<Customer> sortAfterName() {
        return Arrays.stream(people)
                .sorted(Comparator.comparing(Customer::getFirstName))
                .collect(Collectors.toList());
    }
}


