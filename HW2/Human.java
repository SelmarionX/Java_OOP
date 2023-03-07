package HomeWork.HW2;

public class Human extends Buyer {


    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderClass = true;

    }

    @Override
    public void setTakeOrder() {
        isMakeOrderClass = true;

    }

    @Override
    public boolean isMakeOrder() {

        return isMakeOrderClass;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderClass;
    }
}
