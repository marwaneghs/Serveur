package fr.efrei.server.web.rest;

import fr.efrei.server.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(
        locations = "classpath:application-test.properties")
public class ItemResourceIT {
    @Autowired
    private StudentRepository studentRepository;

}
