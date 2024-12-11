package br.com.receitasiziapi.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "APP_USER") 
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USERNAME", nullable = false, length = 100)
    private String username;

    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;

    @ManyToMany
    @JoinTable(
        name = "USER_FAVORITE_RECIPES",
        joinColumns = @JoinColumn(name = "USER_ID"),
        inverseJoinColumns = @JoinColumn(name = "RECIPE_ID")
    )
    private List<RecipeModel> favoriteRecipes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RatingModel> ratings;

}
