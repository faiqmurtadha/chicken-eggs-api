package com.example.chickenEggs.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EggResponse {
    
    private List<EggResponseDto> eggs;
    private Double totalPrice;
}
