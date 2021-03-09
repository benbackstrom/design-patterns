package command.toggleable;

public class SamsungTV implements IToggleable {
    
    private boolean isOn;

    public void toggle() {
        isOn = !isOn;
        String label = isOn ? "on" : "off";
        System.out.println("Samsung TV is "+label);
    }

    public boolean isOn() {
        return isOn;
    }
}
