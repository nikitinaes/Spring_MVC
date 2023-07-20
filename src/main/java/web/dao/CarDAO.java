package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {

    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Vokswagen", "red"));
        cars.add(new Car(++CAR_COUNT, "Kia", "green"));
        cars.add(new Car(++CAR_COUNT, "ZAZ", "black"));
        cars.add(new Car(++CAR_COUNT, "Mitsubishi", "white"));
        cars.add(new Car(++CAR_COUNT, "Moskvich", "red"));
    }

    public List<Car> index() {
        return cars;
    }

    public List<Car> showCarNumber(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}

