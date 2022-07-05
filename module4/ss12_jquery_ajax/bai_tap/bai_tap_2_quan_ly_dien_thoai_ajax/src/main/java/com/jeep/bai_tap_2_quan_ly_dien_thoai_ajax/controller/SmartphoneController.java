package com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.controller;

import com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.model.Smartphone;
import com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
@CrossOrigin
public class SmartphoneController {
    @Autowired
    public ISmartphoneService smartphoneService;

    @PostMapping("/create")
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<Smartphone>> allPhones() {
        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Smartphone> findSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneEdit = smartphoneService.findById(id);
        if (!smartphoneEdit.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphoneEdit.get(),HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Smartphone> editSmartphone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.OK);
    }


}
