package com.sda.builder;

import com.sda.builder.model.Document;
import com.sda.builder.model.DocumentLombok;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        //builder
        //all args constructor
        Document documentByConstructor = new Document(
                "Plan dnia",
                "Opis dnia szkoleniowego",
                Instant.now(),
                "Szymon Nowak",
                Arrays.asList("dlugopis", "zeszyt", "laptop")
        );

        //setters
        Document documentBySetters = new Document();
        documentBySetters.setTitle("Plan tygodnia");
        documentBySetters.setDescription("Lorem ipsum");
        documentBySetters.setAuthor("Jan Kowalski");
        documentBySetters.setCreationDate(Instant.now());
        documentBySetters.setItems(Arrays.asList("ala", "ma", "kota"));


        //builder
        List<String> defaultItems = Arrays.asList("blabla", "abd");
        Document documentByBuilder = Document.builder()
                .title("Plan zajec")
                .description("lorem ipsumfdsfds")
                .creationDate(Instant.now())
                .items(defaultItems)
                .item("abc")
                .item("def")
                .author("Szymon Nowak")
                .build();
        Document documentWithCustomTitle = Document.builder()
                .title("my custom title")
                .build();

        new Document(documentByBuilder.getTitle(), documentByBuilder.getDescription(),
                documentByBuilder.getCreationDate(), "Jan Kowalski", documentByBuilder.getItems());

        Document jan_kowalski = Document.builder(documentByBuilder)
                .author("Jan Kowalski")
                .build();

        DocumentLombok build = DocumentLombok.builder()
                .author("Szymon Nowak")
                .description("lorem ipsum")
                .build();
    }
}
