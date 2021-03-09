package command.toggleable;

public class DVDPlayer implements IToggleable  {

    private boolean isOn;

    public void toggle() {
        isOn = !isOn;
        String label = isOn ? "on" : "off";
        System.out.println("DVDPlayer is "+label);
    }

    public boolean isOn() {
        return isOn;
    }
}
