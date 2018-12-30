package homework6.domain;

public class FridgerF extends Appliances<String> implements Price, EnergyClass{

    private double price;
    private int volume;
    private FridgeVolume fridgeVolume;
    private FreezerVolume freezerVolume;

    public FridgerF(String energyClass, double price, int volume, FridgeVolume fridgeVolume, FreezerVolume freezerVolume) {
        super(energyClass);
        this.price = price;
        this.volume = volume;
        this.fridgeVolume = fridgeVolume;
        this.freezerVolume = freezerVolume;
    }

    @Override
    public String toString() {
        return "FridgerF{" +
                "price=" + price +
                ", volume=" + volume +
                ", fridgeVolume=" + fridgeVolume +
                ", freezerVolume=" + freezerVolume +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public FridgeVolume getFridgeVolume() {
        return fridgeVolume;
    }

    public void setFridgeVolume(FridgeVolume fridgeVolume) {
        this.fridgeVolume = fridgeVolume;
    }

    public FreezerVolume getFreezerVolume() {
        return freezerVolume;
    }

    public void setFreezerVolume(FreezerVolume freezerVolume) {
        this.freezerVolume = freezerVolume;
    }

    @Override
    public double FridgeEnergyClass() {
        return 0;
    }

    @Override
    public double setFridgePrice() {
        return 0;
    }
}