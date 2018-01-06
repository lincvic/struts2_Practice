package service;

import dao.CarDao;
import entity.Car;

import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 23:37 2017/6/22.
 * @Descrip
 */
public class CarService {

    public void insertCar(String brand, String model, int price, String picture) {
        if ((brand != null && !"".equals(brand.trim())) &&
                (model != null && !"".equals(model.trim())) &&
                (picture != null && !"".equals(picture.trim()))) {
            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setPrice(price);
            car.setPicture(picture);

            CarDao carDao = new CarDao();
            carDao.insertCar(car);
        } else throw new RuntimeException("CarService 的 insertCar方法 参数输入不合法！");
    }

    public List<Car> selectCarList() {
        CarDao carDao = new CarDao();
        return carDao.selectCarList();
    }

    public Car selectCar(int id) {
        if (id > 0) {
            CarDao carDao = new CarDao();
            return carDao.selectCar(id);
        } else throw new RuntimeException("CarService 的 selectCar 方法 参数输入不合法！");
    }

    public void deleteCar(int carid) {
        if (carid > 0) {
            CarDao carDao = new CarDao();
            carDao.deleteCar(carid);
        } else throw new RuntimeException("CarService 的 deleteCar方法 参数输入不合法！");
    }


    public void UpdateCar(int carid, String brand, String model, int price, String picture, int quantity) {
        System.out.println(carid + " " + brand + " " + model + " " + price +" " + picture + " " + quantity);
        if (carid > 0 && price > 0 && quantity >= 0 &&
                (brand != null && !"".equals(brand.trim())) &&
                (model != null && !"".equals(model.trim())) &&
                (picture != null && !"".equals(picture.trim()))) {
            Car car = new Car();
            car.setCarid(carid);
            car.setBrand(brand);
            car.setModel(model);
            car.setPrice(price);
            car.setPicture(picture);
            car.setQuantity(quantity);

            CarDao carDao = new CarDao();
            carDao.UpdateCar(car);
        } else throw new RuntimeException("CarService 的 insertCar方法 参数输入不合法！");
    }
}
