package legacy.toggleable;

public class LGSoundSystem {

    private boolean isOn;

    public void toggle() {
        isOn = !isOn;
        String label = isOn ? "on" : "off";
        System.out.println("LG Sound System is "+label);
    }

    public boolean isOn() {
        return isOn;
    }
}
