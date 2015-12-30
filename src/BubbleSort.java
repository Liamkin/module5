import java.util.Arrays;

/**
 * Created by miroslavlyamkin on 30.12.15. Программа сортирует массив методом пузырьковой сортировки
 */
public class BubbleSort {
    public static void main(String[] args) {

        int [] insSortArray = {1,4,-7,12,8,-3,0,0,-11,10};

        for (int i = 1; i < insSortArray.length - 1; i++) {
            //Делаем по одному проходу для каждого числа в массиве - после первого прохода гарантированно последнее число будет самым большим,
            // И так далее, пока не отсортируются все числа

            for (int j = 0; j < insSortArray.length -1; j++) {
                // Каждый проход подразумевает поочередную проверку соседних чисел на больше-меньше

                if (insSortArray[j+1] < insSortArray[j]){
                    // если следующее в массиве число больше, чем предыдущее, то они меняются местами
                    int result = insSortArray[j];
                    insSortArray[j] = insSortArray[j+1];
                    insSortArray[j+1] = result;
                }
            }
        }
        System.out.println(Arrays.toString(insSortArray));
    }
}
