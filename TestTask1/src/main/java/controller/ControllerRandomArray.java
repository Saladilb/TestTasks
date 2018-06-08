package controller;

import servise.ParserDiapasons;
import servise.ProducerRandomArray;
import servise.view.ViewSupportClass;
import java.util.List;

public class ControllerRandomArray {
    String randomArrayForResultForm;
    private int [] randomArray;
    private ProducerRandomArray producerRandomArray;

    public ControllerRandomArray() {
        producerRandomArray = new ProducerRandomArray();
        randomArrayForResultForm = producerRandomArray.getRandomArrayString();
        this.randomArray = producerRandomArray.getRandomArray();
        producerRandomArray = new ProducerRandomArray();
    }

    public void startServise(List listOfElementsOnAppFrame) {
        ViewSupportClass viewSupportClass = new ViewSupportClass(listOfElementsOnAppFrame);
        viewSupportClass.setInvisibleMyAppFrameForm();
        ParserDiapasons parserDiapasons = new ParserDiapasons();
        List <String> diapasons = parserDiapasons.startWithRandomArr(randomArray);
        viewSupportClass.showResult(diapasons, randomArrayForResultForm);
    }
}
