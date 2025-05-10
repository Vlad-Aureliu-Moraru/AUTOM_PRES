package com.example.autom_pres.Student.QueryHandlers;

import com.example.autom_pres.Query;
import com.example.autom_pres.Student.Model.Student;
import com.example.autom_pres.Student.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetAllStudentsQueryHandler implements Query<Void,List<Student>>{
private final StudentRepository studentRepository;
public GetAllStudentsQueryHandler(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<List<Student>> execute(Void input) {
        List<Student> students = studentRepository.findAll();
        return ResponseEntity.ok(students);
    }

}



