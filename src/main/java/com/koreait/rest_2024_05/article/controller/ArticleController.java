package com.koreait.rest_2024_05.article.controller;

import com.koreait.rest_2024_05.article.entity.Article;
import com.koreait.rest_2024_05.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1", produces = APPLICATION_JSON_VALUE)
public class ArticleController {
  private final ArticleService articleService;

  @GetMapping("/articles")
  public List<Article> articleList(){
    return articleService.getArticles();
  }


}
