package HomeWork.HW1;


public class HotDrink extends Drink {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public int setTemperature() {
        return this.temperature;
    }

    public HotDrink(String name, int price, int volume, int temperature) {
        setName(name);
        setPrice(price);
        setVolume(volume);
        this.temperature = temperature;
    }

    void sayTemperature(){
        System.out.println(getName() + " - Температура равна " + getTemperature() + " °C");
    }
}
