package flyweight;

import java.awt.Color;

public class Controller {
 
    public static void main(String[] args) {
        CarFactory.getOrCreate(Color.RED).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.GREEN).printState();
        CarFactory.getOrCreate(Color.GREEN).printState();
        CarFactory.getOrCreate(Color.RED).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.RED).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.GREEN).printState();
        CarFactory.getOrCreate(Color.GREEN).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.RED).printState();
        CarFactory.getOrCreate(Color.RED).printState();
        CarFactory.getOrCreate(Color.RED).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.GREEN).printState();
        CarFactory.getOrCreate(Color.GREEN).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.BLUE).printState();
        CarFactory.getOrCreate(Color.BLACK).printState();

        // We only had to create one Car object per individual color!
        // That's a big memory and performance savings.
    }
}
