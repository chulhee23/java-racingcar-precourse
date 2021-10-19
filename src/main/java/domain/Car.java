package domain;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;
    private final int MINIMUM_NUMBER_TO_MOVE = 4;
    private final int LOWER = 1;
    private final int UPPER = 9;


    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void run(int distance){
        this.position += distance;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void running(){
        int randNum = RandomUtils.nextInt(LOWER, UPPER);
        if (randNum >= MINIMUM_NUMBER_TO_MOVE) {
            this.position++;
        }
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
