package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
     List<Car> showCarNumber (int count);
     List<Car> showAllCars();
}
