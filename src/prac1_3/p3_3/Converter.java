package prac1_3.p3_3;


public class Converter {
    public static final String BASE_CURRENCY = "RUB";
    private static final int USD = 0;
    private static final int EUR = 1;
    private static final int CNY = 2;
    private static final int CURRENCY_COUNT = 3;

    private double[] rates;

    public Converter() {
        rates = new double[CURRENCY_COUNT];
        rates[USD] = 95.50;
        rates[EUR] = 103.20;
        rates[CNY] = 13.10;
    }

    private int codeToIndex(String currencyCode) {
        switch (currencyCode.toUpperCase()) {
            case "USD":
                return USD;
            case "EUR":
                return EUR;
            case "CNY":
                return CNY;
            default:
                throw new IllegalArgumentException("Неизвестная валюта: " + currencyCode);
        }
    }

    public void setRate(String currencyCode, double rateToRub) {
        if (currencyCode.equalsIgnoreCase(BASE_CURRENCY)) {
            System.out.println("Курс базовой валюты RUB менять нельзя.");
            return;
        }
        int index = codeToIndex(currencyCode);
        rates[index] = rateToRub;
    }

    public double getRate(String currencyCode) {
        if (currencyCode.equalsIgnoreCase(BASE_CURRENCY)) {
            return 1.0;
        }
        int index = codeToIndex(currencyCode);
        return rates[index];
    }

    public boolean isSupported(String currencyCode) {
        if (currencyCode.equalsIgnoreCase(BASE_CURRENCY)) {
            return true;
        }
        try {
            codeToIndex(currencyCode);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = getRate(fromCurrency);
        double toRate = getRate(toCurrency);

        double amountInRub = amount * fromRate;
        return amountInRub / toRate;
    }
}
