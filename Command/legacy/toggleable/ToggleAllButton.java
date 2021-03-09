package legacy.toggleable;

public class ToggleAllButton {

    public void toggleAll(boolean on, SamsungTV tv, LGSoundSystem soundSystem, DVDPlayer player) {
        String label = on ? "on" : "off";
        System.out.println("Toggling everything "+label);

        if (tv.isOn() ^ on)
            tv.toggle();

        if (soundSystem.isOn() ^ on)
            soundSystem.toggle();

        if (player.isOn() ^ on)
            player.toggle();
    }
}