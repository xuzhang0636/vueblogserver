package com.example.demo.mapper;

import com.example.demo.model.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleMapper {
    @Insert("insert into article(title,markdown_content,html_content) values(#{article.title},#{article.markdownContent},#{article.htmlContent})")
    void createArticle(@Param("article") Article article);

}
