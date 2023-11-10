package com.seita.StudentManagement.Service;
import com.seita.StudentManagement.Model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class StudentService {

    private static Map<Integer,Student> studentMap = new HashMap<>();

    static {

        Student student = new Student(1, "Maneesha","0768766767","ghgsahg@gmail.com","78677565v");
        studentMap.put(studentMap.size(),student);

        Student student2 = new Student(2, "Nirman","0768767267","mn@gmail.com","78672345v");
        studentMap.put(studentMap.size(),student2);
    }
    public static ArrayList<Student> getAllStudent(){

        return new ArrayList<>(studentMap.values());
    }

    public static ArrayList<Student> addStudent(Student student){
        student.setSid(studentMap.size());
        studentMap.put(studentMap.size(), student);
        return new ArrayList<>(studentMap.values());
    }
}
