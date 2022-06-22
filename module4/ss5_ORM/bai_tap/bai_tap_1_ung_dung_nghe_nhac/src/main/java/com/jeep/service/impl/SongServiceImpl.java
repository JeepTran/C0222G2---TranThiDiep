package com.jeep.service.impl;

import com.jeep.model.Song;
import com.jeep.repository.ISongRepository;
import com.jeep.repository.impl.SongRepositoryImpl;
import com.jeep.service.ISongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    private ISongRepository songRepository = new SongRepositoryImpl();

    @Override
    public void create(Song song) {
        songRepository.create(song);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id);
    }

    @Override
    public void update(Song song) {
        songRepository.update(song);
    }

    @Override
    public void delete(int id) {
        songRepository.delete(id);
    }
}
