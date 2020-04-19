package com.example.demo.model;

import lombok.Data;

@Data
public class Article {
    private Integer id;
    private String title;
    private String markdownContent;
    private String htmlContent;
}
