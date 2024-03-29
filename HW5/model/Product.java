package HomeWork.HW5.model;


public abstract class Product {
    private String name;
    private final float price;


    /**
     * Конструктор с двумя аргументами
     *
     * @param name  Наименование продукта
     * @param price Цена продукта
     */
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Получение наименования продукта
     *
     * @return наименование продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Задание наименования продукта
     *
     * @param name наименование продукта
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение цены продукта
     *
     * @return цена продукта
     */
    public float getPrice() {
        return price;
    }

    /**
     * Получение содержимого экземпляра объекта в читаемом виде
     *
     * @return наименование продукта и его стоимость;
     */

    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " руб. ";
    }
}