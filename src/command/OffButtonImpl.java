package command;

import receiver.Light;

public class OffButtonImpl implements  Commands{
    private Light light;
    public OffButtonImpl(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void unExecute() {
        this.light.on();
    }
}
