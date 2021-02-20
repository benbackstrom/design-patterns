package di.services;

public class EmailService implements IService {
    
    public void sendEmailMessage() {
        System.out.println("Sending an email!");
    }

    public void sendMessage() {
        sendEmailMessage();
    }
}
