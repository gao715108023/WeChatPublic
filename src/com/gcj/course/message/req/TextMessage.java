package com.gcj.course.message.req;

/**
 * Created by gaochuanjun on 14-8-1.
 */
public class TextMessage extends BaseMessage {
    // 消息内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
