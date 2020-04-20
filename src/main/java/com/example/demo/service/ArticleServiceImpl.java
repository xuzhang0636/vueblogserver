package com.example.demo.service;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void createArticle(Article article) {
        articleMapper.createArticle(article);
    }
}
