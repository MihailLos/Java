package sample;

public class Drinks extends Extra {

    public Drinks(String label, double price, Order order) {
        super(label, price, order);
    }

    public double getPrice() {
        return this.price + order.getPrice();
    }
}
