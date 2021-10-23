package com.afs.tdd;

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
            case "S":
                yLocation--;
                break;
            case "E":
                xLocation++;
                break;
            default:
        }
    }

    private void turnLeft(){
        int newDirectionIndex = (getDirectionIndex() - 1 + ALLOW_DIRECTIONS.length) % ALLOW_DIRECTIONS.length;
        this.direction = ALLOW_DIRECTIONS[newDirectionIndex];
    }

    private void turnRight(){
        int newDirectionIndex = getDirectionIndex() % ALLOW_DIRECTIONS.length;
        this.direction = ALLOW_DIRECTIONS[newDirectionIndex];
    }

    private int getDirectionIndex(){
        return Arrays.asList(ALLOW_DIRECTIONS)
                .indexOf(this.direction);
    }

    public String processBatchCommand(String commands) {
        for (int i=0; i<commands.length(); i++){
            processCommand(Character.toString(commands.charAt(i)));
        }
        return reportRoverDetail();
    }
}
