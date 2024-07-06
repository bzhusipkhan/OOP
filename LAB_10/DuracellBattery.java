// DuracellBattery.java
public class DuracellBattery extends Battery {
    // Instance variables
    private double voltage;   // Voltage in volts
    private double currency;  // Currency in amperes
    private double energy;    // Total energy in joules
    private double internalVoltage; // Internal voltage of battery in volts (ɛ)

    // Constructor
    public DuracellBattery(double voltage, double currency, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
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
