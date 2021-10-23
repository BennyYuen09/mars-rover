package com.afs.commandPattern;

import java.util.LinkedList;
import java.util.Queue;

public class CommandCenter {
    private Queue<Command> commands = new LinkedList<>();

    public void appendCommand(Command command) {
        commands.add(command);
    }

    public void setCommandList(LinkedList<Command> commandList){
        this.commands = commandList;
    }

    public void sendCommand() {
        while (!commands.isEmpty()) {
            Command command = commands.poll();  //get the oldest command
            command.execute();
        }
    }
}
