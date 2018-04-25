package by;

import javax.annotation.Resource;

@Resource
public class ActionSleep implements IAction {
    public void action() {
        System.out.println("Sleep");
    }
}
