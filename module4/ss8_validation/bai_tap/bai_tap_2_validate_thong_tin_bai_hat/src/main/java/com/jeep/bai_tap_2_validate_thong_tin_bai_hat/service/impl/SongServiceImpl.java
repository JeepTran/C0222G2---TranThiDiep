package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.service.impl;

import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.model.Song;
import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.repository.ISongRepository;
import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song save(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id);
    }
}
