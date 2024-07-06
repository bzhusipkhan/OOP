// ToshibaBattery.java
public class ToshibaBattery extends Battery {
    // Instance variables
    private double voltage;   // Voltage in volts
    private double currency;  // Currency in amperes
    private double energy;    // Total energy in joules
    private double extraEnergy; // Extra energy in joules (not used in calculations here)

    // Constructor
    public ToshibaBattery(double voltage, double currency, double energy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
    }

    // Implementing abstract methods
    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        return energy / (voltage * currency);
    }
}
