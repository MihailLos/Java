package sample;

// Платные добавки:
// Охотничье колбаски - 50
// Ананас - 35
// Сыр - 15
// Особый мясной соус - 25
// Картофель фри - 20
public class CostExtra extends Extra {
    public CostExtra(String label, double price, Order order) {
        super(label, price, order);
    }

    public double getPrice() {
        return this.price + order.getPrice();
    }
}
