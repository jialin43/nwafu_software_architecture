package com.company.control;

public class RemoteControl {
    private Command command;
    public void buttonOn(){
        command.execute();
    }
    public void setCommand(Command _command){
        command = _command;
    }

    public static void main(String[] args) {
        RemoteControl lightOnControl = new RemoteControl();
        RemoteControl lightOffControl= new RemoteControl();
        Command onCommand = new LightOnCommand(new Light());
        Command offCommand = new LightOffCommand(new Light());
        lightOnControl.setCommand(offCommand);
        lightOffControl.setCommand(onCommand);
        lightOnControl.buttonOn();
        lightOffControl.buttonOn();
    }
}
