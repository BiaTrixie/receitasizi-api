package br.com.receitasiziapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "RATING")
public class RatingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USER", nullable = false)
    private UserModel user;

    @ManyToOne
    @JoinColumn(name = "ID_RECIPE", nullable = false)
    private RecipeModel recipe;

    @Column(name = "SCORE", nullable = false)
    private int score; // Valor de 1 a 5

    @Column(name = "COMMENT", length = 240)
    private String comment;

    // Getters e Setters (ou use Lombok com @Data)
}
