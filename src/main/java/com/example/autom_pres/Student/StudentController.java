package com.example.autom_pres.Student;

import com.example.autom_pres.Student.Model.Student;
import com.example.autom_pres.Student.QueryHandlers.GetAllStudentsQueryHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    //CRUD
    private final StudentRepository studentRepository;
    private final GetAllStudentsQueryHandler getAllStudentsQueryHandler;

    public StudentController(StudentRepository studentRepository,GetAllStudentsQueryHandler getAllStudentsQueryHandler) {
        this.studentRepository = studentRepository;
        this.getAllStudentsQueryHandler = getAllStudentsQueryHandler;
    }
    @GetMapping
    public ResponseEntity<List<Student>> getStudent(){
       return getAllStudentsQueryHandler.execute(null);
    }
    @PostMapping
    public ResponseEntity<String> addStudent(){
        return ResponseEntity.ok("Student Added");
    }
    @PutMapping
    public ResponseEntity<String> updateStudent(){
        return ResponseEntity.ok("Student Updated");
    }
    @DeleteMapping
    public ResponseEntity<String> deleteStudent(){
        return ResponseEntity.ok("Student Deleted");
    }
}
