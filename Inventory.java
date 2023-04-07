package yenideneme;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List cars;

    public Inventory() {
        cars = new LinkedList();
    }

    public void addCar(String serialNumber, double price,
                          CarSpec spec) {
        Car car = new Car(serialNumber, price, spec);
        cars.add(car);
    }

    public Car getCar(String serialNumber) {
        for (Iterator i = cars.iterator(); i.hasNext(); ) {
            Car car = (Car)i.next();
            if (car.getSerialNumber().equals(serialNumber)) {
                return car;
            }
        }
        return null;
    }

    public List search(CarSpec searchSpec) {
        List matchingCars = new LinkedList();
        for (Iterator i = cars.iterator(); i.hasNext(); ) {
            Car Car = (Car)i.next();
            if (Car.getSpec().matches(searchSpec))
                matchingCars.add(Car);
        }
        return matchingCars;
    }
}

