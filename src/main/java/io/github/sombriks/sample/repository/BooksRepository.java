package io.github.sombriks.sample.repository;

import io.github.sombriks.sample.model.BookDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<BookDocument, String> {
}
