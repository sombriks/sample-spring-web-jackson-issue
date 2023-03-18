package io.github.sombriks.sample.controller;

import io.github.sombriks.sample.model.BookDocument;
import io.github.sombriks.sample.model.FaultyDocument;
import io.github.sombriks.sample.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService service;
    @GetMapping
    public List<BookDocument> listBooks(){
        return service.list();
    }

    @PostMapping
    public BookDocument saveBook(@RequestBody BookDocument book) {
        return service.save(book);
    }

    @PostMapping("faulty")
    public void faultyMapping(@RequestBody FaultyDocument faulty) {
        System.out.println(faulty);
    }
}
