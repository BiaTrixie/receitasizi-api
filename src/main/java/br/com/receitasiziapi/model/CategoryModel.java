package br.com.receitasiziapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Category")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME_CATEGORY", length = 100,  nullable = false)
    private String name;

    @Column(name = "DESC_CATEGORY", length = 240)
    private String description;

}
