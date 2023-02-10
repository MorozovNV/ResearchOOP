package number9_InputOutputFile;

import number8_collections.treeMap.SubjectGrade;

import java.util.Set;

public class Student {
    private String name;
    private float averageGrade;
    private Set<SubjectGrade> grades;

    public Student(String name, float averageGrade, Set<SubjectGrade> grades) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public Set<SubjectGrade> getGrades() {
        return grades;
    }
}
