package br.com.receitasiziapi.repository;

import br.com.receitasiziapi.model.RecipeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeModel, Integer> {
    
}
