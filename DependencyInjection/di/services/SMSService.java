package di.services;

public class SMSService implements IService {
    
    public void sendSMSMessage() {
        System.out.println("Sending a text message from my phone!");
    }

    public void sendMessage() {
        sendSMSMessage();
    }
}
