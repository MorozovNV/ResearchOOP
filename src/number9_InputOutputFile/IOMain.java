package number9_InputOutputFile;

import number8_collections.treeMap.AverageStudentGrade;
import number8_collections.treeMap.SubjectGrade;
import number8_collections.treeMap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class IOMain {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        try {
        FileWriter writer = new FileWriter("GradeBook.txt");
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            writer.write("==========================\n");
            writer.write("Student: " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade()+"\n");
            for(SubjectGrade grade: grades.get(gradeKey)){

                    writer.write("Subject: "+grade.getSubject()+" Grade: "+ grade.getGrade()+"\n");

            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
