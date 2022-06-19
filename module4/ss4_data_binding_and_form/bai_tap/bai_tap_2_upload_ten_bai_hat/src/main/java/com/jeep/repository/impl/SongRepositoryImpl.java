package com.jeep.repository.impl;

import com.jeep.model.Song;
import com.jeep.repository.ISongRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepositoryImpl implements ISongRepository {
     static List<Song> songList = new ArrayList<>();

    static {
        songList.add(new Song("Let It Be", "The Beatles", "Pop", "https://www.youtube.com/watch?v=v7wErmth4k4"));
        songList.add(new Song("You Raise Me Up", "Westlife", "Pop", "https://www.youtube.com/watch?v=9bxc9hbwkkw"));
        songList.add(new Song("Monkey Dance", "Tones and I", "Dance", "https://www.youtube.com/watch?v=q0hyYWKXF0Q"));
        songList.add(new Song("Despacito", "Luis Fonsi", "Rock", "https://www.youtube.com/watch?v=kJQP7kiw5Fk"));
    }

    @Override
    public void save(Song song) {
        songList.add(song);
    }

    @Override
    public List<Song> getAll() {
        return songList;
    }
}
