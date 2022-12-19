package number8_collections.arrays;

import java.security.SecureRandom;
import java.util.Arrays;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 6000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Side " + i + ": " + frequency[i]);
        }

        varArgs();
        processArrays();
    }

    private static void varArgs() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("Average of " + a + " elements is " + calcAverage(a));
        System.out.println("Average of " + b + " elements is " + calcAverage(a, b));
        System.out.println("Average of " + c + " elements is " + calcAverage(a, b, c));
        System.out.println("Average of " + d + " elements is " + calcAverage(a, b, c, d));

    }

    private static double calcAverage(int... args) {
        double sum = 0;
        for (double i : args) {
            sum += i;
        }
        return sum / args.length;
    }

    private static void processArrays() {
        double[] doubleArray = {8.9, 5.65, 8.12, 5.13, 4.89};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray, 7);
        System.out.println(Arrays.toString(filledArray));

        int[] intArray = {1,2,3,4,5,6,7};
        int[] arrayCopy = new int[10];
        System.arraycopy(intArray, 0, arrayCopy,0,intArray.length);
        System.out.println(Arrays.toString(arrayCopy));

    }


}
