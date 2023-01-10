package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;

import static web.service.CarServiceImpl.sizeTo;

@Controller
public class NewController {

    ArrayList<Car> cars;


    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "Black", 202));
        cars.add(new Car("Mercedes", "White", 300));
        cars.add(new Car("UAZ", "Red", 400));
        cars.add(new Car("Lamborghini", "Orange", 511));
        cars.add(new Car("Rolls-Royce", "Brown", 605));

    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        if (count > 0) {
            sizeTo(cars, count);
        }
        model.addAttribute("cars", CarServiceImpl.getCars(cars));

        model.addAttribute("count", count);
        return "cars";
    }


}
