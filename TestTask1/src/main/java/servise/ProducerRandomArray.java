package servise;

import java.util.List;
import java.util.Random;

// на самом деле тут все очень заморочено. ничего не мешало просто в цикле генерировать
// напрямую элементы массива, но, это ведь не так интересно и красиво по диапазонам.
// Ну и самое главное - Вы ведь хотели проверить знание синтаксиса - так его удалось чуть больше показать.

public class ProducerRandomArray {
    Random random;
    String randomArrayOfString;
    public ProducerRandomArray () {
        random = new Random();
    }
    public int [] getRandomArray() {

        //строку получили - распарсим в массив
        String randomArraySplit [] = randomArrayOfString.split(" ");
        int [] randomArrayInt = new int[randomArraySplit.length];
        for (int i = 0; i < randomArraySplit.length; i ++) {
            randomArrayInt[i] = Integer.parseInt(randomArraySplit[i]);
        }
        return randomArrayInt;
    }

    public String getRandomArrayString() {
        int lenghtRandomArr = 20;
        // на этом этапе мы еще не знаем какой длинны может быть конечный массив. так давайте обработаем его в строке.
        String randomArrayOfString = "0";
        boolean willAdd = false;
        for (int i = 1; i < lenghtRandomArr; i++) {
            if (random.nextInt(3) > 1) {
                randomArrayOfString += " " + i;
            }
        }
        this.randomArrayOfString = randomArrayOfString;
        return randomArrayOfString;
    }
}
