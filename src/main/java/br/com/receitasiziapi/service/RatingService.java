package br.com.receitasiziapi.service;

import br.com.receitasiziapi.dto.RatingDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.RatingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RatingService implements IService<RatingDto, Integer> {

    final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

     /**
     * Esse método cria uma nova avaliação.
     *
     * @param entity Objeto RatingDto contendo os dados da avaliação a ser criada.
     * @return Retorna o RatingDto criado.
     */
    @Override
    public RatingDto create(RatingDto entity) {
        log.info("RatingService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de uma avaliação em específico com base no ID fornecido.
     *
     * @param id ID da avaliação a ser retornada.
     * @return Retorna o RatingDto correspondente ao ID fornecido.
     */
    @Override
    public RatingDto read(Integer id) {
        log.info("RatingService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todas as avaliações
     *
     * @return Retorna uma lista de RatingDto contendo todas as avaliações.
     */
    @Override
    public List<RatingDto> read() {
        log.info("RatingService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de uma avaliação existente com base no ID fornecido.
     *
     * @param id ID da avaliação a ser atualizado.
     * @param entity Objeto RatingDto contendo os novos dados da avaliação.
     * @return Retorna o RatingDto atualizado.
     */
    @Override
    public RatingDto update(Integer id, RatingDto entity) {
        log.info("RatingService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui uma avaliação específico com base no ID fornecido.
     *
     * @param id ID da avaliação a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("RatingService::delete(id)");
    }
}