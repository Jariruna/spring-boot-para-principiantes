package com.caquis.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Luis",
                        "Ninaco",
                        LocalDate.now(),
                        "contact@joseninaco.com",
                        43
                ),
                new Student(
                        "Marcelo",
                        "Ninaco",
                        LocalDate.now(),
                        "contact@richardninaco.com",
                        42
                )
        );
    }
}
