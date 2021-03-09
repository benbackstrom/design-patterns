package command.toggleable;

import java.util.*;

public class ToggleAllButton implements IToggleable  {

    private boolean isOn;
    private List<IToggleable> buttons;

    public ToggleAllButton(List<IToggleable> buttons) {
        this.buttons = buttons;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        isOn = !isOn;
        String label = isOn ? "on" : "off";
        System.out.println("Toggling everything "+label);

        for (IToggleable button : buttons) {
            if (button.isOn() ^ isOn)
                button.toggle();
        }
    }
}