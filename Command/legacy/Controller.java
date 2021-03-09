package legacy;

public class Controller {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        remote.pressButton1();
        remote.pressButton2();
        remote.pressButton2();
        remote.pressButton3();
        remote.pressButton4();
        remote.pressButton4();
    }
}