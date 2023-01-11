package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    private ArrayList<Car> cars;


    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "Black", 202));
        cars.add(new Car("Mercedes", "White", 300));
        cars.add(new Car("UAZ", "Red", 400));
        cars.add(new Car("Lamborghini", "Orange", 511));
        cars.add(new Car("Rolls-Royce", "Brown", 605));

    }


    @Override
    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public ArrayList<Car> editTable(int count) {
        ArrayList<Car> countCars = new ArrayList<>();
        if (count >= cars.size()) {
            return cars;
        } else {
            for (int i = 1; i <= count; i++) {
                countCars.add(cars.get(i));
            }
            return countCars;
        }
    }
}

