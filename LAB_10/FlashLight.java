// FlashLight.java
public class FlashLight {
    // Instance variables
    private Battery[] batteries;

    // Constructors
    public FlashLight() {
        this.batteries = new Battery[0]; // Default constructor initializes with empty array
    }

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    // Getters and Setters
    public Battery[] getBatteries() {
        return batteries;
    }

    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }

    // Methods to calculate total power, energy and lifetime
    public double getTotalPower() {
        double totalPower = 0.0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0.0;
        for (Battery battery : batteries) {
            totalEnergy += battery.getLifeTime(); // Assuming getLifeTime returns energy
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        if (getTotalPower() == 0.0) {
            return 0.0; // To avoid division by zero
        }
        return getTotalEnergy() / getTotalPower();
    }
}
