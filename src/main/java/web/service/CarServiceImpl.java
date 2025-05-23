package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> car;

    public CarServiceImpl() {
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
