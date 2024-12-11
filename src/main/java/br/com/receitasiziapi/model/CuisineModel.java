package br.com.receitasiziapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cuisine")
public class CuisineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME_CUISINE", length = 100)
    private String name;

    @Column(name = "DESC_CUISINE", length = 240)
    private String description;

}
