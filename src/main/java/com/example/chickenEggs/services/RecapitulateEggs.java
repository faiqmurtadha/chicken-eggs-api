package com.example.chickenEggs.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.chickenEggs.dto.response.EggResponse;
import com.example.chickenEggs.dto.response.EggResponseDto;
import com.example.chickenEggs.model.Eggs;
import com.example.chickenEggs.repository.EggsRepository;

@Service
public class RecapitulateEggs {
    
    @Autowired
    private EggsRepository eggsRepository;

    public ResponseEntity<EggResponse> getAllEggs() {
        try {
            List<Eggs> eggs = eggsRepository.findAll();
            List<EggResponseDto> eggData = eggs.stream().map(egg ->
                new EggResponseDto(
                    egg.getEggsQuantity(),
                    egg.getEggPrice()
                )
            ).collect(Collectors.toList());

            Double totalPrice = eggs.stream().mapToDouble(egg ->
                egg.getEggsQuantity() * egg.getEggPrice()
            ).sum();

            return ResponseEntity
                .ok()
                .body(new EggResponse(eggData, totalPrice));
        } catch (Exception e) {
            return ResponseEntity
                .internalServerError()
                .body(null);
        }
    }
}
