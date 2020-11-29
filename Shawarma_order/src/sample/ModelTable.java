package sample;

public class ModelTable {
    Integer id;
    String order_label;
    Double order_price;

    public ModelTable(Integer id, String order_label, Double order_price) {
        this.id = id;
        this.order_label = order_label;
        this.order_price = order_price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_label() {
        return order_label;
    }

    public void setOrder_label(String order_label) {
        this.order_label = order_label;
    }

    public Double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }
}
