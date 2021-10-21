package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        for (String name : names) {
            createCar(name);
        }
        
    }

    public void moveEachCar() {
        for (Car car : this.cars) {
            car.running();
        }
    }

    public void showEachCarStatus() {
        for (Car car : this.cars) {
            System.out.println(car.getName() + " : " +  "-".repeat(car.getPosition()));
        }
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == mostFarthestDistance()){
                winners.add(car);
            }
        }
        return winners;
    }


    private void createCar(String name) {
        Car car = new Car(name);
        cars.add(car);
    }

    private int mostFarthestDistance() {
        return this.cars.stream().max(Comparator.comparing(car -> car.getPosition())).get().getPosition();
    }



}
