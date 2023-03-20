package JavaHW3;
import java.util.ArrayList;

/*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/

public class Ex1 {
    public static ArrayList<Integer> getArray(ArrayList<Integer> arr) {

        for (int i = 0; i < 15; i++) {
            arr.add((int) (Math.random() * (50 - 10)) + 10);
        }
        System.out.println(arr.toString());
        return arr;
    }

    public static String evenNumb(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }

        }
        return list.toString();
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = getArray(new ArrayList<Integer>());
        evenNumb(list);
        System.out.println(list.toString());
    }
}