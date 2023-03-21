package HomeWork.HW5.model;


import java.util.ArrayList;
import java.util.List;

/**
 * Работа торгового автомата, загрузка, поиск
 *
 * @param <T> все классы потомки класса Product
 */
public class VendingMachineAllProducts<T extends Product> implements VendingMachine {
    private List<T> product;
    private final List<T> resultFind = new ArrayList<>();

    /**
     * Переопределенный иметод интефейса VendingMachine
     * @param list продуктов
     */
    @Override
    public void initProduct(List list) {
        this.product = list;
    }

    /**
     * Поиск продукта по имени
     *
     * @param name наименование продукта
     * @return найденный результат или "Не найдено"
     */
    public String getProduct(String name) {
        for (T el : product) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено!";
    }

    /**
     * Поиск продуктов по цене меньше или равной заданной
     *
     * @param price максимально допустимая цена
     * @return продукты равные или дешевле заданной стоимости или "Не найдено!"
     */
    public String getProduct(float price) {
        resultFind.clear();
        for (T el : product) {
            if (el.getPrice() <= price) resultFind.add(el);
        }
        return resultFind.isEmpty() ? "Не найдено!" : resultFind.toString();
    }

    /**
     * Поиск продуктов по температуре меньше или равной заданной с проверкой отношения к классу HotDrinks
     *
     * @param temp максимально допустимая температура
     * @return продукты равные или дешевле заданной температуры или "Не найдено!"
     */
    public String getProduct(int temp) {
        resultFind.clear();
        for (T el : product) {
            if (el instanceof HotDrinks && ((HotDrinks) el).getTemp() <= temp) resultFind.add(el);
        }

        return resultFind.isEmpty() ? "Не найдено!" : resultFind.toString();
    }
}
