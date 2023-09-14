package com.example.jpastudent01.config;

import com.example.jpastudent01.models.Student;
import com.example.jpastudent01.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student newStudent = new Student();
        newStudent.setNavn("Hjordt");
        newStudent.setBornDate(LocalDate.of(1998, 6, 2));
        newStudent.setBornTime(LocalTime.of(11, 11, 11));

        studentRepository.save(newStudent);
    }
}
