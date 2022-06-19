package com.jeep.model;

public class Song {
    private String songName;
    private String singer;
    private String musicType;
    private String songUrl;

    public Song() {
    }

    public Song(String songName, String singer, String musicType, String songUrl) {
        this.songName = songName;
        this.singer = singer;
        this.musicType = musicType;
        this.songUrl = songUrl;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}
