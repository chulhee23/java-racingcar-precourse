package controller;

import domain.Car;
import domain.Cars;
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

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    /***
     * 게임 실행
     */
    public void run(){
        Cars cars = new Cars(NameValidator.validateCarsName((inputView.setCars())));
        int gameRound = getGameRound();



        for(int i = 1; i <= gameRound; i++){
            playRound(cars, i);
        }

        ResultView.showWinner(cars);

    }

    /***
     * 라운드 내 진행
     * @param i 라운드 번호
     */
    private void playRound(Cars cars, int i){
        ResultView.showRound(i);
        cars.moveEachCar();


        ResultView.showRoundResult(cars);
    }

    private int getGameRound() {
        return RoundValidator.validateRoundNumber(inputView.setGameRound());
    }








}
