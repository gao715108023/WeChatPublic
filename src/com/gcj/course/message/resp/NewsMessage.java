package com.gcj.course.message.resp;

import java.util.List;

/**
 * 文本消息
 * Created by gaochuanjun on 14-7-31.
 */
public class NewsMessage extends BaseMessage {

    // 图文消息个数，限制为10条以内
    private int articleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Article> articles;

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
