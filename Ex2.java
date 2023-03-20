package JavaHW3;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.String.format;

/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.*/

public class Ex2 {
    public static ArrayList<Integer> getArray() {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            arr.add((int) (Math.random() * (50 - 10) + 10));
        }
        System.out.println(arr.toString());
        return arr;
    }


    public static String mathOperation() {
        ArrayList <Integer> array = getArray();
        int avg = 0;
        for (int i = 0; i < array.size(); i++) {
            avg = avg + array.get(i);
        }
        avg = avg / array.size();
        int min = Collections.min(array);
        int max = Collections.max(array);
        String result = format("Average: %d, Min: %d, Max: %d", avg, min, max);
        return result;
    }

    public static void main(String[] args) {
        String result = mathOperation();
        System.out.println(result);
    }
}
