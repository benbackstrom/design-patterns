package di.injectors;

import di.services.ZoomService;
import di.MessageClient;

public class ZoomInjector implements IInjector {

    public MessageClient getClient() {
        return new MessageClient(new ZoomService());
    }
}