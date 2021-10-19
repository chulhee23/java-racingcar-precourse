package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
입력받은 이름의 유효성을 판단하여 유효한 값을 돌려주는 클래스
 */
public class NameValidator {
    private static final int LIMIT_FOR_ARRAY_SIZE = -1;
    private static final String SPLIT_COMMA = ",";
    private static final int NAME_MAX_LENGTH = 5;
    private static final String ERROR_MESSAGE_WITH_NAME = "이름을 다시 입력해주세요.";
    private static final String ERROR_MESSAGE_WITH_LENGTH = "이름은 5자 이하여야 한다.";

    public static List<String> validateCarsName(String userInputCars){
        // 각 이름은 5자 이하
        // 이름을 입력 필수
        List<String> carNames = new ArrayList<>(Arrays.asList(userInputCars.split(SPLIT_COMMA, LIMIT_FOR_ARRAY_SIZE)));

        for (String carName : carNames) {
            validatePresentName(carName); // validate exists
            validateNameLength(carName); // validate 5 char
        }
        return carNames;

    }

    private static void validatePresentName(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException(ERROR_MESSAGE_WITH_NAME);
        }
    }

    private static void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ERROR_MESSAGE_WITH_LENGTH);
        }
    }
}
