package web.service;

import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    public CarDaoImpl carDao = new CarDaoImpl();//todo: через конструктор (или - в последующем на Spring - вопрос решается)

    public void add(Car car) {
        carDao.add(car);
    }

    public List<Car> getAllCars(long count) {
        return carDao.getAllCars(count);
    }
}
