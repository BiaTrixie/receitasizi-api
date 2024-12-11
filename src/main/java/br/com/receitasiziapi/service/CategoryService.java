package br.com.receitasiziapi.service;

import br.com.receitasiziapi.dto.CategoryDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoryService implements IService<CategoryDto, Integer> {

    final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

     /**
     * Esse método cria uma nova categoria.
     *
     * @param entity Objeto CategoryDto contendo os dados da categoria a ser criada.
     * @return Retorna o CategoryDto criado.
     */
    @Override
    public CategoryDto create(CategoryDto entity) {
        log.info("CategoryService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de uma categoria em específico com base no ID fornecido.
     *
     * @param id ID da categoria a ser retornada.
     * @return Retorna o CategoryDto correspondente ao ID fornecido.
     */
    @Override
    public CategoryDto read(Integer id) {
        log.info("CategoryService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todas as categorias
     *
     * @return Retorna uma lista de CategoryDto contendo todas as categorias.
     */
    @Override
    public List<CategoryDto> read() {
        log.info("CategoryService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de uma categoria existente com base no ID fornecido.
     *
     * @param id ID da categoria a ser atualizado.
     * @param entity Objeto CategoryDto contendo os novos dados da categoria.
     * @return Retorna o CategoryDto atualizado.
     */
    @Override
    public CategoryDto update(Integer id, CategoryDto entity) {
        log.info("CategoryService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui uma categoria específico com base no ID fornecido.
     *
     * @param id ID da categoria a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("CategoryService::delete(id)");
    }
}