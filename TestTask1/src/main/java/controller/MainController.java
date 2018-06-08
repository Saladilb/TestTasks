package controller;

import forms.MyAppFrame;
import java.util.List;

public class MainController {
    MyAppFrame myAppFrame;
    private ControllerRandomArray controllerRandomArray;
    private ControllerUserArray controllerUserArray;

    public MainController() {
        myAppFrame = new MyAppFrame();
        myAppFrame.setMainController(this);
    }

    public void startFuncWithRandomArr(List listOfElementsOnAppFrame) {
        controllerRandomArray = new ControllerRandomArray();
        controllerRandomArray.startServise(listOfElementsOnAppFrame);
    }

    public void startFuncWithUserArray(List listOfElementsOnAppFrame) {
        controllerUserArray = new ControllerUserArray();
        controllerUserArray.startParseUsersArr(listOfElementsOnAppFrame);
    }
}
