package fr.efrei.server.service;

import fr.efrei.server.domain.Student;
import fr.efrei.server.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public final StudentRepository itemRepository;

    public ItemService(StudentRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Student> findAll() {
        return itemRepository.findAll();
    }
}
