package progAdvanced.employee;

import java.math.BigDecimal;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", BigDecimal.valueOf(3000));
        System.out.println(employee);

        BigDecimal nettoYearPayment = PaymentCalculator.nettoYearPayment(employee);
        BigDecimal bruttoYearPayment = PaymentCalculator.bruttoYearPayment(employee);

        System.out.println("Roczna wyplata netto: " + nettoYearPayment);
        System.out.println("Roczna wyplata brutto: " + bruttoYearPayment);
    }
}
