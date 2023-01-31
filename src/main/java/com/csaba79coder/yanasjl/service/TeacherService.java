package com.csaba79coder.yanasjl.service;

import com.csaba79coder.yanasjl.model.Teacher;
import com.csaba79coder.yanasjl.persistence.TeacherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public void deleteTeacher(Long id) {
        Teacher teacher = teacherRepository.findTeacherById(id)
                .orElseThrow(() -> {
                    String message = String.format("Book with id: %s was not found", id);
                    log.info(message);
                    return new NoSuchElementException(message);
                });
        teacherRepository.delete(teacher);
    }
}
