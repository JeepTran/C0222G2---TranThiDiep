package com.jeep.service.impl;

import com.jeep.model.Song;
import com.jeep.repository.ISongRepository;
import com.jeep.repository.impl.SongRepositoryImpl;
import com.jeep.service.ISongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    private static ISongRepository songRepository = new SongRepositoryImpl();


    @Override
    public void save(Song song){
        songRepository.save(song);
    }

    @Override
    public List<Song> getAll() {
        return songRepository.getAll();
    }
}
