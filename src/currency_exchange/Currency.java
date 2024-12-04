package currency_exchange;

public enum Currency {
    // rate per 1 USD
    USD(1), EUR(1.05), JPY(149.9), CNY(7.28);
    // AUD(1.55), CAD(1.41)
    private double currentRate;

    Currency(double currentRate) {
        this.currentRate = currentRate;
    }

    public double getCurrentRate() {
        return currentRate;
    }
}
