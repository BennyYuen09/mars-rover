package com.afs.commandPattern;

import java.util.Arrays;

public class MarsRover {
    private final String[] ALLOW_DIRECTIONS = {"N", "E", "S", "W"};

    private int xLocation;
    private int yLocation;
    private String direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;

        if (Arrays.asList(ALLOW_DIRECTIONS).contains(direction)){
            this.direction = direction;
        }else {
            this.direction = ALLOW_DIRECTIONS[0];
        }
    }

    public String reportRoverDetail() {
        return String.format("%d %d %s", xLocation, yLocation, direction);
    }

    public void moveForward(){
        switch (direction){
            case "N":
                yLocation++;
                break;
            case "W":
                xLocation--;
                break;
            case "S":
                yLocation--;
                break;
            case "E":
                xLocation++;
                break;
            default:
        }
    }

    public void turnLeft(){
        int newDirectionIndex = (getDirectionIndex() - 1 + ALLOW_DIRECTIONS.length) % ALLOW_DIRECTIONS.length;
        this.direction = ALLOW_DIRECTIONS[newDirectionIndex];
    }

    public void turnRight(){
        int newDirectionIndex = getDirectionIndex() % ALLOW_DIRECTIONS.length;
        this.direction = ALLOW_DIRECTIONS[newDirectionIndex];
    }

    private int getDirectionIndex(){
        return Arrays.asList(ALLOW_DIRECTIONS).indexOf(this.direction);
    }
}
