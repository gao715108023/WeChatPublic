package com.gcj.course.message.req;

/**
 * 语音消息
 * Created by gaochuanjun on 14-8-1.
 */
public class VoiceMessage extends BaseMessage {
    // 媒体ID
    private String mediaId;
    // 语音格式
    private String format;
    // 语音识别结果，UTF8编码
    private String recognition;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }
}
