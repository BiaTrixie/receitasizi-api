package br.com.receitasiziapi.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Ingredient")
public class IngredientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME_INGREDIENT", length = 100,  nullable = false)
    private String name;

    @Column(name = "UNIT", length = 100)
    private String unit; 

    @Column(name = "QUANTITY")
    private double quantity;

}

