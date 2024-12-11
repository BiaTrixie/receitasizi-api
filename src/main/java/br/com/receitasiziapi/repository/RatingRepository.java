package br.com.receitasiziapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.receitasiziapi.model.RatingModel;

public interface RatingRepository extends JpaRepository<RatingModel, Integer>{
    
}
