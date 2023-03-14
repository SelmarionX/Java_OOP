package HomeWork.HW3;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        return c1.getName().compareTo(c2.getName());
    }
}