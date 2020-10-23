package com.zhaochengzhen.learn.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@JsonPropertyOrder({"content", "title"})
public class Article {
    //@JsonIgnore
    private long id;
    //@JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Reader> reader;
}
