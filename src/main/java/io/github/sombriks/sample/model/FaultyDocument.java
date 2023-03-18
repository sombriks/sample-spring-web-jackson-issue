package io.github.sombriks.sample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class FaultyDocument {

    @Id
    private String id;

    private Byte shouldBeABoolean;
}
