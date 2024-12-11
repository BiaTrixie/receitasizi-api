package br.com.receitasiziapi.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "RECIPE")
public class RecipeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME_RECIPE", length = 100, nullable = false)
    private String name;

    @Column(name = "DESC_RECIPE", length = 240, nullable = false)
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "RECIPE_ID")
    private List<IngredientModel> ingredients;

    @ElementCollection
    @CollectionTable(name = "RECIPE_STEPS", joinColumns = @JoinColumn(name = "RECIPE_ID"))
    @Column(name = "STEP")
    private List<String> steps;

    @Column(name = "PREP_TIME", nullable = false)
    private int preparationTime;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORY", nullable = false)
    private CategoryModel category;

    @ManyToOne
    @JoinColumn(name = "ID_CUISINE", nullable = false)
    private CuisineModel cuisine;

    @ManyToMany
    @JoinTable(
        name = "RECIPE_TAGS",
        joinColumns = @JoinColumn(name = "RECIPE_ID"),
        inverseJoinColumns = @JoinColumn(name = "TAG_ID")
    )
    private List<TagModel> tags;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "RECIPE_ID")
    private List<RatingModel> ratings;

    // Getters e Setters (ou use Lombok com @Data)
}
