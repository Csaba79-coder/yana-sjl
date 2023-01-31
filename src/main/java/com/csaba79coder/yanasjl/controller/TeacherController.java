package com.csaba79coder.yanasjl.controller;

import com.csaba79coder.yanasjl.model.Teacher;
import com.csaba79coder.yanasjl.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @RequestMapping(
            value = "/teachers",
            method = RequestMethod.GET,
            headers = "Accept=application/json")
    public ResponseEntity<List<Teacher>> renderAllTeachers() {
        return ResponseEntity.status(200).body(teacherService.renderAllTeachers());
    }
}
