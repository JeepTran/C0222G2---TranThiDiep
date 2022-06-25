package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.service;

import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    Song save(Song song);
}
