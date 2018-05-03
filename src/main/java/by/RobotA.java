package by;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RobotA implements IStartAction {

    private List<IAction> actionList= new ArrayList<IAction>();

    public RobotA(@Qualifier("actionSleep")   List<IAction> actionList) {
        this.actionList = actionList;
    }

    public void start(){
        for (IAction action:actionList
             ) {
            action.action();
        }

    }

}
