package com.jeep.service;

import com.jeep.model.Song;

import java.util.List;

public interface ISongService {
    void save(Song song);

    List<Song> getAll();
}
