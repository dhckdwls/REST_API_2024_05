package com.koreait.rest_2024_05.article.repository;

import com.koreait.rest_2024_05.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article , Long>{

}





