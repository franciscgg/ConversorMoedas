public class Moeda {
    private String base_code;
    private String target_code;
    private String conversion_rate;
    private String conversion_result;
    private double amount;

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public String getConversion_rate() {
        return conversion_rate;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void Converter(String base_code, String target_code, double valor) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.amount = valor;
    }
}
