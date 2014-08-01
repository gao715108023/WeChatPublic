package com.gcj.course.message.resp;

/**
 * 语音消息
 * Created by gaochuanjun on 14-7-31.
 */
public class VoiceMessage extends BaseMessage {
    // 语音
    private Voice voice;

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }
}
