package view;

import domain.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultView {

    public static void showRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " +  "-".repeat(car.getPosition()));
        }
    }

    public static void showWinner(List<Car> cars){
        List<Car> winners = new ArrayList<>();

        int longestDistance = cars.stream().max(Comparator.comparing(car -> car.getPosition())).get().getPosition();

        for (Car car : cars) {
            if (car.getPosition() == longestDistance){
                winners.add(car);
            }
        }

        System.out.print("Winner = ");
        for (Car winner : winners) {
            System.out.print(winner + ", ");
        }
        System.out.println("longestDistance = " + longestDistance);
    }

}
