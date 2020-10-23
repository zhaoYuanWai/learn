package com.zhaochengzhen.learn.controller;

import com.zhaochengzhen.learn.entity.AjaxResponse;
import com.zhaochengzhen.learn.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        Article article = Article.builder()
                .id(id)
                .author("zhaochengzhen")
                .content("赵成桢的文章")
                .createTime(new Date())
                .title("t1").build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article,
                                    @RequestHeader String aaa) {
        log.info("article:" + article);
        log.info("header:aaa" + aaa);
        return AjaxResponse.success();
    }

    @PostMapping("/articles2")
    public AjaxResponse saveArticle(@RequestParam String author,
                                    @RequestParam String title,
                                    @RequestParam String content,
                                    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                    @RequestParam Date createTime) {

        log.info("@RequestParam:");
        log.info("saveArticle:" + createTime);
        return AjaxResponse.success();
    }


}
