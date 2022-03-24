package com.bumblebee.designpattern.behavioral.command;

public class OttService {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String displayOtt() {
        return command.run();
    }

}
