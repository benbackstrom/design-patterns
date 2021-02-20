package legacy;

import java.awt.Color;

public class Car {

    // Extrinsic state (immutable but can change between instances of Car)
    public final Color color;
    // Intrinsic state (immutable, ends up being the same for every Car)
    public final int numDoors;
    public final boolean hasEngine;
    
    public Car(Color color, int numDoors, boolean hasEngine) {
        this.color = color;
        this.numDoors = numDoors;
        this.hasEngine = hasEngine;
    }

    public void printState() {
        System.out.println("Car  color="+color+" numDoors="+numDoors+" hasEngine="+hasEngine);
    }
}
