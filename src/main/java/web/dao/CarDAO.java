package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDAO {
     List<Car> showCarNumber(int count);
     List<Car> index();
}
