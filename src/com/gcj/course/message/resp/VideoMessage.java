package com.gcj.course.message.resp;

/**
 * 视频消息
 * Created by gaochuanjun on 14-7-31.
 */
public class VideoMessage extends BaseMessage {
    // 视频
    private Video video;

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
