package com.example.demo.controller;

import com.example.demo.model.Article;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ArticleController {
    @PostMapping("/article")
    public void createArticle(@RequestBody Article article) {

    }
}
