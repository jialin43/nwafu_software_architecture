package com.company.control;

public class LightOffCommand implements Command {
    private Light light;
    @Override
    public void execute() {
        light.off();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
