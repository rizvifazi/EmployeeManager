package com.seita.StudentManagement.Controller;

import com.seita.StudentManagement.Model.Student;
import com.seita.StudentManagement.Service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/studentCrud")
@CrossOrigin
public class StudentController {


    @GetMapping(value = "/getStudent")
    public List<Student> getAllStudent(){
        return StudentService.getAllStudent();
    }

    @PostMapping(value = "/addStudent")
    public List<Student> addStudent(@RequestBody Student student){
        return StudentService.addStudent(student);
    }
}
