package sample;

// Дополнительные БЕСПЛАТНЫЕ добавки к шаурме
// Сырный соус
// Обычный соус
// Чесночный соус
// Соус чили
public class NoCostExtra extends Extra {
    public NoCostExtra(String label, double price, Order order) {
        super(label, price, order);
    }

    public double getPrice() {
        return order.getPrice();
    }
}
