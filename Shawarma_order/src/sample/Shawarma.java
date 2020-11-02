package sample;

// Общий класс шаурма дял интерфейса
// Классическая шаурма - 150
// Домашняя шаурма - 165
// Вегетарианская шаурма - 130
// Шаурма "Экстра" - 200
public class Shawarma implements Order {
    protected String label;
    protected double price;

    public Shawarma(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return this.label;
    }

    public double getPrice() {
        return this.price;
    }
}
