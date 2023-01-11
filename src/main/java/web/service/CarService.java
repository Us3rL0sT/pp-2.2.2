package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    public ArrayList<Car> getCars();

    public ArrayList<Car> editTable(int count);

}
