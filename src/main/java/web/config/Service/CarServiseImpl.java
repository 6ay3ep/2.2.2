package web.config.Service;

import org.springframework.stereotype.Component;
import web.config.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiseImpl implements CarServise {
    private List<Car> car;

    {
        car = new ArrayList<Car>();

        car.add(new Car("BMW", 2022,450));
        car.add(new Car("Honda", 2012,270));
        car.add(new Car("Lada", 2025,120));
        car.add(new Car("MB-123", 1998,128));
        car.add(new Car("Kamaz", 2002,100));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= car.size()) {
            return car;
        }
        return car.subList(0, count);
    }
}
