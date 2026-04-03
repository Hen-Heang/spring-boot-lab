package com.learn.controller;

import com.learn.dto.StudentRequest;
import com.learn.dto.StudentResponse;
import com.learn.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dawnt
 * @Date 4/2/2022 9:43 AM
 * @Version 1.0
 */
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("grade")
    public ResponseEntity<Object> getStudentGrade(@RequestBody StudentRequest studentRequest) {
        StudentResponse studentResponse = studentService.studentResponse(studentRequest);
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }
}
