package legacy;

import legacy.toggleable.*;

public class RemoteControl {

    private boolean isOn;

    private SamsungTV button1 = new SamsungTV();
    private LGSoundSystem button2 = new LGSoundSystem();
    private DVDPlayer button3 = new DVDPlayer();
    private ToggleAllButton button4 = new ToggleAllButton();

    public void pressButton1() {
        button1.toggle();
    }

    public void pressButton2() {
        button2.toggle();
    }

    public void pressButton3() {
        button3.toggle();
    }

    public void pressButton4() {
        isOn = !isOn;
        button4.toggleAll(isOn, button1, button2, button3);
    }
}
