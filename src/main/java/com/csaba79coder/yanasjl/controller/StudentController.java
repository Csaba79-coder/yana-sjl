package com.csaba79coder.yanasjl.controller;

import com.csaba79coder.yanasjl.model.Student;
import com.csaba79coder.yanasjl.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @RequestMapping(
            value = "/students",
            method = RequestMethod.GET,
            headers = "Accept=application/json")
    public ResponseEntity<List<Student>> renderAllStudents() {
        return ResponseEntity.status(200).body(studentService.renderAllStudents());
    }
}
