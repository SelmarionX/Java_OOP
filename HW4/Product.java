package HomeWork.HW4;

import java.math.BigDecimal;

public abstract class Product {
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " руб. ";
    }
}