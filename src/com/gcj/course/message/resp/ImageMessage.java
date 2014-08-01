package com.gcj.course.message.resp;

/**
 * 图片消息
 * Created by gaochuanjun on 14-7-31.
 */
public class ImageMessage extends BaseMessage {

    // 图片
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
