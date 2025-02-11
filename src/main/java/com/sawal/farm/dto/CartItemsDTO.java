package com.sawal.farm.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CartItemsDTO {
    private Long id;
    private Long productId;
    @Positive
    private Integer quantity;
}
