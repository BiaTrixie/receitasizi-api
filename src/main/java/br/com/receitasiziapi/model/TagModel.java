package br.com.receitasiziapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tag")
public class TagModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TAG_NAME", nullable=false)
    private String name;

}
