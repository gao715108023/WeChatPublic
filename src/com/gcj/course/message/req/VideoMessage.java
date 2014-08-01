package com.gcj.course.message.req;

/**
 * 视频消息
 * Created by gaochuanjun on 14-8-1.
 */
public class VideoMessage extends BaseMessage {
    // 视频消息媒体id
    private String mediaId;
    // 视频消息缩略图的媒体id
    private String thumbMediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }
}
