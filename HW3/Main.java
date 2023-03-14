package HomeWork.HW3;
import java.util.Arrays;


// Добавить Comparable и/или Comparator к приложению, написанному на семинаре(Файлы прикреплены под уроком)

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(new Cat("barsik"),
                new Cat("murzik"),
                new Cat("kesha"),
                new Cat("boris")));

        System.out.println("Использование итератора:");
        for (Cat value : cats) {
            System.out.println(value);
        }

        System.out.println("Сортировка через компаратор:");
        cats.getCatList().sort(new NameComparator());
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}