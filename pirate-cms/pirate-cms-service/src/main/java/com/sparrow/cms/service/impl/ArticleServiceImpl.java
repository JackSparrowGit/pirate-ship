package com.sparrow.cms.service.impl;

import com.sparrow.cms.domain.bean.Article;
import com.sparrow.cms.repository.ArticleRepository;
import com.sparrow.cms.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/8/8 16:10
 * @Describe:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
