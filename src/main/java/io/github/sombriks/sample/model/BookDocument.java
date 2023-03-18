package io.github.sombriks.sample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BookDocument {

    @Id
    private String id;

    private String title;
}
