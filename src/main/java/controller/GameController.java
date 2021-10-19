package controller;

import domain.Car;
import domain.NameValidator;
import domain.RoundValidator;
import utils.RandomUtils;
import view.InputView;
import view.ResultView;

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

    /***
     * 게임 실행
     */
    public void run(){
        List<Car> cars = makeCars();
        int gameRound = getGameRound();

        for(int i = 1; i <= gameRound; i++){
            playRound(i);
        }

        ResultView.showWinner(cars);

    }

    /***
     * 라운드 내 진행
     * @param i 라운드 번호
     */
    private void playRound(int i){
        ResultView.showRound(i);

        for (Car car : cars) {
            car.running();
        }

        ResultView.showRoundResult(cars);
    }

    private int getGameRound() {
        return RoundValidator.validateRoundNumber(inputView.setGameRound());
    }

    private List<Car> makeCars(){
        List<String> carNames = NameValidator.validateCarsName((inputView.setCars()));

        for(String name : carNames){
            cars.add(new Car(name));
        }
        return cars;
    }







}
