package pl.sda.advanced.customers;

import java.util.List;
import java.util.Map;

public class MainApp extends CustomersStatistics {
    public static void main(String[] args) {
        for (Customer person : people) {
            System.out.println(person);
        }

        Map<Integer, List<Customer>> salaryMap = collectCustomersUsingSalary();
        System.out.println();
        System.out.println(salaryMap);
        System.out.println();

        System.out.println("Collect Customers Using Salary With Stream: ".toUpperCase() + collectCustomersUsingSalaryWithStream());
        System.out.println();
        System.out.println("Show Number of Customers With Same Salary: ".toUpperCase() + showNumberOfCustomersWithSameSalary());
        System.out.println();
        System.out.println("Show Average Salary: ".toUpperCase() + showAverageSalary());
        System.out.println();
        System.out.println("Sorting After Name: ".toUpperCase() + sortAfterName());
    }
}
