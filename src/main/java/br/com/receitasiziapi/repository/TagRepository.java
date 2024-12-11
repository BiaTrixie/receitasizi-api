package br.com.receitasiziapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.receitasiziapi.model.TagModel;

public interface TagRepository extends JpaRepository<TagModel, Integer>{
    
}
