package view;

import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static void showRound(int idx){
        System.out.println("gameRound = " + idx);
    }

    public static void showRoundResult(Cars cars) {

        cars.showEachCarStatus();


    }

    public static void showWinner(Cars cars){

        List<Car> winners = calculateWinners(cars);

        String winnerNames = winners.stream().map(car -> car.getName()).collect(Collectors.joining(", "));
        System.out.println("Winners = " + winnerNames);


    }

    private static List<Car> calculateWinners(Cars cars){
        return cars.getWinners();
    }
}
