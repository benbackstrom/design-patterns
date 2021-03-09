package command;

import command.toggleable.*;
import java.util.*;

public class Controller {

    public static void main(String[] args) {
        List<IToggleable> buttons = new ArrayList<>(3);

        IToggleable tv = new SamsungTV();
        IToggleable soundSystem = new LGSoundSystem();
        IToggleable player = new DVDPlayer();

        buttons.add(tv);
        buttons.add(soundSystem);
        buttons.add(player);
        IToggleable toggleAll = new ToggleAllButton(buttons);

        RemoteControl remote = new RemoteControl(tv, soundSystem, player, toggleAll);

        remote.pressButton1();
        remote.pressButton2();
        remote.pressButton2();
        remote.pressButton3();
        remote.pressButton4();
        remote.pressButton4();
    }
}