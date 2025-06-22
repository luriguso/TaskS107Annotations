package level2.exercise1.classManagement;

import level2.exercise1.annotations.JsonSerializableField;
import level2.exercise1.classData.Car;

import java.util.ArrayList;
import java.util.List;

@JsonSerializableField(directory = "src/resources/Car.json")
public class CarManagement {
    List<Car> cars;

    public CarManagement() {
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCarInitial() {
        cars.add(new Car("Toyota", "Supra", 1990));
        cars.add(new Car("Ford", "Musatng", 1990));
        cars.add(new Car("BMW", "BMW", 1990));
        cars.add(new Car("Mercedes", "Mercedes", 1990));
    }

    public void listCars() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
