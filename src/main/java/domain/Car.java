package domain;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;
    private static final int MINIMUM_NUMBER_TO_MOVE = 4;


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
        int randNum = RandomUtils.nextInt(1, 9);
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
