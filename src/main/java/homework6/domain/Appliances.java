package homework6.domain;

public abstract class Appliances<F> {
    private F EnergyClass;

    public Appliances() {
    }

    public Appliances(F energyClass) {
        EnergyClass = energyClass;
    }

    public F getEnergyClass() {
        return EnergyClass;
    }

    public void setEnergyClass(F energyClass) {
        EnergyClass = energyClass;
    }
}
