package sample;

// Дополнительные добавки к шаурме
public abstract class Extra implements Order {
    protected Order order;
    protected double price;
    protected String label;

    public Extra(String label, double price, Order order) {
        this.label = label;
        this.price = price;
        this.order = order;
    }

    public abstract double getPrice();

    public String getLabel() {
        return order.getLabel() + " + " + this.label;
    }
}
