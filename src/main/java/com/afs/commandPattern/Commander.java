package com.afs.commandPattern;

public class Commander {
    public static void main(String[] args) {
        CommandCenter commandCenter = new CommandCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");

        commandCenter.appendCommand(new ForwardCommand(marsRover));     //(0 1 N)
        commandCenter.appendCommand(new ForwardCommand(marsRover));     //(0 2 N)
        commandCenter.appendCommand(new TurnLeftCommand(marsRover));    //(0 2 W)
        commandCenter.appendCommand(new ForwardCommand(marsRover));     //(-1 2 W)
        commandCenter.appendCommand(new TurnRightCommand(marsRover));   //(-1 2 N)
        commandCenter.appendCommand(new ForwardCommand(marsRover));     //(-1 3 N)

        commandCenter.sendCommand();                                    //batch

        System.out.println(marsRover.reportRoverDetail());              //return (-1 3 N)
    }
}
