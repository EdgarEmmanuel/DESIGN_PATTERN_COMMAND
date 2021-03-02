import command.OffButtonImpl;
import command.OnButtonImpl;
import invoker.Button;
import receiver.Light;

public class Main {
    public static void main(String[] args){
        // the light or the receiver is invoked
        Light l = new Light();

        // we initialize the command with all the buttons
        Button button = new Button(new OnButtonImpl(l),new OffButtonImpl(l));

        button.onButtonClick();
        button.onButtonUnExecute();
        button.offButtonClicked();
        button.offButtonUnExecute();
    }
}
