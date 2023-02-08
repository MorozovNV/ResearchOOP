package number9_InputOutputFile;

import number8_collections.treeMap.AverageStudentGrade;
import number8_collections.treeMap.SubjectGrade;
import number8_collections.treeMap.TreeMapRunner;

import java.io.*;
import java.util.*;

public class IOMain {
    private static final String FILE_NAME = "GradeBook.txt";

    public static void main(String[] args) throws IOException {

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        writeFile(grades);
        readFile();

        Formatter formatter = new Formatter("BankAccounts.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter clientID, clientName, clientSurname, balance");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d, %s, %s, %.2f\n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input is incorrect. Please try again");
                scanner.nextLine();
            }
        }
        formatter.close();







        /* System.out.println("___________BYTE________________");
        try (FileInputStream reader = new FileInputStream(FILE_NAME);
            FileOutputStream writer = new FileOutputStream("GradeBookByte.txt")) {
            int c;
            while( (c= reader.read())!=-1){
                System.out.println(c);
                writer.write(c);
            }
        }*/

    }

    private static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }

    private static void writeFile(NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades) throws IOException {

        try (PrintWriter writer = new PrintWriter(new FileWriter("GradeBook.txt"))) {

            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("==========================\n");
                writer.write("Student: " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {

                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");

                }
            }
        }
    }
}
