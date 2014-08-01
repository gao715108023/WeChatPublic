package com.gcj.course.message.req;

/**
 * 图片消息
 * Created by gaochuanjun on 14-8-1.
 */
public class ImageMessage extends BaseMessage{
    // 图片链接
    private String picUrl;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
