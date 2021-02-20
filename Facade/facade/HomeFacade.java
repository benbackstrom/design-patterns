package facade;

import facade.system.*;

/*
 * This class handles the complexity involved in leaving and returning home.
 * The client no longer has to interact with individual pieces of the home
 * system, but instead just interacts with this simple interface.
 */
public class HomeFacade {
    public static void leaveHome() {
        Electrical.turnOn();

        if (Electrical.electricityOn()) {
            SecuritySystem.arm();
            Plumbing.flushPipes();
            Heater.turnOff();
        }
    }

    public static void returnHome() {
        Electrical.turnOn();

        if (Electrical.electricityOn()) {
            SecuritySystem.disarm();
            Plumbing.turnWaterBackOn();
            Heater.turnOn();
            if (Heater.heatOn()) {
                Heater.heatHouse(70);
            }
        }
    }
}
