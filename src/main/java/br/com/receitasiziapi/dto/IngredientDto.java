package br.com.receitasiziapi.dto;

import lombok.Data;

@Data
public class IngredientDto {
    private Long id;
    private String name;
    private String unit; 
    private double quantity;
}

