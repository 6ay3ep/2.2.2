package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Model.Car;
import web.config.Service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarServiseImpl carServise;

    @Autowired
    public CarController(CarServiseImpl carServise) {
        this.carServise = carServise;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> cars = carServise.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
