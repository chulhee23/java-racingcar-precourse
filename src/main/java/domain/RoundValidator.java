package domain;

public class RoundValidator {
    private static final String GAMEROUND_INTEGER_ERROR_MESSAGE = "게임 라운드는 반드시 숫자여야 합니다.";

    public static int validateRoundNumber(String gameRound) {
        return validateInteger(gameRound);
    }

    private static int validateInteger(String gameRound){
        try {
            return Integer.parseInt(gameRound);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(GAMEROUND_INTEGER_ERROR_MESSAGE);
        }
    }
}
