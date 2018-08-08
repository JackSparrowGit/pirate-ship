package com.sparrow.cms.service;

import com.sparrow.cms.domain.bean.Article;

import java.util.List;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/8/8 16:06
 * @Describe:
 */
public interface ArticleService {

    List<Article> findAll();
}
