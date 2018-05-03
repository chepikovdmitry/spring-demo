package by;

import org.springframework.stereotype.Repository;

@Repository
public class ActionSleep implements IAction {
    public void action() {
        System.out.println("Sleep");
    }
}
