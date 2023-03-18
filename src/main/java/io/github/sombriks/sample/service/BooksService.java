package io.github.sombriks.sample.service;

import io.github.sombriks.sample.model.BookDocument;
import io.github.sombriks.sample.repository.BooksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BooksService {

    private final BooksRepository repository;

    public List<BookDocument> list(){
        return repository.findAll();
    }

    public BookDocument save(BookDocument book) {
        return repository.save(book);
    }
}
