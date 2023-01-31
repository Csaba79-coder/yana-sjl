package com.csaba79coder.yanasjl.service;

import com.csaba79coder.yanasjl.model.Student;
import com.csaba79coder.yanasjl.persistence.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;

    public void deleteStudent(Long id) {
        Student student = studentRepository.findStudentById(id)
                .orElseThrow(() -> {
                    String message = String.format("Book with id: %s was not found", id);
                    log.info(message);
                    return new NoSuchElementException(message);
                });
        studentRepository.delete(student);
    }
}
