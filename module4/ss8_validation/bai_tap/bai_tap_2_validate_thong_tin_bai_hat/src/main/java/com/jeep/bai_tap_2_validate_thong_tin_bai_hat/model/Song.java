package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String artist;
private String musicType;

    public Song() {
    }

    public Song(String name, String artist, String musicType) {
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public Song(Integer id, String name, String artist, String musicType) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }
}
