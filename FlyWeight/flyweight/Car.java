package flyweight;

import java.awt.Color;

public class Car {

    // Extrinsic state (immutable but can change between instances of Car)
    public final Color color;
    // Intrinsic state (immutable, ends up being the same for every Car)
    public final int numDoors = 4;
    public final boolean hasEngine = true;
    
    public Car(Color color) {
        this.color = color;
    }

    public void printState() {
        System.out.println("Car  color="+color+" numDoors="+numDoors+" hasEngine="+hasEngine);
    }
}
