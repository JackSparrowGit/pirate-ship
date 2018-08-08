package com.sparrow.cms.domain.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author Jack
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 3931284279040211872L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "article_name", nullable = false, unique = true, length = 200)
    private String articleName;
    private String title;
    private String content;
    private String description;
    private String author;
    @Column(name = "view_count", nullable = false, length = 11, columnDefinition = "INTEGER DEFAULT 0")
    private Integer viewCount;
    @Column(name = "media_num", nullable = false, length = 11, columnDefinition = "INTEGER DEFAULT 0")
    private Integer mediaNum;
    @Column(name = "is_vip")
    private Boolean isVip;
    @Column(name = "comment", nullable = false, length = 11, columnDefinition = "INTEGER DEFAULT 0")
    private Integer comment;
    @Column(name = "is_top")
    private Boolean isTop;
    @Column(name = "is_hot")
    private Boolean isHot;
    @Column(name = "is_hide")
    private Boolean isHide;
    @Transient
    private String remark;
    @Column(name = "create_time", nullable = false, insertable = true)
    private Date createTime;
    @Column(name = "update_time", nullable = false, insertable = true, updatable = true)
    private Date updateTime;

}
