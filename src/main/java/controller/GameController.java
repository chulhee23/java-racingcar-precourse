package controller;

import domain.Car;
import utils.RandomUtils;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameController {
    private final InputView inputView;
    private List<Car> cars = new ArrayList<>();

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run(){
        // 게임 실행
        List<Car> cars = makeCars();
        int gameRound = getGameRound();

        for(int i = 1; i <= gameRound; i++){
            // 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
            System.out.println("gameRound = " + i);

            for (Car car : cars) {
                car.running();

                System.out.println("car = " + car);
            }
        }


    }

    private int getGameRound() {
        String gameRound = inputView.setGameRound();
        // TODO int validation
        return Integer.parseInt(gameRound);
    }

    private List<Car> makeCars(){
        // TODO name validation
        String userInputCars = inputView.setCars();
        List<String> carNames = new ArrayList<>(Arrays.asList(userInputCars.split(",")));

        for(String name : carNames){
            cars.add(new Car(name));
        }
        return cars;
    }







}
