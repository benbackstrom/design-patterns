package legacy;

import legacy.system.*;

public class Controller {
    
    public static void main(String[] args) {
        // Leaving house...
        Electrical.turnOn();

        if (Electrical.electricityOn()) {
            SecuritySystem.arm();
            Plumbing.flushPipes();
            Heater.turnOff();
        }

        // Returning to house...
        Electrical.turnOn();

        if (Electrical.electricityOn()) {
            SecuritySystem.disarm();
            Plumbing.turnWaterBackOn();
            Heater.turnOn();
            if (Heater.heatOn()) {
                Heater.heatHouse(70);
            }
        }

        // Whew... that was a lot of work.
        // It would be better to abstract this out.
    }
}
