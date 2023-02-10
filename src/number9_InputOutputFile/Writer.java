package number9_InputOutputFile;

import number8_collections.treeMap.AverageStudentGrade;
import number8_collections.treeMap.SubjectGrade;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Writer {
    public void writeWithFormatter(String fileName) throws FileNotFoundException {
        Formatter formatter = new Formatter(fileName);
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
    }

    public void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String fileName) throws IOException {

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("==========================\n");
                writer.write("Student: " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {

                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");

                }
            }
        }
    }

    public void writeObject(List<Student> students, String fileName ){

    }


}
