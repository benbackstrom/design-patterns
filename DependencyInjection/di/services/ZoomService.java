package di.services;

public class ZoomService implements IService {
    
    public void sendZoomMessage() {
        System.out.println("Starting a Zoom call!");
    }

    public void sendMessage() {
        sendZoomMessage();
    }
}
