package by;

import javax.annotation.Resource;

@Resource
public class ActionDance implements IAction{
    public void action() {
        System.out.println("Dance");
    }
}
