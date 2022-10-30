package com.example.backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Setter
@ToString

@Document(collection="Post")
public class Post {
    @Id
    private int id;
    private String Caption;
    private String Category;
    private String ImageUrl;

}
