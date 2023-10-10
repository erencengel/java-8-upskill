package day1_generic.student;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    private String name;
    private List<Student> studentsList;

    public Batch(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student){
        studentsList.add(student);
    }

}

