package fr.efrei.server.web.rest;

import fr.efrei.server.domain.Student;
import fr.efrei.server.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemResource {

    public final ItemService itemService;

    public ItemResource(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public List<Student> getAllItems() {
        return itemService.findAll();
    }

    @GetMapping("/items/{id}")
    public Student getItem(@PathVariable String id) {
//        log.debug("REST request to get Item : {}", id);
        Student item =new Student();
        item.setName("Pierre");
        return item;
    }
}
