package com.koreait.rest_2024_05.article.service;

import com.koreait.rest_2024_05.article.entity.Article;
import com.koreait.rest_2024_05.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
  private final ArticleRepository articleRepository;

  public List<Article> getArticles(){
    return articleRepository.findAll();
  }

  public void write(Long memberId,String title,String content){
    Article article = Article.builder()
        .memberId(memberId)
        .title(title)
        .content(content)
        .build();

    articleRepository.save(article);

  }


}
