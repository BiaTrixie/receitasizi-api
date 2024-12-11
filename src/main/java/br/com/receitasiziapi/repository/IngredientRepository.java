package br.com.receitasiziapi.repository;

import br.com.receitasiziapi.model.IngredientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<IngredientModel, Integer> {

    
} 