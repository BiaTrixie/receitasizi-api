package br.com.receitasiziapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;

    private String username;

    private String email;

    private String password;

    private List<RecipeDto> favoriteRecipes;

    private List<RatingDto> ratings;

}
