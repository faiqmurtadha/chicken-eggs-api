package com.example.chickenEggs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.chickenEggs.dto.request.CreateEggRequest;
import com.example.chickenEggs.model.Eggs;
import com.example.chickenEggs.repository.EggsRepository;

import jakarta.transaction.Transactional;

@Service
public class EggsService {
    
    @Autowired
    private EggsRepository eggsRepository;

    @Transactional
    public ResponseEntity<?> create(CreateEggRequest request) {
        Eggs eggs = Eggs.builder()
            .eggsQuantity(request.getEggsQuantity())
            .eggPrice(request.getEggPrice())
            .build();

        eggsRepository.save(eggs);

        return ResponseEntity
            .ok()
            .body("Data telur ayam berhasil disimpan");
    }
}
