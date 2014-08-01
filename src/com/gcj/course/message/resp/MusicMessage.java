package com.gcj.course.message.resp;

/**
 * 音乐消息
 * Created by gaochuanjun on 14-7-31.
 */
public class MusicMessage extends BaseMessage {

    // 音乐
    private Music music;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
