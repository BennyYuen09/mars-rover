package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int xLocation;
    private int yLocation;
    private String direction;
    private final String[] allowDirection = {"N", "E", "S", "W"};

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        if (Arrays.asList(allowDirection).contains(direction)){
            this.direction = direction;
        }else {
            this.direction = allowDirection[0];
        }
    }

    public String processCommand(String command) {
        switch (command){
            case "M":
                moveForward();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            default:
        }
        return reportRoverDetail();
    }

    public String reportRoverDetail() {
        return String.format("%d %d %s", xLocation, yLocation, direction);
    }

    private void moveForward(){
        switch (direction){
            case "N":
                yLocation++;
                break;
            case "W":
                xLocation--;
                break;
            default:
        }
    }

    private void turnLeft(){
        direction = "W";
    }

    private void turnRight(){
        direction = "E";
    }
}
