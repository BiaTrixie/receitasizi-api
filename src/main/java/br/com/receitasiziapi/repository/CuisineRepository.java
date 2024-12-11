package br.com.receitasiziapi.repository;

import br.com.receitasiziapi.model.CuisineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepository extends JpaRepository<CuisineModel, Integer> {

} 