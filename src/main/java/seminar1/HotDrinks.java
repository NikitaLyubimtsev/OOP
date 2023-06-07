package seminar1;

public class HotDrinks extends Product{

    private Double temperature;
    private Integer volume;
    private boolean milk;

    public HotDrinks(Long id, String name, double price, double temperature, int volume, boolean milk) {
        super(id, name, price);
        this.temperature = temperature;
        this.volume = volume;
        this.milk = milk;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return String.format("Выдан %s по цене: %s руб. за %s мл." + ((isMilk()) ? " и добавлением молока." : "") + " Температура напитка: %s!", getName(), getPrice(), getVolume(), getTemperature());
    }
}
