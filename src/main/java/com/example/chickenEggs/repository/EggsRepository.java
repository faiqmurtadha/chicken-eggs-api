package com.example.chickenEggs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.chickenEggs.model.Eggs;

@Repository
public class EggsRepository {
    
    private List<Eggs> eggs = new ArrayList<>();

    public List<Eggs> findAll() {
        return eggs;
    }

    public Eggs save(Eggs egg) {
        eggs.add(egg);
        return egg;
    }
}
