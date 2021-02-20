package di.injectors;

import di.services.SMSService;
import di.MessageClient;

public class SMSInjector implements IInjector {

    public MessageClient getClient() {
        return new MessageClient(new SMSService());
    }
}