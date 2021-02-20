package di;

import di.services.IService;

public class MessageClient {
    private final IService service;

    public MessageClient(IService service) {
        this.service = service;
    }

    public void send() {
        service.sendMessage();
    }
}
