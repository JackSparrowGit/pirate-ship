package com.sparrow.cms.service;

import com.sparrow.cms.domain.bean.Article;
import com.sparrow.cms.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/8/8 16:18
 * @Describe:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceTests {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void test1() {
        List<Article> articleList = new ArrayList<>();
        Boolean flag = false;
        for (int i = 0; i < 10; i++) {
            Article article = new Article();
            article.setArticleName("aa" + i);
            article.setAuthor("jack" + i);
            article.setComment(new Random().nextInt() * 100);
            article.setContent(UUID.randomUUID().toString());
            article.setDescription(UUID.randomUUID().toString());
            article.setTitle(UUID.randomUUID().toString());
            article.setIsHide(flag);
            article.setIsHot(flag);
            article.setMediaNum(new Random().nextInt() * 50);
            article.setViewCount(new Random().nextInt() * 50);
            article.setCreateTime(new Date());
            article.setUpdateTime(new Date());
            articleList.add(article);
            flag = !flag;
        }
        Assert.assertNotNull(articleRepository.saveAll(articleList));
    }
}
