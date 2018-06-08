package servise;

import javax.swing.*;
import java.util.*;

public class ParserDiapasons {
    // А теперь склеим назад в строковый диапазон числа)
    public List <String> startWithRandomArr(int[] array) {
        boolean succeful = false;
        String currentString = "";
        List<String> diapasons = new ArrayList<>();
        for (int i = 0; i < array.length; i ++) {
            if (array[i] != array[array.length - 1]) {
                if (array[i + 1] - 1 == array[i]) {
                    if (succeful == false) {
                        currentString = "" + array[i];
                        succeful = true;
                    } else {
                        currentString += ", " + array[i];
                    }
                } else {
                    if (succeful == true) {
                        currentString += ", " + array[i];
                        succeful = false;
                        diapasons.add(currentString);
                        currentString = "";
                    } else {
                        currentString += array[i];
                        diapasons.add(currentString);
                        currentString = "";
                    }
                }
            }
            else {
                if (succeful == true) {
                    currentString += ", " + array[i];
                    diapasons.add(currentString);
                }
                else {
                    currentString = "" + array[i];
                    diapasons.add(currentString);
                }
            }
        }
        return diapasons;
    }

    public List<String> parseUserArr(JTextField jTextField) throws Exception {

        String [] userString = jTextField.getText().split(" ");

        TreeSet<Integer> resultArr = new TreeSet<>();
        try {
            for (int i = 0; i < userString.length; i++) {
                resultArr.add(Integer.parseInt(userString[i]));
            }

            //тут легкий костыль - незачем писать парсер дважды. приводим к массив и отдаем на корм парсеру снова.
            int [] resultArray = new int[resultArr.size()];
            Iterator<Integer> it = resultArr.iterator();
            int count = 0;
            while(it.hasNext() ) {
                resultArray[count] = it.next();
                count++;
            }

            List <String> result = startWithRandomArr(resultArray);
            return result;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
