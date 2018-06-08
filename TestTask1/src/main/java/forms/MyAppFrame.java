package forms;

import controller.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class MyAppFrame extends JFrame{
    private List listOfElementsOnAppFrame;
    private JButton confirmChooseButton;
    private JTextField pleaseEnterYourArrayTextField;
    private JCheckBox setRandomArrayCheckBox;
    private JPanel panel1;
    private MainController mainController;
    private boolean clicked = false;
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public MyAppFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setSize(400,400);
        setVisible(true);
        setResizable(false);
        listOfElementsOnAppFrame = new ArrayList();
        listOfElementsOnAppFrame.add(confirmChooseButton);
        listOfElementsOnAppFrame.add(pleaseEnterYourArrayTextField);
        listOfElementsOnAppFrame.add(setRandomArrayCheckBox);
        listOfElementsOnAppFrame.add(panel1);
        listOfElementsOnAppFrame.add(this);

        confirmChooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (setRandomArrayCheckBox.isSelected())
                {
                    mainController.startFuncWithRandomArr(listOfElementsOnAppFrame);
                }
                else {
                   mainController.startFuncWithUserArray(listOfElementsOnAppFrame);
                }
            }
        });
        pleaseEnterYourArrayTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!clicked) {
                    pleaseEnterYourArrayTextField.setText("");
                    clicked = true;
                }
            }
        });
    }
}
