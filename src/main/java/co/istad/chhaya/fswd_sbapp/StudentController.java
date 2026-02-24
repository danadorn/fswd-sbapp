package co.istad.chhaya.fswd_sbapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/api/students")
    public List<Student> getStudents() {
        Student student = Student.builder()
                .name("Dana")
                .gender("F")
                .course("Fullstack")
                .build();

        Student student1 = Student.builder()
                .name("Kon Khmer")
                .gender("")
                .course("")
                .build();
        return List.of(student, student1);
    }
}
