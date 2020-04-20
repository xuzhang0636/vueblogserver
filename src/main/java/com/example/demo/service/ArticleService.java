package com.example.demo.service;

import com.example.demo.model.Article;
import org.apache.ibatis.annotations.Param;


public interface ArticleService {
    void createArticle(@Param("article") Article article);
}
