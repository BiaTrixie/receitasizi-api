package br.com.receitasiziapi.dto;

import lombok.Data;

@Data
public class RatingDto {
    private Long id;
    private UserDto user;
    private RecipeDto recipe;
    private int score; // De 1 a 5
    private String comment;
}
