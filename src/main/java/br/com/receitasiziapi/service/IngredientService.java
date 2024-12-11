package br.com.receitasiziapi.service;

import br.com.receitasiziapi.dto.IngredientDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class IngredientService implements IService<IngredientDto, Integer> {

    final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

     /**
     * Esse método cria um novo ingrediente.
     *
     * @param entity Objeto IngredientDto contendo os dados do ingrediente a ser criado.
     * @return Retorna o IngredientDto criado.
     */
    @Override
    public IngredientDto create(IngredientDto entity) {
        log.info("IngredientService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de um ingrediente em específico com base no ID fornecido.
     *
     * @param id ID do ingrediente a ser retornada.
     * @return Retorna o IngredientDto correspondente ao ID fornecido.
     */
    @Override
    public IngredientDto read(Integer id) {
        log.info("IngredientService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todos os ingredientes
     *
     * @return Retorna uma lista de IngredientDto contendo todos os ingredientes.
     */
    @Override
    public List<IngredientDto> read() {
        log.info("IngredientService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de um ingrediente existente com base no ID fornecido.
     *
     * @param id ID do ingrediente a ser atualizado.
     * @param entity Objeto IngredientDto contendo os novos dados do ingrediente.
     * @return Retorna o IngredientDto atualizado.
     */
    @Override
    public IngredientDto update(Integer id, IngredientDto entity) {
        log.info("IngredientService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui um ingrediente específico com base no ID fornecido.
     *
     * @param id ID do ingrediente a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("IngredientService::delete(id)");
    }
}