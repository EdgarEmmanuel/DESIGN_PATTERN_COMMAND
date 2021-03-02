package command;

import receiver.Light;

public class OnButtonImpl implements Commands{
    private Light light;
    public OnButtonImpl(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unExecute() {
        this.light.off();
    }
}
