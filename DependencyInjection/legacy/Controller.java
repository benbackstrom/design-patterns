package legacy;

import legacy.clients.EmailClient;
import legacy.clients.FacebookClient;
import legacy.clients.SMSClient;
import legacy.clients.ZoomClient;
import legacy.services.EmailService;
import legacy.services.FacebookService;
import legacy.services.SMSService;
import legacy.services.ZoomService;

public class Controller {
    
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient(new EmailService());
        emailClient.send();

        FacebookClient facebookClient = new FacebookClient(new FacebookService());
        facebookClient.send();

        SMSClient smsClient = new SMSClient(new SMSService());
        smsClient.send();

        ZoomClient zoomClient = new ZoomClient(new ZoomService());
        zoomClient.send();
    }
}
