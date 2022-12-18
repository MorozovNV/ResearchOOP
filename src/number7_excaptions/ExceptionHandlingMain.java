package number7_excaptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer = null;

        do {
            try {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();

                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result = " + divide(numerator, denominator));

                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Only non-zero parameters and integer value allowed");
            } catch ( IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } finally {
                System.out.println("Finally block called");
                writer.close();
            }
        } while (continueLoop);
        System.out.println("Try-catch block finished");
    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    private static void saveToFile(int res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
        writer.println("Result = " + res);
        writer.close();
    }
}
