package HomeWork.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink espresso = new HotDrink("Espresso", 80, 30, 90);
        HotDrink cappuccino = new HotDrink("Cappuccino", 160, 180, 70);
        HotDrink raff = new HotDrink("Raff", 160, 160, 65);


        List<HotDrink> drinks = new ArrayList<>(Arrays.asList(espresso, cappuccino, raff));


        System.out.println("В автомате доступны следующие ГОРЯЧИЕ НАПИТКИ: ");
        espresso.sayTemperature();
        cappuccino.sayTemperature();
        raff.sayTemperature();

        HotDrinksVendingMachine HotDrinks = new HotDrinksVendingMachine();
        HotDrinks.initProduct(drinks);
        System.out.println();
        System.out.println("Следующие напитки имеют температуру не выше 70 °C: ");

        HotDrinks.getProduct(75);
        HotDrinks.getProduct("espresso");

    }

}
