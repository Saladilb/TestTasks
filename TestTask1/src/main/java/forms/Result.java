package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Result extends JFrame{
    private JButton exit;
    private JTextArea textArea1;
    private JPanel Panel2;
    private JTextField textFieldRandomArr;

    public Result() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Panel2);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setVisible(true);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public ArrayList getListElementOfResultFrame() {
        ArrayList listOfElements = new ArrayList();
        listOfElements.add(exit);
        listOfElements.add(Panel2);
        listOfElements.add(textArea1);
        listOfElements.add(textFieldRandomArr);
        return listOfElements;
    }
}
