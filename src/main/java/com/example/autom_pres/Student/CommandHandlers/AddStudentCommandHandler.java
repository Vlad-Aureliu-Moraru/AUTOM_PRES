package com.example.autom_pres.Student.CommandHandlers;

import com.example.autom_pres.Command;
import com.example.autom_pres.Student.Model.Student;
import org.springframework.http.ResponseEntity;

public class AddStudentCommandHandler implements Command<Student, ResponseEntity<String>> {
    public ResponseEntity execute(Student input) {
        return ResponseEntity.ok("Student Added");
    }
}
