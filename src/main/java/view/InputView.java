package view;

import domain.Car;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private final Scanner scanner;
    private final String carInputQuestion = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String carNumberInputQuestion = "시도할 회수는 몇회인가요?";

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String setCars() {
        System.out.println(carInputQuestion);
        return this.scanner.nextLine();
    }

    public String setGameRound() {
        System.out.println(carNumberInputQuestion);
        return this.scanner.nextLine();
    }
}
