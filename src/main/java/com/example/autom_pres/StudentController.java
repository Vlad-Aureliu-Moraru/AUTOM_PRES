package com.example.autom_pres;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    //CRUD
    @GetMapping
    public ResponseEntity<String> getStudent(){
        return ResponseEntity.ok("Student");
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
