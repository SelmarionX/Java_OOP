package HomeWork.HW4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineAllProducts<BottleOfWater> vmBottle = new VendingMachineAllProducts<>();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(90), 1.5),
                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(75), 1.75),
                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(120), 2.0),
                new BottleOfWater("Water", new BigDecimal(50), 1.0)));
        vmBottle.initProduct(bottleList);
        System.out.println("--------- ХОЛОДНЫЕ НАПИТКИ ---------");
        System.out.println(vmBottle.getProduct("Water"));

        System.out.println("\n--------- ГОРЯЧИЕ НАПИТКИ ---------");
        VendingMachineAllProducts vmHotDrinks = new VendingMachineAllProducts<>();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Espresso", new BigDecimal(80), 30.0, 90),
                new HotDrinks("Cappuccino", new BigDecimal(160), 180.0, 70),
                new HotDrinks("Raff", new BigDecimal(160), 160.0, 65)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Raff"));
        System.out.println("Поиск по цене <= 80 руб. : " + vmHotDrinks.getProduct(new BigDecimal(80)));
        System.out.println("Поиск по температуре <= 70 °C: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}