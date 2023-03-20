package JavaHW3;
import java.util.Arrays;

public class MergeSort {
    public static int[] ArraySort(int[] arrA) {
        if (arrA == null) {
            return null;
        }
        if (arrA.length == 1) {
            return arrA;
        }
        int[] arrB = new int[arrA.length / 2];
        System.arraycopy(arrA, 0, arrB, 0, arrA.length / 2);
        int[] arrC = new int[arrA.length - arrA.length / 2];
        System.arraycopy(arrA, arrA.length / 2, arrC, 0, arrA.length - arrA.length / 2);
        arrB = ArraySort(arrB);
        arrC = ArraySort(arrC);
        return merge(arrB, arrC);
    }

    public static int[] merge(int[] arrA, int[] arrB) {
        int[] arrC = new int[arrA.length + arrB.length];
        int i = 0, j = 0, k = 0;
        while (i < arrA.length && j < arrB.length) {
            arrC[k++] = arrA[i] < arrB[j] ? arrA[i++] : arrB[j++];
        }
        if (i < arrA.length) {
            System.arraycopy(arrA, i, arrC, k, arrA.length - i);
        } else if (j < arrB.length) {
            System.arraycopy(arrB, j, arrC, k, arrB.length - j);
        }
        return arrC;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        int[] result;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10) + 10);
        }
        System.out.println(Arrays.toString(array));
        result = ArraySort(array);
        System.out.println(Arrays.toString(result));

    }
}