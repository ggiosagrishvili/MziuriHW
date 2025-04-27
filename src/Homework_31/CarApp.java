package Homework_31;
import java.util.*;

class Engine {
    String fuelType;
    int cylinders;
    double capacity;

    public Engine(String fuelType, int cylinders, double capacity) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Fuel: " + fuelType + ", Cylinders: " + cylinders + ", Capacity: " + capacity + "L";
    }
}

class Car {
    String make;
    String model;
    int year;
    int mileage;
    Engine engine;

    public Car(String make, String model, int year, int mileage, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getEngineCapacity() {
        return engine.getCapacity();
    }

    @Override
    public String toString() {
        return make +  model +  year +  mileage + engine;
    }
}

public class CarApp {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Toyota", "Camry", 2018, 75000, new Engine("Petrol", 4, 2.5)),
                new Car("BMW", "X5", 2020, 50000, new Engine("Diesel", 6, 3.0)),
                new Car("Honda", "Civic", 2015, 120000, new Engine("Petrol", 4, 1.8)),
                new Car("Mercedes", "C-Class", 2019, 60000, new Engine("Petrol", 4, 2.0))
        ));

        System.out.println("Cars unsorted:");
        for (Car car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getYear() < cars.get(j).getYear()) {
                    Car temp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, temp);
                }
            }
        }
        System.out.println("Cars sorted by year:");
        for (Car car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getMileage() > cars.get(j).getMileage()) {
                    Car temp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, temp);
                }
            }
        }
        System.out.println("Cars sorted by mileage:");
        for (Car car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getEngineCapacity() < cars.get(j).getEngineCapacity()) {
                    Car temp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, temp);
                }
            }
        }
        System.out.println("Cars sorted by engine capacity:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}