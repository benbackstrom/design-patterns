package legacy.clients;

import legacy.ISender;
import legacy.services.ZoomService;

public class ZoomClient implements ISender {

    private final ZoomService service;
    
    public ZoomClient(ZoomService service) {
        this.service = service;
    }

    public void send() {
        service.sendZoomMessage();
    }
}
