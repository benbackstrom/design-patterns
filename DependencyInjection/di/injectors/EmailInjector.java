package di.injectors;

import di.services.EmailService;
import di.MessageClient;

public class EmailInjector implements IInjector {

    public MessageClient getClient() {
        return new MessageClient(new EmailService());
    }
}