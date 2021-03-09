package command;

import command.toggleable.*;

public class RemoteControl {

    private IToggleable button1;
    private IToggleable button2;
    private IToggleable button3;
    private IToggleable button4;

    public RemoteControl(
        IToggleable button1,
        IToggleable button2,
        IToggleable button3,
        IToggleable button4
    ) {
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
    }

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
        button4.toggle();
    }
}
