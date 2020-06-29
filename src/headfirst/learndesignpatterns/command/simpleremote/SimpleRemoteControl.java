package headfirst.learndesignpatterns.command.simpleremote;

/**
 * Created by peng on 2020/6/23.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){};

    public void setCommand(Command command){slot = command;}

    public void buttonWasPressed() {slot.execute();}
}
