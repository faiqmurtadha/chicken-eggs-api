package com.example.chickenEggs.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEggRequest {
    
    private Integer eggsQuantity;
    private Double eggPrice;
}
