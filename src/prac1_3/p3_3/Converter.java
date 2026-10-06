package prac1_3.p3_3;

public class Converter {

    public String baseCur = "RUB";

    public double[] curs = new double[3];

    public Converter() {
        curs[0] = 95.0;
        curs[1] = 100.0;
        curs[2] = 13.2;
    }

    public int getCurrencyIndex(String currencyCode) {
        String code = currencyCode.toUpperCase();
        if (code.equals("USD")) {
            return 0;
        }
        if (code.equals("EUR")) {
            return 1;
        }
        if (code.equals("CNY")) {
            return 2;
        }
        return -1;
    }

    public void setRate(String currencyCode, double rateToRub) {
        if (currencyCode.equalsIgnoreCase(baseCur)) {
            System.out.println("курс базовой валюты RUB менять нельзя.");
            return;
        }

        int index = getCurrencyIndex(currencyCode);
        if (index == -1) {
            System.out.println("неизвестная валюта: " + currencyCode);
        } else {
            curs[index] = rateToRub;
        }
    }

    public double getRate(String currencyCode) {
        if (currencyCode.equalsIgnoreCase(baseCur)) {
            return 1.0;
        }

        int index = getCurrencyIndex(currencyCode);
        if (index == -1) {
            System.out.println("неизвестная валюта: " + currencyCode);
            return 0.0;
        }
        return curs[index];
    }

    public boolean isSupported(String currencyCode) {
        if (currencyCode.equalsIgnoreCase(baseCur)) {
            return true;
        }
        int index = getCurrencyIndex(currencyCode);
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = getRate(fromCurrency);
        double toRate = getRate(toCurrency);
        if (fromRate == 0.0 || toRate == 0.0) {
            return 0.0;
        }
        double amountInRub = amount * fromRate;
        double res = amountInRub / toRate;

        return res;
    }
}
