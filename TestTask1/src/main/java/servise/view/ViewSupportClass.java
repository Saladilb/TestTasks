package servise.view;

import forms.Result;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ViewSupportClass {
    List listOfElementsOnAppFrame;

    public ViewSupportClass(List listOfElementsOnAppFrame) {
        this.listOfElementsOnAppFrame = listOfElementsOnAppFrame;
    }

    public void setInvisibleMyAppFrameForm() {
        ((JFrame) listOfElementsOnAppFrame.get(4)).setVisible(false);
    }

    public void showResult(List<String> diapasons, String randomArrayForResultForm) {
        Result result = new Result();
        ArrayList elementsResult = result.getListElementOfResultFrame();

        ((JTextField) elementsResult.get(3)).setText(randomArrayForResultForm);
        for (int i = 0; i < diapasons.size(); i ++) {

            ((JTextArea) elementsResult.get(2)).append(diapasons.get(i));
            ((JTextArea) elementsResult.get(2)).append("\n");
        }
    }
}
