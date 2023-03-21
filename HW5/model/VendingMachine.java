package HomeWork.HW5.model;


import java.util.List;

public interface VendingMachine<T> {
    /**
     * Внесение продуктов в торговый автомат
     */
    void initProduct(List<T> list);

    /**
     * Получение продукта из торгового автомата
     *
     * @return строку
     */
    String getProduct(String name);
}