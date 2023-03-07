package HomeWork.HW1;


import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinksList = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotDrink> list) {
        this.hotDrinksList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(int temp) {
        for (HotDrink el : hotDrinksList) {
            if (el.getTemperature() <= temp) {
                System.out.println(el.getName());
            }
        }
        return null;
    }

    public String getProduct(String name1) {
        for (HotDrink el : hotDrinksList) {
            if (el.getName().equals(name1)) {
                System.out.println(el.getName());
            }
        }
        return null;
    }
}