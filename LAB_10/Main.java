// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating Toshiba batteries
        Battery[] toshibaBatteries = new Battery[5];
        for (int i = 0; i < 5; i++) {
            toshibaBatteries[i] = new ToshibaBattery(1.5, 1.2, 10000); // Example parameters
        }

        // Creating Duracell batteries
        Battery[] duracellBatteries = new Battery[5];
        for (int i = 0; i < 5; i++) {
            duracellBatteries[i] = new DuracellBattery(1.8, 1.0, 12000, 1.0); // Example parameters
        }

        // Creating FlashLights
        FlashLight[] flashLights = new FlashLight[5];
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                flashLights[i] = new FlashLight(toshibaBatteries); // Using Toshiba batteries
            } else {
                flashLights[i] = new FlashLight(duracellBatteries); // Using Duracell batteries
            }
        }

        // Printing lifetimes of all flashlights
        for (int i = 0; i < 5; i++) {
            System.out.println("Lifetime of FlashLight " + (i + 1) + ": " + flashLights[i].getTotalLifeTime() + " seconds");
        }

        // Finding flashlight with maximum lifetime value
        FlashLight maxLifetimeFlashLight = flashLights[0];
        for (int i = 1; i < 5; i++) {
            if (flashLights[i].getTotalLifeTime() > maxLifetimeFlashLight.getTotalLifeTime()) {
                maxLifetimeFlashLight = flashLights[i];
            }
        }

        // Printing data of flashlight with maximum lifetime value

        System.out.println("FlashLight with Maximum Lifetime:: " + maxLifetimeFlashLight.getTotalLifeTime() + " seconds");
    }
}
