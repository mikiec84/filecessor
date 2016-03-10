package com.lazyants.filecessor.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
@Document(collection = "photo")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Photo {

    @Id @JsonProperty
    private String id;

    private List<String> colors;

    @CreatedDate
    @Field("created_at")
    private Date createdAt = new Date();

    private String extension;

    @Field("content_size")
    private long contentSize;

    private String filename;

    private Exif exif;

    private String fixtures;
}
