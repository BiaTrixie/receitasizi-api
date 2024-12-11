package br.com.receitasiziapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.receitasiziapi.dto.CuisineDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.CuisineRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CuisineService implements IService<CuisineDto, Integer> {
    
    final CuisineRepository cuisineRepository;

    public CuisineService(CuisineRepository cuisineRepository) {
        this.cuisineRepository = cuisineRepository;
    }

     /**
     * Esse método cria uma nova cozinha(culinaria).
     *
     * @param entity Objeto CuisineDto contendo os dados da cozinha a ser criado.
     * @return Retorna o UserDto criado.
     */
    @Override
    public CuisineDto create(CuisineDto entity) {
        log.info("CuisineService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de uma cozinha específica com base no ID fornecido.
     *
     * @param id ID da cozinha a ser retornado.
     * @return Retorna o CuisineDto correspondente ao ID fornecido.
     */
    @Override
    public CuisineDto read(Integer id) {
        log.info("CusineService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todas as cozinhas.
     *
     * @return Retorna uma lista de CuisineDto contendo todas as cozinhas.
     */
    @Override
    public List<CuisineDto> read() {
        log.info("CusineService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de uma cozinha existente com base no ID fornecido.
     *
     * @param id ID da cozinha a ser atualizado.
     * @param entity Objeto CuisineDto contendo os novos dados da cozinha.
     * @return Retorna o CuisineDto atualizado.
     */
    @Override
    public CuisineDto update(Integer id, CuisineDto entity) {
        log.info("CusineService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui uma cozinha específico com base no ID fornecido.
     *
     * @param id ID da cozinha a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("CusineService::delete(id)");
    }                                
}