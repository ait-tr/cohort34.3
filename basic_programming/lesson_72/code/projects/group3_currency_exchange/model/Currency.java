package projects.group3_currency_exchange.model;

public class Currency {
    private String code;
    private double rate;
    private double sellRate;

    // Конструктор
    public Currency(String code, double rate, double sellRate) {
        this.code = code;
        this.rate = rate;
        this.sellRate = sellRate;
    }

    public String getCode() {
        return code;
    }

    public double getRate() {
        return rate;
    }

    public double getSellRate() {
        return sellRate;
    }

}
