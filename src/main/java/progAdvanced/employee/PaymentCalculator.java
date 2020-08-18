package progAdvanced.employee;

import java.math.BigDecimal;

public class PaymentCalculator {

    private final static double MONTHLY_ZUS = 1000;

    public static BigDecimal nettoYearPayment(Employee employee){
        BigDecimal netto = employee.getSalary().multiply(BigDecimal.valueOf(12));
        return netto;
    }

    public static BigDecimal bruttoYearPayment(Employee employee){
        BigDecimal netto = employee.getSalary().multiply(BigDecimal.valueOf(12));
        BigDecimal brutto = netto.multiply(BigDecimal.valueOf(0.2));
        BigDecimal result1 = netto.add(brutto);
        BigDecimal result = result1.add((BigDecimal.valueOf(MONTHLY_ZUS).multiply(BigDecimal.valueOf(12))));
        return result;
    }
}
