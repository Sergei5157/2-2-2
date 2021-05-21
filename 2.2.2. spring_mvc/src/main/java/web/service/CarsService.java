package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsService {

public List<Cars> getCars(int quantity) {
    List<Cars> carsList = new ArrayList<>();
    carsList.add(new Cars("Vaz", "2106", 20000));
    carsList.add(new Cars("Nissan", "synny", 150000));
    carsList.add(new Cars("Toyota", "Corolla", 400000));
    carsList.add(new Cars("BMW", "X6", 6000000));
    carsList.add(new Cars("Lamborghini", "Huracan", 30000000));
    List<Cars> cars;
    try {
         cars = carsList.subList(0, quantity);
    }catch (IndexOutOfBoundsException e){
        return carsList;
    }
    return cars;
}
}
