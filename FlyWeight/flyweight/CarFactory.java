package flyweight;

import java.util.*;
import java.awt.Color;

public class CarFactory {

    private static Map<Color, Car> carMap;
    
    public static Car getOrCreate(Color color) {
        if (carMap == null)
            carMap = new HashMap<>();
        
        Car car = carMap.get(color);
        if (car == null) {
            car = new Car(color);
            carMap.put(color, car);
        }

        return car;
    }
}
