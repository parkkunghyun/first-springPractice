package com.example.firstPractice.repository;

import com.example.firstPractice.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> {
}
