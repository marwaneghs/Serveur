package fr.efrei.server.web.rest;

import fr.efrei.server.domain.Student;
import fr.efrei.server.repository.StudentRepository;
import fr.efrei.server.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(
        locations = "classpath:application-test.properties")
public class StudentResourceIT {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Test
    @Transactional
    void findAllReturnsAllStudentsInTheRepository() {
        int databaseSizeBeforeCreate = studentRepository.findAll().size();
        Student student = new Student();
        student.setName("Pierre");
        studentRepository.save(student);

        List<Student> studentList = studentService.findAll();
        assertThat(studentList).hasSize(databaseSizeBeforeCreate + 1);
    }
}
