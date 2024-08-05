package com.example.chickenEggs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chickenEggs.dto.request.CreateEggRequest;
import com.example.chickenEggs.dto.response.EggResponse;
import com.example.chickenEggs.services.EggsService;
import com.example.chickenEggs.services.RecapitulateEggs;

@RestController
@RequestMapping("egg-management")
public class EggsController {
    
    @Autowired
    private EggsService eggsService;

    @Autowired
    private RecapitulateEggs recapitulateEggs;

    @GetMapping("/eggs")
    public ResponseEntity<EggResponse> getEggs() {
        return recapitulateEggs.getAllEggs();
    }

    @PostMapping("/eggs")
    public ResponseEntity<?> createEggs(@RequestBody CreateEggRequest request) {
        return eggsService.create(request);
    }
}
