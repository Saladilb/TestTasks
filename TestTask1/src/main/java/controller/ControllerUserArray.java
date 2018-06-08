package controller;

import forms.Error;
import forms.Result;
import servise.ParserDiapasons;
import servise.view.ViewSupportClass;

import javax.swing.*;
import java.util.List;

public class ControllerUserArray {

    int [] resultArr;
    String UserArr;
    ParserDiapasons parserDiapasons;

    public void startParseUsersArr(List listOfElementsOnAppFrame) {
        parserDiapasons = new ParserDiapasons();
        try {
            List <String> diapason = parserDiapasons.parseUserArr((JTextField) listOfElementsOnAppFrame.get(1));
            ViewSupportClass viewSupportClass = new ViewSupportClass(listOfElementsOnAppFrame);
            viewSupportClass.setInvisibleMyAppFrameForm();
            viewSupportClass.showResult(diapason, ((JTextField) listOfElementsOnAppFrame.get(1)).getText());
        } catch (Exception e) {
            ((JFrame) listOfElementsOnAppFrame.get(4)).setVisible(false);
            Error error = new Error();
        }
    }
}
