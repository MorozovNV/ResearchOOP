package number8_collections.arrays;

import java.util.Arrays;

public class ArrayLauncher {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 4, 7, 5, 8, 2, 8, 3, 6, 1};
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(myArray);
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    private static int[] sort(int[] array) {
        int ch = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    ch++;
                }
            }
        }
        System.out.println(ch);
        return array;


        /* два способа копировать массив.
        int[] myNewArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            myNewArray[i] = array[i];
        }*/
    }
}
