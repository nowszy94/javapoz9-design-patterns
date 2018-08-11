package com.sda.builder.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class DocumentLombok {
    private String title;
    private String description;
    private Instant creationDate;
    private String author;
    private List<String> items;
}
