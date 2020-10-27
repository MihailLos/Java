package sample;

public class Shawarma {
    private int type;
    private int size;
    private double price;

    public Shawarma() {

    }

    public Shawarma(int type, int size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
