package com.sparrow.cms.web.controller;

import com.sparrow.cms.domain.bean.Article;
import com.sparrow.cms.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/8/8 16:12
 * @Describe:
 */
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> findAll() {
        return articleService.findAll();
    }
}
