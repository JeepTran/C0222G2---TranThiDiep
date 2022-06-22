package com.jeep.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String songName;
    private String singer;
    private String musicType;
    private String songUrl;

    public Song() {
    }

    public Song(int id, String songName, String singer, String musicType, String songUrl) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.musicType = musicType;
        this.songUrl = songUrl;
    }

    public Song(String songName, String singer, String musicType, String songUrl) {
        this.songName = songName;
        this.singer = singer;
        this.musicType = musicType;
        this.songUrl = songUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
