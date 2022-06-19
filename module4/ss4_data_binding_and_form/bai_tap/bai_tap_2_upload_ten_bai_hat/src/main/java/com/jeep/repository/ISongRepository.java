package com.jeep.repository;

import com.jeep.model.Song;

import java.util.List;

public interface ISongRepository {
    void save(Song song);

    List<Song> getAll();
}
