package legacy.system;

public class Heater {

    private static boolean heatOn = false;

    public static boolean heatOn() {
        return heatOn;
    }

    public static void turnOn() {
        System.out.println("Heat on");
        heatOn = true;
    }

    public static void turnOff() {
        System.out.println("Heat off");
        heatOn = false;
    }

    public static void heatHouse(int degrees) {
        System.out.println("Heating house to "+degrees+" degrees");
    }
}
