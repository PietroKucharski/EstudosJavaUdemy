package util;

public class CurrencyConverter {
    public static double IOF = 6.0;

    public static double calcConversor(double dollar, double quantity) {
        double value = dollar * quantity;
        return value += value * IOF / 100.00;
    }
}
