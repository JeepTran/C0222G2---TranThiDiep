package com.jeep.service;

import com.jeep.model.Song;

import java.util.List;

public interface ISongService {
    public void create(Song song);

    public List<Song> findAll();

    public Song findById(int id);

    public void update(Song song);

    public void delete(int id);
}
