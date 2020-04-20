package com.example.demo.mapper;

import com.example.demo.model.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleMapperTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void smokeTest() {
        Article article = new Article();
        article.setHtmlContent("test");
        article.setMarkdownContent("test");
        article.setTitle("test");
        articleMapper.createArticle(article);
    }
}
