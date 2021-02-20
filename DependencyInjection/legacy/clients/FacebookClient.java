package legacy.clients;

import legacy.ISender;
import legacy.services.FacebookService;

public class FacebookClient implements ISender {
    
    private final FacebookService service;
    
    public FacebookClient(FacebookService service) {
        this.service = service;
    }

    public void send() {
        service.sendFacebookMessage();
    }
}
