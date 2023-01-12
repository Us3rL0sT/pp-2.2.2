package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    public ArrayList<Car> getCarsById(int count) {
        return (ArrayList<Car>) cars.stream().limit(count).collect(Collectors.toList());
    }
}

























