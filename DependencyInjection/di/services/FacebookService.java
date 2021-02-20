package di.services;

public class FacebookService implements IService {

    public void sendFacebookMessage() {
        System.out.println("Sending a Facebook message!");
    }

    public void sendMessage() {
        sendFacebookMessage();
    }
}
