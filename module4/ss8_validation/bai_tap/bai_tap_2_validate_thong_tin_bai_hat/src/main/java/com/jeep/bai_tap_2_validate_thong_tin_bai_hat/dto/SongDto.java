package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {
    private Integer id;
//    @NotEmpty(message = "not empty")
    @NotBlank(message = "Song name should not be empty or blank!")
    @Size(max = 800, message = "Maximum 800 characters.")
    @Pattern(regexp = "[A-Za-z0-9 ]*", message = "Do not contain special characters.")
    private String name;

//    @NotEmpty(message = "Enter artist!")
    @NotBlank(message = "Artist should not be empty or blank!")
    @Size(max = 300, message = "Maximum 300 characters.")
    @Pattern(regexp = "[A-Za-z0-9 ]*", message = "Do not contain special characters.")
    private String artist;

//    @NotEmpty(message = "Enter music type!")
    @NotBlank(message = "Music type should not be empty or blank!")
    @Size(max = 1000, message = "Maximum 1000 characters.")
    @Pattern(regexp = "[A-Za-z0-9, ]*",message = "Do not contain special characters (except for comma).")
    private String musicType;


    public SongDto() {
    }

    public SongDto(String name, String artist, String musicType) {
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public SongDto(Integer id, String name, String artist, String musicType) {
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
