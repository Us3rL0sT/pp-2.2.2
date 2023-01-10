package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {



    public static ArrayList<Car> getCars(ArrayList<Car> cars) {
        return cars;
    }

    public static void sizeTo(List list, int newSize) { // на уменьшение идет нормально, но не увеличивается, что добавить??
        int size = list.size();
        if (newSize > size) {
            for (int i = size; i < newSize; i++) {
                list.add(null);
            }
        } else {
            for (int i = newSize; i < size; i++) {
                list.remove(list.size() - 1);
            }
        }
    }
}
