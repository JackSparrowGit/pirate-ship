package com.sparrow.cms.repository;

import com.sparrow.cms.domain.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/8/8 16:03
 * @Describe:
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
