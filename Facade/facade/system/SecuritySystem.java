package facade.system;

public class SecuritySystem {

    private static boolean systemIsOn = false;

    public static void arm() {
        System.out.println("Security system armed");
        systemIsOn = true;
    }

    public static void disarm() {
        System.out.println("Security system disarmed");
        systemIsOn = false;
    }

    public static void onDoorOpened() {
        if (systemIsOn)
            System.out.println("INTRUDER ALERT!!!!!");
    }
}