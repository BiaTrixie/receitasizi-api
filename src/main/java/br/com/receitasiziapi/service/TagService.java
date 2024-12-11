package br.com.receitasiziapi.service;

import br.com.receitasiziapi.dto.TagDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TagService implements IService<TagDto, Integer> {

    final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

     /**
     * Esse método cria uma nova tag.
     *
     * @param entity Objeto TagDto contendo os dados da tag a ser criada.
     * @return Retorna o TagDto criado.
     */
    @Override
    public TagDto create(TagDto entity) {
        log.info("TagService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de uma tag em específico com base no ID fornecido.
     *
     * @param id ID da tag a ser retornada.
     * @return Retorna o TagDto correspondente ao ID fornecido.
     */
    @Override
    public TagDto read(Integer id) {
        log.info("TagService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todas as tags
     *
     * @return Retorna uma lista de TagDto contendo todas as tags.
     */
    @Override
    public List<TagDto> read() {
        log.info("TagService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de uma tag existente com base no ID fornecido.
     *
     * @param id ID do tag a ser atualizado.
     * @param entity Objeto TagDto contendo os novos dados da tag.
     * @return Retorna o TagDto atualizado.
     */
    @Override
    public TagDto update(Integer id, TagDto entity) {
        log.info("TagService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui uma tag específico com base no ID fornecido.
     *
     * @param id ID da tag a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("TagService::delete(id)");
    }
}