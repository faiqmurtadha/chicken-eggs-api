package com.example.chickenEggs.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EggResponseDto {
    
    private Integer eggsQuantity;
    private Double eggPrice;
}
