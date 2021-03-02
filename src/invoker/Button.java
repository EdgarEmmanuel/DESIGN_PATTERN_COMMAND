package invoker;

import command.Commands;
import command.OffButtonImpl;
import command.OnButtonImpl;

public class Button {
    private Commands onButton;
    private Commands offButton;

    public Button(OnButtonImpl onButton, OffButtonImpl offButton){
        this.onButton = onButton;
        this.offButton = offButton;
    }

    public void onButtonClick(){
        this.onButton.execute();
    }

    public void onButtonUnExecute(){
        this.onButton.unExecute();
    }

    public void offButtonClicked(){
        this.offButton.execute();
    }

    public void offButtonUnExecute(){
        this.offButton.unExecute();
    }
}
