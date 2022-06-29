package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.repository;

import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ISongRepository extends JpaRepository<Song,Integer> {
    @Query(value = "select * from song where id = :id",nativeQuery = true)
    public Song findById(@Param("id") int id);
}
