package br.com.receitasiziapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.receitasiziapi.model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer>{
    
}
