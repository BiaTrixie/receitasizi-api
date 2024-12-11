package br.com.receitasiziapi.service;

import br.com.receitasiziapi.dto.RecipeDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RecipeService implements IService<RecipeDto, Integer> {

    final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

     /**
     * Esse método cria uma nova receita.
     *
     * @param entity Objeto RecipeDto contendo os dados da receita a ser criada.
     * @return Retorna o RecipeDto criado.
     */
    @Override
    public RecipeDto create(RecipeDto entity) {
        log.info("RecipeService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de uma receita específica com base no ID fornecido.
     *
     * @param id ID da receita a ser retornada.
     * @return Retorna o UserDto correspondente ao ID fornecido.
     */
    @Override
    public RecipeDto read(Integer id) {
        log.info("RecipeService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todas as receitas.
     *
     * @return Retorna uma lista de RecipeDto contendo todas as receitas.
     */
    @Override
    public List<RecipeDto> read() {
        log.info("RecipeService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de uma receita existente com base no ID fornecido.
     *
     * @param id ID da receita a ser atualizado.
     * @param entity Objeto RecipeDto contendo os novos dados da Nova receita.
     * @return Retorna a RecipeDto atualizado.
     */
    @Override
    public RecipeDto update(Integer id, RecipeDto entity) {
        log.info("RecipeService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui uma Receita específico com base no ID fornecido.
     *
     * @param id ID da Receita a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("RecipeService::delete(id)");
    }
}