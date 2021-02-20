package facade.system;

public class Electrical {

    private static boolean electricityOn = false;

    public static boolean electricityOn() {
        return electricityOn;
    }

    public static void turnOn() {
        System.out.println("Electricity on");
        electricityOn = true;
    }

    public static void turnOff() {
        System.out.println("Electricity off");
        electricityOn = false;
    }
}