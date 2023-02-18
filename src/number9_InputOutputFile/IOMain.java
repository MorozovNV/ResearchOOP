package number9_InputOutputFile;

import number8_collections.treeMap.AverageStudentGrade;
import number8_collections.treeMap.SubjectGrade;
import number8_collections.treeMap.TreeMapRunner;

import java.io.*;
import java.util.*;

public class IOMain {
    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";

    public static void main(String[] args) throws IOException {

        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
        writer.writeFile(grades, FILE_NAME);
        //writer.writeWithFormatter(FILE_NAME);
       // reader.readFile(FILE_NAME);

        processGrades(grades, writer, BINARY_FILE);
        outputObjects(reader, BINARY_FILE);


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

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName) {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }

        writer.writeObject(students, fileName);

    }

    private static void outputObjects(Reader reader, String fileName) {
        List<Student> students = reader.readObject(fileName);
        for (Student student : students) {
            System.out.printf("%s, %.2f, %n", student.getName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }

    }

}
