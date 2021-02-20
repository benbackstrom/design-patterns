package di.injectors;

import di.services.FacebookService;
import di.MessageClient;

public class FacebookInjector implements IInjector {

    public MessageClient getClient() {
        return new MessageClient(new FacebookService());
    }
}