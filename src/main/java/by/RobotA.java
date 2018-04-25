package by;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RobotA implements IStartAction {
    @Autowired
    private List<IAction> actionList= new ArrayList<IAction>();

    public RobotA(List<IAction> actionList) {
        this.actionList = actionList;
    }

    public void start(){
        for (IAction action:actionList
             ) {
            action.action();
        }

    }

}
