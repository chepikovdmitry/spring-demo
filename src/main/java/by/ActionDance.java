package by;

import org.springframework.stereotype.Repository;

@Repository
public class ActionDance implements IAction{
    public void action() {
        System.out.println("Dance");
    }
}
