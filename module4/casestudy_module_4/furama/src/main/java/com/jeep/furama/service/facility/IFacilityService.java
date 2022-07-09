package com.jeep.furama.service.facility;

import com.jeep.furama.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAllFacilityByKeyword(String keyword, Pageable pageable);

    Facility save(Facility facility);

    Optional<Facility> findFacilityById(int id);

    void deleteFacilityById(int id);
}
