package number9_InputOutputFile;

import number8_collections.treeMap.AverageStudentGrade;
import number8_collections.treeMap.SubjectGrade;
import number8_collections.treeMap.TreeMapRunner;

import java.io.FileWriter;
import java.util.NavigableMap;
import java.util.Set;

public class IOMain {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();

        FileWriter writer = new FileWriter("GradeBook.txt");

    }
}
