package com.jeep.repository;

import com.jeep.model.Song;

import java.util.List;

public interface ISongRepository {
    void create(Song song);

    List<Song> findAll();

    Song findById(int id);

    void update(Song song);

    void delete(int id);
}
