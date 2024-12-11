package br.com.receitasiziapi.dto;

import java.util.List;

import lombok.Data;

@Data
public class RecipeDto {
    private Long id;
    private String name;
    private String description;
    private List<IngredientDto> ingredients;
    private List<String> steps;
    private int preparationTime;
    private CategoryDto category;
    private CuisineDto cuisine;
    private List<TagDto> tags;
    private List<RatingDto> ratings;
}