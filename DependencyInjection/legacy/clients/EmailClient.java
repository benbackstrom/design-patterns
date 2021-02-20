package legacy.clients;

import legacy.ISender;
import legacy.services.EmailService;

public class EmailClient implements ISender {
    
    private final EmailService service;
    
    public EmailClient(EmailService service) {
        this.service = service;
    }

    public void send() {
        service.sendEmailMessage();
    }
}
