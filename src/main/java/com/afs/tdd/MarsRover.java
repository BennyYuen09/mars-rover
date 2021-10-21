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

    public String reportRoverDetail() {
        return null;
    }
}
