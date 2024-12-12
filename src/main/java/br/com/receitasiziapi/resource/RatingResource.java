package br.com.receitasiziapi.resource;

import br.com.receitasiziapi.dto.RatingDto;
import br.com.receitasiziapi.interfaces.IResource;
import br.com.receitasiziapi.service.RatingService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/rating" )
@Tag(name = "rating", description = "Documentação relacionada a resource(recurso) rating")
public class RatingResource implements IResource<RatingDto, Integer> {

    final RatingService ratingService;

    public RatingResource(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    /**
     * Mètodo para criar T
     *
     * @param entity
     * @return
     */
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201",
                    content = { @Content(schema = @Schema(implementation = UserResource.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    public RatingDto create(@RequestBody RatingDto entity) {
        log.info("RatingResource::iniciado");
        log.debug("Valores: {}", entity);

        return ratingService.create(entity);
    }

    /**
     * Método para consultar T baseado no identificador N informado
     *
     * @param id
     * @return
     */
    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public RatingDto get(@PathVariable Integer id) {
        log.info("RatingResource::get(id)");
        log.debug("Valores: {}", id);

        return ratingService.read(id);
    }

    /**
     * Retorna uma lista de T
     *
     * @return
     */
    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<RatingDto> get() {
        log.info("RatingResource::get");
        log.debug("Valores: sem parâmetro");

        return ratingService.read();
    }

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     *
     * @param id
     * @param entity
     * @return
     */
    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public RatingDto update(
            @PathVariable Integer id,
            @RequestBody RatingDto entity) {

        log.info("RatingResource::update");
        log.debug("Valores: {} e {}", id, entity);

        return ratingService.update(id, entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("RatingResource::delete");
        log.debug("Valores: {}", id, id);

        ratingService.delete(id);

    }
}