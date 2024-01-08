package fr.efrei.server.service;

import fr.efrei.server.domain.Student;
import fr.efrei.server.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentService {

    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Student not found for this id: " + id));
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }


}
