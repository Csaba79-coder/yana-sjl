package com.csaba79coder.yanasjl.controller;

import com.csaba79coder.yanasjl.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
}
