package sample;

public class Drink implements Order {
    protected String label;
    protected double price;

    public Drink(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return  this.label;
    }

    public double getPrice() {
        return this.price;
    }
}
