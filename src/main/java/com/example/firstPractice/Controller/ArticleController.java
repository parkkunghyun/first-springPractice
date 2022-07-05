package com.example.firstPractice.Controller;

import com.example.firstPractice.dto.ArticleForm;
import com.example.firstPractice.entity.Article;
import com.example.firstPractice.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticle(){
        return "articles/news";
    }

    @PostMapping("/articles/create")
    public String create(ArticleForm form){
        System.out.println(form.toString());
        Article article = form.toEntity();
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
