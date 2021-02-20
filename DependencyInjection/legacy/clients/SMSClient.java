package legacy.clients;

import legacy.ISender;
import legacy.services.SMSService;

public class SMSClient implements ISender {
    
    private final SMSService service;
    
    public SMSClient(SMSService service) {
        this.service = service;
    }

    public void send() {
        service.sendSMSMessage();
    }
}
