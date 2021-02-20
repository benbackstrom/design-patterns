package di;

import di.injectors.EmailInjector;
import di.injectors.FacebookInjector;
import di.injectors.SMSInjector;
import di.injectors.ZoomInjector;

public class Controller {
    
    public static void main(String[] args) {
        new EmailInjector().getClient().send();
        new FacebookInjector().getClient().send();
        new SMSInjector().getClient().send();
        new ZoomInjector().getClient().send();
    }
}
