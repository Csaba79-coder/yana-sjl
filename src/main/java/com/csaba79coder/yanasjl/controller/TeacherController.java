package com.csaba79coder.yanasjl.controller;

import com.csaba79coder.yanasjl.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;
}
